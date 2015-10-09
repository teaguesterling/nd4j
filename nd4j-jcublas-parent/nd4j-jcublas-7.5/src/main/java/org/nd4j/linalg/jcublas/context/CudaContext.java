package org.nd4j.linalg.jcublas.context;

import jcuda.Pointer;
import jcuda.driver.CUstream;
import jcuda.driver.CUstream_flags;
import jcuda.driver.JCudaDriver;
import jcuda.jcublas.JCublas2;
import jcuda.jcublas.cublasHandle;
import jcuda.runtime.JCuda;
import jcuda.runtime.cudaStream_t;
import lombok.Data;

/**
 * A higher level class for handling
 * the different primitives around the cuda apis
 * This being:
 * streams (both old and new) as well as
 * the cublas handles.
 *
 *
 */
@Data
public class CudaContext implements AutoCloseable {
    private CUstream stream;
    private cudaStream_t oldStream;
    private cublasHandle handle;
    private Pointer resultPointer;

    public CudaContext() {
        ContextHolder.getInstance().setContext();
    }

    /**
     * Synchronizes on the new
     * stream
     */
    public void syncStream() {
        JCudaDriver.cuStreamSynchronize(stream);
    }

    /**
     * Synchronizes
     * on the old stream
     */
    public void syncOldStream() {
        JCuda.cudaStreamSynchronize(oldStream);
    }

    /**
     * Synchrnonizes on
     * the old stream
     * since the given handle
     * will be associated with the
     * stream for this context
     */
    public void syncHandle() {
        syncOldStream();
    }


    /**
     * Associates
     * the handle on this context
     * to the given stream
     */
    public void associateHandle() {
        JCublas2.cublasSetStream(handle, oldStream);
    }

    /**
     * Initializes the stream
     */
    public void initStream() {
        if(stream == null) {
            try {
                stream = ContextHolder.getInstance().getStreamPool().borrowObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * Initializes the old stream
     */
    public void initOldStream() {
        if(oldStream == null)  {
            try {
                oldStream = ContextHolder.getInstance().getOldStreamPool().borrowObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


    /**
     * Initializes a handle and
     * associates with the given stream.
     * initOldStream() should be called first
     *
     */
    public void initHandle() {
        if(handle == null) {
            try {
                handle = ContextHolder.getInstance().getHandlePool().borrowObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
            associateHandle();
        }

    }

    /**
     * Destroys the context
     * and associated resources
     */
    public void destroy() {
        if(handle != null) {
            try {
                ContextHolder.getInstance().getHandlePool().returnObject(handle);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //JCublas2.cublasDestroy(handle);
        }
        if(stream != null) {
            try {
                ContextHolder.getInstance().getStreamPool().returnObject(stream);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //  JCudaDriver.cuStreamDestroy(stream);
        }
        if(oldStream != null) {
            try {
                ContextHolder.getInstance().getOldStreamPool().returnObject(oldStream);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //JCuda.cudaStreamDestroy(oldStream);
        }
    }


    /**
     * Finishes a blas operation
     * and destroys this context
     */
    public void finishBlasOperation() {
        destroy();
    }

    /**
     * Sets up a context with an old stream
     * and a blas handle
     * @return the cuda context
     * as setup for cublas usage
     */
    public static CudaContext getBlasContext() {
        CudaContext ctx = new CudaContext();
        ctx.initOldStream();
        ctx.initHandle();
        return ctx;
    }


    public void syncDevice() {
        JCuda.cudaDeviceSynchronize();
    }

    @Override
    public void close() throws Exception {
        destroy();
    }
}
