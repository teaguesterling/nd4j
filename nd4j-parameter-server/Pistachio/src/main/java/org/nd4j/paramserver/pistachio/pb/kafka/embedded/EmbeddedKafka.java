package org.nd4j.paramserver.pistachio.pb.kafka.embedded;

import kafka.server.KafkaConfig;
import kafka.server.KafkaServer;

import java.util.Properties;

/**
 * @author Adam Gibson
 */
public class EmbeddedKafka {
    private String hostName = "localhost";
    private int port = 9090;
    private int brokerId = 0;
    private KafkaServer server;
    private String zooKeeperHost = "localhost:2181";
    private String brokerList = "localhost:9092";

    public void start() {
        Properties props = new Properties();
        props.setProperty("hostname",hostName);
        props.setProperty("port", String.valueOf(port));
        props.setProperty("log.dir", "/tmp/embeddedkafka/");
        props.setProperty("enable.zookeeper", "false");
        props.put("zookeeper.connect", zooKeeperHost);
        props.put("broker.id", String.valueOf(brokerId));
        props.put("metadata.broker.list",brokerList);




        final ZooKeeperRunner runner = new ZooKeeperRunner();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    runner.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        server = new KafkaServer(new KafkaConfig(props), null);
        server.startup();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                server.shutdown();
                server.awaitShutdown();
            }
        }));
    }

}
