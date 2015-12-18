package org.nd4j.linalg.api.parallel.tasks.cpu.scalar;

import io.netty.buffer.ByteBuf;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.ops.ScalarOp;
import org.nd4j.linalg.api.parallel.tasks.Task;
import org.nd4j.linalg.api.parallel.tasks.TaskExecutorProvider;

import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class CPUScalarOpAction extends BaseCPUScalarOpAction {

    /**
     * Constructor for operating on subset of NDArray
     */
    public CPUScalarOpAction(ScalarOp op, int threshold, int n, int offsetX, int offsetZ, int incrX, int incrZ) {
        super(op, threshold, n, offsetX, offsetZ, incrX, incrZ);
    }

    /**
     * Constructor for doing task on entire NDArray
     */
    public CPUScalarOpAction(ScalarOp op, int threshold) {
        super(op, threshold);
    }

    /**
     * Constructor for doing a 1d tensor first
     */
//    public CPUScalarOpAction(ScalarOp op, int threshold, int tadIdx, int tadDim) {
//        super(op, threshold, tadIdx, tadDim);
//    }

    @Override
    public Void call() {


        DataBuffer x = op.x().data();
        DataBuffer z = op.z().data();

        int thisIdx = splitCount.getAndIncrement();
        while(thisIdx < maxSplits ) {

            //Task: Z = Op(X)
            if (x.allocationMode() == DataBuffer.AllocationMode.HEAP) {

                final int startIdx = thisIdx * threshold;
                final int endIdx = (thisIdx == maxSplits - 1 ? n : startIdx + threshold);  //End index, exclusive

                //Heap allocation (float[] or double[])
                if (x.dataType() == DataBuffer.Type.FLOAT) {
                    float[] xf = (float[]) x.array();
                    if (incrX == 1 && (x == z || incrZ == 1)) {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i++) {
                                int xIdx = offsetX + i;
                                xf[xIdx] = op.op(xf[xIdx]);
                            }
                        } else {
                            float[] zf = (float[]) z.array();
                            for (int i = startIdx; i < endIdx; i++) {
                                zf[offsetZ + i] = op.op(xf[offsetX + i]);
                            }
                        }
                    } else {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i++) {
                                int xIdx = offsetX + i * incrX;
                                xf[xIdx] = op.op(xf[xIdx]);
                            }
                        } else {
                            float[] zf = (float[]) z.array();
                            for (int i = startIdx; i < endIdx; i++) {
                                zf[offsetZ + i * incrZ] = op.op(xf[offsetX + i * incrX]);
                            }
                        }
                    }
                } else {
                    double[] xd = (double[]) x.array();
                    if (incrX == 1 && incrZ == 1) {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i++) {
                                int xIdx = offsetX + i;
                                xd[xIdx] = op.op(xd[xIdx]);
                            }
                        } else {
                            double[] zd = (double[]) z.array();
                            for (int i = startIdx; i < endIdx; i++) {
                                zd[offsetZ + i] = op.op(xd[offsetX + i]);
                            }
                        }
                    } else {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i++) {
                                int xIdx = offsetX + i * incrX;
                                xd[xIdx] = op.op(xd[xIdx]);
                            }
                        } else {
                            double[] zd = (double[]) z.array();
                            for (int i = startIdx; i < endIdx; i++) {
                                zd[offsetZ + i * incrZ] = op.op(xd[offsetX + i * incrX]);
                            }
                        }
                    }
                }
            } else {
                //Direct allocation (FloatBuffer / DoubleBuffer backed by a Netty ByteBuf)
                ByteBuf nbbx = x.asNetty();
                ByteBuf nbbz = z.asNetty();
                if (x.dataType() == DataBuffer.Type.FLOAT) {

                    final int startIdx = thisIdx * threshold * 4;
                    final int endIdx = (thisIdx == maxSplits - 1 ? n : startIdx + threshold) * 4;  //End index, exclusive

                    int byteOffsetX = 4 * offsetX;
                    int byteOffsetZ = 4 * offsetZ;
                    if (incrX == 1 && (x == z || incrZ == 1)) {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i += 4) {
                                int xbIdx = byteOffsetX + i;
                                nbbx.setFloat(xbIdx, op.op(nbbx.getFloat(xbIdx)));
                            }
                        } else {
                            for (int i = startIdx; i < endIdx; i += 4) {
                                nbbz.setFloat(byteOffsetZ + i, op.op(nbbx.getFloat(byteOffsetX + i)));
                            }
                        }
                    } else {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i += 4) {
                                int xbIdx = byteOffsetX + i * incrX;
                                nbbx.setFloat(xbIdx, op.op(nbbx.getFloat(xbIdx)));
                            }
                        } else {
                            for (int i = startIdx; i < endIdx; i += 4) {
                                nbbz.setFloat(byteOffsetZ + i * incrZ, op.op(nbbx.getFloat(byteOffsetX + i * incrX)));
                            }
                        }
                    }
                } else {

                    final int startIdx = thisIdx * threshold * 8;
                    final int endIdx = (thisIdx == maxSplits - 1 ? n : startIdx + threshold) * 8;  //End index, exclusive

                    int byteOffsetX = 8 * offsetX;
                    int byteOffsetZ = 8 * offsetZ;
                    if (incrX == 1 && (x == z || incrZ == 1)) {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i += 8) {
                                int xbIdx = byteOffsetX + i;
                                nbbx.setDouble(xbIdx, op.op(nbbx.getDouble(xbIdx)));
                            }
                        } else {
                            for (int i = startIdx; i < endIdx; i += 8) {
                                nbbz.setDouble(byteOffsetZ + i, op.op(nbbx.getDouble(byteOffsetX + i)));
                            }
                        }
                    } else {
                        if (x == z) {
                            for (int i = startIdx; i < endIdx; i += 8) {
                                int xbIdx = byteOffsetX + i * incrX;
                                nbbx.setDouble(xbIdx, op.op(nbbx.getDouble(xbIdx)));
                            }
                        } else {
                            for (int i = startIdx; i < endIdx; i += 8) {
                                nbbz.setDouble(byteOffsetZ + i * incrZ, op.op(nbbx.getDouble(byteOffsetX + i * incrX)));
                            }
                        }
                    }
                }
            }

            //For task completion:
            latch.countDown();

            thisIdx = splitCount.getAndIncrement();
        }

        return null;
    }
}
