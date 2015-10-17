/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package org.nd4j.linalg.jcublas.kernel;


import jcuda.utils.KernelLauncher;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.regex.Pattern;


/**
 * Kernel function loader:
 *
 * @author Adam Gibson
 */
public class KernelFunctionLoader {

    public final static String NAME_SPACE = "org.nd4j.linalg.jcuda.jcublas";
    public final static String DOUBLE = NAME_SPACE + ".double.functions";
    public final static String FLOAT = NAME_SPACE + ".float.functions";
    public final static String IMPORTS_FLOAT = NAME_SPACE + ".float.imports";
    public final static String IMPORTS_DOUBLE = NAME_SPACE + ".double.imports";
    public final static String CACHE_COMPILED = NAME_SPACE + ".cache_compiled";
    private Map<String,String> paths = new HashMap<>();
    private static Logger log = LoggerFactory.getLogger(KernelFunctionLoader.class);
    private static KernelFunctionLoader INSTANCE;
    private static Map<String,KernelLauncher> launchers = new HashMap<>();
    private boolean init = false;

    private KernelFunctionLoader() {}

    /**
     * Singleton pattern
     *
     * @return
     */
    public static synchronized KernelFunctionLoader getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new KernelFunctionLoader();
            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                @Override
                public void run() {
                    INSTANCE.unload();
                }
            }));
            try {
                INSTANCE.load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return INSTANCE;
    }

    private static String dataFolder(DataBuffer.Type type) {
        return "/kernels/" + (type == DataBuffer.Type.FLOAT ? "float" : "double");
    }


    /**
     * Get the launcher for a function
     * @param functionName the function to get the launcher for
     * @param dataType the data type to launch with
     * @return the launcher for the given
     * function and data type
     */
    public  static KernelLauncher launcher(String functionName,String dataType) {
        return KernelFunctionLoader.getInstance().get(functionName,dataType);
    }


    /**
     * Returns whether the function has a kernel or not
     * @param functionName the name of the function
     * @return true if the function has a kernel
     * false othr wise
     */
    public boolean exists(String functionName) {
        return get(functionName,"double") != null || get(functionName,"float") != null;
    }


    /**
     * Gets a kernel launcher
     * for a given function name and data type
     * @param functionName the name of the function
     * @param dataType the data type to get
     * @return the kernel launcher for the
     * given function
     */
    public KernelLauncher get(String functionName,String dataType) {
        String name = functionName + "_" + dataType;

        KernelLauncher launcher = launchers.get(name);
        if(launcher == null) {
            name = functionName + "_strided" + "_" + dataType;
            launcher = launchers.get(name);
            if(launcher == null)
                return null;
        }
        return launcher;
    }


    /**
     * Clean up all the modules
     */
    public void unload() {
        init = false;
    }



    /**
     * Load the appropriate functions from the class
     * path in to one module
     *
     * @return the module associated with this
     * @throws Exception
     */
    public void load() throws Exception {
        if (init)
            return;
        StringBuffer sb = new StringBuffer();
        sb.append("nvcc -g -G -ptx");

        ClassPathResource res = new ClassPathResource("/cudafunctions.properties", KernelFunctionLoader.class.getClassLoader());
        if (!res.exists())
            throw new IllegalStateException("Please put a cudafunctions.properties in your class path");
        Properties props = new Properties();
        props.load(res.getInputStream());
        log.info("Registering cuda functions...");
        //ensure imports for each file before compiling
        compileAndLoad(props, FLOAT, "float");

        init = true;
    }

    /**
     * The extension of the given file name is replaced with "ptx".
     * If the file with the resulting name does not exist, it is
     * compiled from the given file using NVCC. The name of the
     * PTX file is returned.
     * <p/>
     * <p/>
     * Note that you may run in to an error akin to:
     * Unsupported GCC version
     * <p/>
     * At your own risk, comment the lines under:
     * /usr/local/cuda-$VERSION/include/host_config.h
     * <p/>
     * #if defined(__GNUC__)
     * <p/>
     * if __GNUC__ > 4 || (__GNUC__ == 4 && __GNUC_MINOR__ > 8)
     * #error -- unsupported GNU version! gcc 4.9 and up are not supported!
     * <p/>
     * #endif /* __GNUC__> 4 || (__GNUC__ == 4 && __GNUC_MINOR__ > 8)
     * <p/>
     * #endif  __GNUC__
     * <p/>
     * This will allow you to bypass the compiler restrictions. Again, do so at your own risk.
     *
     * @return The name of the PTX file
     * @throws IOException If an I/O error occurs
     */
    private void compileAndLoad(Properties props, String key, String dataType) throws IOException {
        compileAndLoad(props, key, dataType,0);
    }

    /**
     * The extension of the given file name is replaced with "ptx".
     * If the file with the resulting name does not exist, it is
     * compiled from the given file using NVCC. The name of the
     * PTX file is returned.
     * <p/>
     * <p/>
     * Note that you may run in to an error akin to:
     * Unsupported GCC version
     * <p/>
     * At your own risk, comment the lines under:
     * /usr/local/cuda-$VERSION/include/host_config.h
     * <p/>
     * #if defined(__GNUC__)
     * <p/>
     * if __GNUC__ > 4 || (__GNUC__ == 4 && __GNUC_MINOR__ > 8)
     * #error -- unsupported GNU version! gcc 4.9 and up are not supported!
     * <p/>
     * #endif /* __GNUC__> 4 || (__GNUC__ == 4 && __GNUC_MINOR__ > 8)
     * <p/>
     * #endif  __GNUC__
     * <p/>
     * This will allow you to bypass the compiler restrictions. Again, do so at your own risk.
     *
     * @return The name of the PTX file
     * @throws IOException If an I/O error occurs
     */
    private void compileAndLoad(Properties props, String key, String dataType,int compiledAttempts) throws IOException {
        String f = props.getProperty(key);
        StringBuffer sb = new StringBuffer();
        sb.append("nvcc -g -G -lineinfo ");
        sb.append(" --include-path ");
        String tmpDir = System.getProperty("java.io.tmpdir");
        StringBuffer dir = new StringBuffer();
        boolean cache = Boolean.parseBoolean(props.getProperty(CACHE_COMPILED, String.valueOf("true")));
        sb.append(tmpDir)
                .append(File.separator)
                .append("kernels")
                .append(File.separator).append(dataType).append(File.separator)
                .toString();
        String kernelPath = dir.append(tmpDir)
                .append(File.separator)
                .append("nd4j-kernels")
                .append(File.separator)
                .toString();
        boolean shouldCompile = true;
        if(cache) {
            File tmpDir2 = new File(tmpDir + File.separator + "nd4j-kernels");
            if(tmpDir2.exists()) {
                shouldCompile = cache && !tmpDir2.exists() || compiledAttempts > 0;
            }
        }

        String[] split = f.split(",");

        if(shouldCompile) {
            Set<String> resources = new Reflections("org.nd4j.nd4j-kernels", new ResourcesScanner()).getResources(Pattern.compile(".*"));
            for(String resource : resources) {
                extract(resource);
                System.out.println(resource);
            }

            File outputDir = new File(System.getProperty("java.io.tmpdir") + File.separator + "nd4j-kernels","output");
            outputDir.mkdirs();
            String[] commands = {"bash","-c","make && /usr/bin/make install"};
            ProcessBuilder probuilder = new ProcessBuilder(commands);
            //You can set up your work directory
            probuilder.directory(new File("/tmp/nd4j-kernels"));

            Process process = probuilder.start();
            //Read out dir output
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            System.out.printf("Output of running %s is:\n",
                    Arrays.toString(commands));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            try {
                int tid = process.waitFor();
                BufferedInputStream bis = new BufferedInputStream(is);
                List<String> list = IOUtils.readLines(bis, "UTF-8");
                for(String item : list) {
                    System.out.println(item);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("After resource");


        }

        else {
            log.info("Modules appear to already be compiled..attempting to use cache");

            for (String module : split) {
                log.info("Is cached: " + module);
                String path = kernelPath + module + ".ptx";
                String name = module + "_" + dataType;
                paths.put(name,path);

            }
        }

        try {
            for (String module : split) {
                log.info("Loading " + module);
                String path = kernelPath + "output" + File.separator+  module + ".cubin";
                String name = module + "_" + dataType;
                paths.put(name,path);
                KernelLauncher launch = KernelLauncher.load(path, name);
                launchers.put(name, launch);
            }
        }catch (Exception e) {
            e.printStackTrace();
            if(!shouldCompile && compiledAttempts < 3) {
                log.warn("Error loading modules...attempting recompile");
                props.setProperty(CACHE_COMPILED,String.valueOf(true));
                compileAndLoad(props, key, dataType,compiledAttempts + 1);
            }
            else
                throw new RuntimeException(e);
        }

    }

    //extract the source file

    /**
     * Extract the resource ot the specified
     * absolute path
     *
     * @param file     the file

     * @throws IOException
     */
    public String extract(String file) throws IOException {
        String tmpDir = System.getProperty("java.io.tmpdir");
        String[] split = file.split("/");
        //minus the first 2 and the last entry for the parent directory path
        String[] newArray = new String[split.length - 2];
        for(int i = 0,j = 2; j < split.length; i++,j++) {
            newArray[i] = split[j];
        }

        String split2 = StringUtils.join(newArray,"/");
        File dataDir = new File(tmpDir,split2);
        if (!dataDir.getParentFile().exists())
            dataDir.mkdirs();


        return loadFile(file,dataDir);

    }



    private String loadFile(String file,File dataDir) throws IOException {
        ClassPathResource resource = new ClassPathResource(file, KernelFunctionLoader.class.getClassLoader());

        if (!resource.exists())
            throw new IllegalStateException("Unable to find file " + resource);
        File out = dataDir;
        if (!out.getParentFile().exists())
            out.getParentFile().mkdirs();
        if (out.exists())
            out.delete();
        out.createNewFile();
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(out));
        IOUtils.copy(resource.getInputStream(), bos);
        bos.flush();
        bos.close();

        out.deleteOnExit();
        return out.getAbsolutePath();

    }


}
