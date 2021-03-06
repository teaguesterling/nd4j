package org.nd4j.linalg.jcublas.blas;

import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import org.nd4j.jita.allocator.Allocator;
import org.nd4j.jita.allocator.impl.AtomicAllocator;
import org.nd4j.jita.allocator.pointers.cuda.cublasHandle_t;
import org.nd4j.linalg.api.blas.impl.BaseLevel1;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.complex.IComplexDouble;
import org.nd4j.linalg.api.complex.IComplexFloat;
import org.nd4j.linalg.api.complex.IComplexNDArray;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.impl.accum.ASum;
import org.nd4j.linalg.api.ops.impl.accum.Dot;
import org.nd4j.linalg.api.ops.impl.transforms.arithmetic.Axpy;
import org.nd4j.linalg.factory.DataTypeValidation;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.jcublas.CublasPointer;
import org.nd4j.linalg.jcublas.context.ContextHolder;
import org.nd4j.linalg.jcublas.context.CudaContext;
import org.nd4j.linalg.jcublas.ops.executioner.JCudaExecutioner;
import org.nd4j.nativeblas.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Adam Gibson
 */
public class JcublasLevel1 extends BaseLevel1 {
    private Allocator allocator = AtomicAllocator.getInstance();
    private Nd4jBlas nd4jBlas = new Nd4jBlas();
    private NativeOps nativeOps = NativeOpsHolder.getInstance().getDeviceNativeOps();
    private static Logger logger = LoggerFactory.getLogger(JcublasLevel1.class);

    @Override
    protected float sdsdot(int N, float alpha, INDArray X, int incX, INDArray Y, int incY) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected double dsdot(int N, INDArray X, int incX, INDArray Y, int incY) {
        throw new UnsupportedOperationException();
    }


    @Override
    protected float hdot(int N, INDArray X, int incX, INDArray Y, int incY) {
        DataTypeValidation.assertSameDataType(X, Y);
//        CudaContext ctx = allocator.getFlowController().prepareAction(null, X, Y);

        float ret = 1f;

//        CublasPointer xCPointer = new CublasPointer(X, ctx);
//        CublasPointer yCPointer = new CublasPointer(Y, ctx);

        Dot dot = new Dot(X, Y);
        Nd4j.getExecutioner().exec(dot);

        ret = dot.getFinalResult().floatValue();
/*
        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            long result = nativeOps.setBlasStream(handle, ctx.getOldStream());
            if (result == 0)
                throw new IllegalStateException("cublasSetStream failed");

            ret = nd4jBlas.sdot(new PointerPointer(new Pointer[] {handle}),
                    N,
                    xCPointer.getDevicePointer(),
                    incX,
                    yCPointer.getDevicePointer(),
                    incY);
        }
        */

//        allocator.registerAction(ctx, null, X, Y);

        return ret;
    }


    @Override
    protected float sdot(int N, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT dot called");

        DataTypeValidation.assertSameDataType(X, Y);
        CudaContext ctx = allocator.getFlowController().prepareAction(null, X, Y);

        float ret = 1f;

        CublasPointer xCPointer = new CublasPointer(X, ctx);
        CublasPointer yCPointer = new CublasPointer(Y, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            long result = nativeOps.setBlasStream(handle, ctx.getOldStream());
            if (result == 0)
                throw new IllegalStateException("cublasSetStream failed");

            ret = nd4jBlas.sdot(new PointerPointer(new Pointer[] {handle}),
                    N,
                    xCPointer.getDevicePointer(),
                    incX,
                    yCPointer.getDevicePointer(),
                    incY);
        }

        allocator.registerAction(ctx, null, X, Y);

        return ret;
    }

