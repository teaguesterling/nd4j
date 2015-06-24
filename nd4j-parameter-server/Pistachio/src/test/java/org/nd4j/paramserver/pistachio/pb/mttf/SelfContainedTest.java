package org.nd4j.paramserver.pistachio.pb.mttf;

import org.junit.Test;
import org.nd4j.paramserver.pistachio.pb.kafka.embedded.EmbeddedKafka;

/**
 * @author Adam Gibson
 */
public class SelfContainedTest {
    @Test
    public void testStart() throws Exception {
        final EmbeddedKafka kafka = new EmbeddedKafka();
        new Thread(new Runnable() {
            @Override
            public void run() {
                kafka.start();
            }
        }).start();



    }


}