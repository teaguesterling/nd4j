package org.nd4j.paramserver.pistachio.pb.processor;

interface EventProcessor {
    public boolean processEvent(byte[] event);
}
