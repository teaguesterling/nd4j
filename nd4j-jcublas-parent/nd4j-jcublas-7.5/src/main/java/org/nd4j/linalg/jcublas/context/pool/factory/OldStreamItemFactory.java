package org.nd4j.linalg.jcublas.context.pool.factory;

import jcuda.runtime.JCuda;
import jcuda.runtime.cudaStream_t;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

/**
 * Created by agibsonccc on 10/8/15.
 */
public class OldStreamItemFactory extends BasePooledObjectFactory<cudaStream_t> {
    @Override
    public cudaStream_t create() throws Exception {
        cudaStream_t  oldStream = new cudaStream_t();
        JCuda.cudaStreamCreate(oldStream);
        return oldStream;
    }

    @Override
    public PooledObject<cudaStream_t> wrap(cudaStream_t cudaStream_t) {
        return new DefaultPooledObject<>(cudaStream_t);
    }

    @Override
    public void destroyObject(PooledObject<cudaStream_t> p) throws Exception {
        super.destroyObject(p);
        JCuda.cudaStreamDestroy(p.getObject());
    }
}
