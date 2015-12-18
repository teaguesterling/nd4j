package org.nd4j.linalg.api.parallel.tasks.cpu.transform;

import io.netty.buffer.ByteBuf;
import org.nd4j.linalg.api.buffer.DataBuffer;
import org.nd4j.linalg.api.ops.TransformOp;
import org.nd4j.linalg.api.parallel.tasks.cpu.BaseCPUAction;

public class CPUTransformOpAction extends BaseCPUTransformOpAction {

    public CPUTransformOpAction(TransformOp op, int threshold){
        super(op,threshold);
    }
    

    @Override
    public Void call() {

        int thisIdx = splitCount.getAndIncrement();
        while(thisIdx < maxSplits ) {
            final int startIdx = thisIdx * threshold;
            final int endIdx = (thisIdx == maxSplits - 1 ? n : startIdx + threshold);  //End index, exclusive

            doOp(startIdx,endIdx,offsetX,offsetY,offsetZ);

            //For task completion:
            latch.countDown();

            thisIdx = splitCount.getAndIncrement();
        }

        return null;
    }
}