    @Override
    protected float hdot( int N, DataBuffer X, int offsetX, int incX, DataBuffer Y,  int offsetY, int incY){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected float sdot( int N, DataBuffer X, int offsetX, int incX, DataBuffer Y,  int offsetY, int incY){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected double ddot(int N, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.DOUBLE)
            logger.warn("DOUBLE dot called");

        double ret;
        CudaContext ctx = allocator.getFlowController().prepareAction(null, X, Y);

        CublasPointer xCPointer = new CublasPointer(X, ctx);
        CublasPointer yCPointer = new CublasPointer(Y, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            ret = nd4jBlas.ddot(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    xCPointer.getDevicePointer(),
                    incX,
                    yCPointer.getDevicePointer(),
                    incY);
        }

        allocator.registerAction(ctx, null, X, Y);

        return ret;
    }

    @Override
    protected double ddot( int N, DataBuffer X, int offsetX, int incX, DataBuffer Y,  int offsetY, int incY){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected void cdotu_sub(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY, IComplexNDArray dotu) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void cdotc_sub(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY, IComplexNDArray dotc) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void zdotu_sub(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY, IComplexNDArray dotu) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void zdotc_sub(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY, IComplexNDArray dotc) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected float snrm2(int N, INDArray X, int incX) {
        if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT nrm2 called");


        CudaContext ctx = allocator.getFlowController().prepareAction(null, X);
        float ret;

        CublasPointer cAPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            ret = nd4jBlas.snrm2(new PointerPointer(new Pointer[] {ctx.getHandle()})
                    , N,
                    cAPointer.getDevicePointer(),
                    incX);
        }

        allocator.registerAction(ctx, null, X);

        return ret;
    }

    @Override
    protected float hasum(int N, INDArray X, int incX) {

        ASum asum = new ASum(X);
        Nd4j.getExecutioner().exec(asum, Integer.MAX_VALUE);

        float ret = asum.getFinalResult().floatValue();

        return ret;
    }

    @Override
    protected float sasum(int N, INDArray X, int incX) {
        ASum asum = new ASum(X);
        Nd4j.getExecutioner().exec(asum, Integer.MAX_VALUE);

        float ret = asum.getFinalResult().floatValue();

        return ret;

  /*      if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT asum called");


        CudaContext ctx = allocator.getFlowController().prepareAction(null, X);
        float ret;

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            ret = nd4jBlas.sasum(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N, xCPointer.getDevicePointer(),
                    incX);
        }

        allocator.registerAction(ctx, null, X);

        return ret;
        */
    }

    @Override
    protected float hasum(int N, DataBuffer X, int offsetX, int incX){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected float sasum(int N, DataBuffer X, int offsetX, int incX){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected double dnrm2(int N, INDArray X, int incX) {
        if (Nd4j.dataType() != DataBuffer.Type.DOUBLE)
            logger.warn("DOUBLE nrm2 called");

        double ret;

        CudaContext ctx = allocator.getFlowController().prepareAction(null, X);

        CublasPointer cAPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            ret = nd4jBlas.dnrm2(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    cAPointer.getDevicePointer(),
                    incX);
        }

        allocator.registerAction(ctx, null, X);

        return ret;
    }

    @Override
    protected double dasum(int N, INDArray X, int incX) {
        ASum asum = new ASum(X);
        Nd4j.getExecutioner().exec(asum, Integer.MAX_VALUE);

        double ret = asum.getFinalResult().doubleValue();

        return ret;
        /*CudaContext ctx = allocator.getFlowController().prepareAction(null, X);
        double ret;

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            ret = nd4jBlas.dasum(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    xCPointer.getDevicePointer(),
                    incX);
        }
        allocator.registerAction(ctx, null, X);

        return ret;
        */
    }

    @Override
    protected double dasum(int N, DataBuffer X, int offsetX, int incX){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected float scnrm2(int N, IComplexNDArray X, int incX) {
        /*
        CudaContext ctx = CudaContext.getBlasContext();
        float[] ret = new float[1];
        Pointer result = Pointer.to(ret);

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            JCublas2.cublasScnrm2(
                    ContextHolder.getInstance().getHandle()
                    , N
                    , xCPointer.getDevicePointer()
                    , incX
                    , result);
        }

        return ret[0];
        */
        throw new UnsupportedOperationException();
    }

    @Override
    protected float scasum(int N, IComplexNDArray X, int incX) {
        /*
        CudaContext ctx = CudaContext.getBlasContext();
        float[] ret = new float[1];
        Pointer result = Pointer.to(ret);

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            JCublas2.cublasScasum(
                    ctx.getHandle()
                    , N
                    , xCPointer.getDevicePointer()
                    , incX
                    , result);
        }
        return ret[0];
        */
        throw new UnsupportedOperationException();
    }

    @Override
    protected double dznrm2(int N, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected double dzasum(int N, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected int isamax(int N, INDArray X, int incX) {
        if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT iamax called");


        CudaContext ctx = allocator.getFlowController().prepareAction(null, X);
        int ret2;

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            ret2 = nd4jBlas.isamax(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    xCPointer.getDevicePointer(),
                    incX);

        }
        allocator.registerAction(ctx, null, X);

        return  ret2 - 1;
    }

    @Override
    protected int isamax(int N, DataBuffer X, int offsetX, int incX){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected int idamax(int N, INDArray X, int incX) {
        if (Nd4j.dataType() != DataBuffer.Type.DOUBLE)
            logger.warn("DOUBLE imax called");

        CudaContext ctx = allocator.getFlowController().prepareAction(null, X);
        int ret2;

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            ret2 = nd4jBlas.idamax(new PointerPointer(new Pointer[] {ctx.getHandle()})
                    , N,
                    xCPointer.getDevicePointer(),
                    incX);

        }

        allocator.registerAction(ctx, null, X);

        return  ret2 - 1 ;
    }

    @Override
    protected int idamax(int N, DataBuffer X, int offsetX, int incX){
        throw new UnsupportedOperationException("not yet implemented");
    }


    @Override
    protected int icamax(int N, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected int izamax(int N, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void sswap(int N, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT swap called");


        CudaContext ctx = allocator.getFlowController().prepareAction(Y, X);

        CublasPointer xCPointer = new CublasPointer(X, ctx);
        CublasPointer yCPointer = new CublasPointer(Y, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            nd4jBlas.sswap(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N, xCPointer.getDevicePointer(),
                    incX,
                    yCPointer.getDevicePointer(),
                    incY);
        }

        allocator.registerAction(ctx, Y, X);
    }

    @Override
    protected void scopy(int N, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT copy called");


        CudaContext ctx = allocator.getFlowController().prepareAction(Y, X);

        CublasPointer xCPointer = new CublasPointer(X, ctx);
        CublasPointer yCPointer = new CublasPointer(Y, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            nd4jBlas.scopy(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    xCPointer.getDevicePointer(),
                    incX,
                    yCPointer.getDevicePointer(),
                    incY);
        }

        allocator.registerAction(ctx, Y, X);
    }

    @Override
    protected void scopy(int n, DataBuffer x, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY ){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected void saxpy(int N, float alpha, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT axpy called");


        CudaContext ctx = allocator.getFlowController().prepareAction(Y, X);

//        CublasPointer xAPointer = new CublasPointer(X, ctx);
//        CublasPointer xBPointer = new CublasPointer(Y, ctx);

//        cublasHandle_t handle = ctx.getHandle();

        ((JCudaExecutioner) Nd4j.getExecutioner()).exec(new Axpy(X, Y, alpha));

/*        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            PointerPointer p = new PointerPointer(new Pointer[] {ctx.getHandle()});
            nd4jBlas.saxpy(p,
                    N,
                    alpha,
                    xAPointer.getDevicePointer(),
                    incX,
                    xBPointer.getDevicePointer(),
                    incY);
        }
*/
        allocator.registerAction(ctx, Y, X);
    }

    @Override
    protected void haxpy(int N, float alpha, INDArray X, int incX, INDArray Y, int incY) {
        CudaContext ctx = allocator.getFlowController().prepareAction(Y, X);

//        CublasPointer xAPointer = new CublasPointer(X, ctx);
//        CublasPointer xBPointer = new CublasPointer(Y, ctx);

//        cublasHandle_t handle = ctx.getHandle();

        ((JCudaExecutioner) Nd4j.getExecutioner()).exec(new Axpy(X, Y, alpha));

/*        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            PointerPointer p = new PointerPointer(new Pointer[] {ctx.getHandle()});
            nd4jBlas.saxpy(p,
                    N,
                    alpha,
                    xAPointer.getDevicePointer(),
                    incX,
                    xBPointer.getDevicePointer(),
                    incY);
        }
*/
        allocator.registerAction(ctx, Y, X);
    }

    @Override
    protected void haxpy( int N, float alpha, DataBuffer x, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY ){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected void saxpy( int N, float alpha, DataBuffer x, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY ){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected void dswap(int N, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.DOUBLE)
            logger.warn("DOUBLE swap called");

        CudaContext ctx = allocator.getFlowController().prepareAction(Y, X);

        CublasPointer xCPointer = new CublasPointer(X, ctx);
        CublasPointer yCPointer = new CublasPointer(Y, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            nd4jBlas.dswap(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    xCPointer.getDevicePointer(),
                    incX,
                    yCPointer.getDevicePointer(),
                    incY);
        }

        allocator.registerAction(ctx, Y, X);
    }

    @Override
    protected void dcopy(int N, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.DOUBLE)
            logger.warn("DOUBLE copy called");

        CudaContext ctx = allocator.getFlowController().prepareAction(Y, X);

        CublasPointer xCPointer = new CublasPointer(X, ctx);
        CublasPointer yCPointer = new CublasPointer(Y, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            nd4jBlas.dcopy(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N, xCPointer.getDevicePointer(),
                    incX,
                    yCPointer.getDevicePointer(),
                    incY);
        }

        allocator.registerAction(ctx, Y, X);
    }

    @Override
    protected void dcopy(int n, DataBuffer x, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY ){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected void daxpy(int N, double alpha, INDArray X, int incX, INDArray Y, int incY) {
        if (Nd4j.dataType() != DataBuffer.Type.DOUBLE)
            logger.warn("DOUBLE axpy called");

        CudaContext ctx = allocator.getFlowController().prepareAction(Y, X);

        CublasPointer xAPointer = new CublasPointer(X, ctx);
        CublasPointer xBPointer = new CublasPointer(Y, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            nd4jBlas.daxpy(new PointerPointer(new Pointer[] {ctx.getHandle()})
                    , N, alpha, xAPointer.getDevicePointer(),
                    incX, xBPointer.getDevicePointer(),
                    incY);
        }

        allocator.registerAction(ctx, Y, X);
    }

    @Override
    protected void daxpy( int N, double alpha, DataBuffer x, int offsetX, int incrX, DataBuffer y, int offsetY, int incrY ){
        throw new UnsupportedOperationException("not yet implemented");
    }

    @Override
    protected void cswap(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void ccopy(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void caxpy(int N, IComplexFloat alpha, IComplexNDArray X, int incX, IComplexNDArray Y, int incY) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void zswap(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void zcopy(int N, IComplexNDArray X, int incX, IComplexNDArray Y, int incY) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void zaxpy(int N, IComplexDouble alpha, IComplexNDArray X, int incX, IComplexNDArray Y, int incY) {
        throw new UnsupportedOperationException();


    }

    @Override
    protected void srotg(float a, float b, float c, float s) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void srotmg(float d1, float d2, float b1, float b2, INDArray P) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void srot(int N, INDArray X, int incX, INDArray Y, int incY, float c, float s) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void srotm(int N, INDArray X, int incX, INDArray Y, int incY, INDArray P) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void drotg(double a, double b, double c, double s) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void drotmg(double d1, double d2, double b1, double b2, INDArray P) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void drot(int N, INDArray X, int incX, INDArray Y, int incY, double c, double s) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void drotm(int N, INDArray X, int incX, INDArray Y, int incY, INDArray P) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void sscal(int N, float alpha, INDArray X, int incX) {
        if (Nd4j.dataType() != DataBuffer.Type.FLOAT)
            logger.warn("FLOAT scal called");


        CudaContext ctx = allocator.getFlowController().prepareAction(X);

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            nd4jBlas.sscal(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    alpha,
                    xCPointer.getDevicePointer(),
                    incX);
        }

        allocator.registerAction(ctx, X);
    }

    @Override
    protected void dscal(int N, double alpha, INDArray X, int incX) {
        if (Nd4j.dataType() != DataBuffer.Type.DOUBLE)
            logger.warn("DOUBLE scal called");

        CudaContext ctx = allocator.getFlowController().prepareAction(X);

        CublasPointer xCPointer = new CublasPointer(X, ctx);

        cublasHandle_t handle = ctx.getHandle();
        synchronized (handle) {
            nativeOps.setBlasStream(handle, ctx.getOldStream());

            nd4jBlas.dscal(new PointerPointer(new Pointer[] {ctx.getHandle()}),
                    N,
                    alpha,
                    xCPointer.getDevicePointer(),
                    incX);
        }

        allocator.registerAction(ctx, X);
    }

    @Override
    protected void cscal(int N, IComplexFloat alpha, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void zscal(int N, IComplexDouble alpha, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();


    }

    @Override
    protected void csscal(int N, float alpha, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();

    }

    @Override
    protected void zdscal(int N, double alpha, IComplexNDArray X, int incX) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean supportsDataBufferL1Ops() {
        return false;
    }
}
