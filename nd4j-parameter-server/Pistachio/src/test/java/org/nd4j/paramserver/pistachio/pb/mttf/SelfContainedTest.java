package org.nd4j.paramserver.pistachio.pb.mttf;

import kafka.javaapi.FetchRequest;
import kafka.javaapi.consumer.SimpleConsumer;
import kafka.javaapi.producer.Producer;
import kafka.message.Message;
import kafka.producer.ProducerConfig;
import kafka.server.KafkaConfig;
import kafka.server.KafkaServer;
import org.junit.Test;
import org.testng.internal.Utils;

import java.util.Properties;

/**
 * @author Adam Gibson
 */
public class SelfContainedTest {
    @Test
    public void testStart() throws Exception {
        Properties props = new Properties();
        props.setProperty("hostname", "localhost");
        props.setProperty("port", "9090");
        props.setProperty("brokerid", "1");
        props.setProperty("log.dir", "/tmp/embeddedkafka/");
        props.setProperty("enable.zookeeper", "false");

        final KafkaServer server = new KafkaServer(new KafkaConfig(props),null);
        server.startup();

        Properties prodProps = new Properties();
        prodProps.setProperty("producer.type", "async");
        prodProps.setProperty("queue.time", "2000");
        prodProps.setProperty("queue.size", "100");
        prodProps.setProperty("batch.size", "10");
        prodProps.setProperty("broker.list", "1:localhost:9090");

        ProducerConfig prodConfig = new ProducerConfig(prodProps);
        final Producer<String,Message> prod = (new Producer<>(prodConfig));

     /*   for(int i = 0; i < 200; i++) {
            prod.send(new ProducerData("TEST",new Message("testing 1 2 3".getBytes())));
        }
*/
        final SimpleConsumer cons = new SimpleConsumer("localhost", 9090, 100, 1024,"");
        long offset = 0L;

        int i = 0;
        while (true) {
            FetchRequest fetchRequest = new FetchRequest(0,"TEST", 0, (int) offset, null);

         /*   for (msg <- cons.fetch(fetchRequest)) {
                i = i + 1
                System.out.println("consumed [ " + i + "]: offset = " + msg.offset + ", payload = " + Utils.toString(msg.message.payload, "UTF-8"))
                offset = msg.offset
            }
        }*/

            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
                @Override
                public void run() {
                    prod.close();
                    cons.close();
                    server.shutdown();
                    server.awaitShutdown();
                }
            }));
        }





        }
