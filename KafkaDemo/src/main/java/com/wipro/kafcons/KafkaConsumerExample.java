package com.wipro.kafcons;

//import org.apache.kafka.clients.consumer.*;
//
//import java.util.Properties;
//import java.util.Arrays;

//public class KafkaConsumerExample {
//    public static void main(String[] args) {
//        Properties properties = new Properties();
//        properties.put("bootstrap.servers", "localhost:9092");
//        properties.put("group.id", "test-group");
//        properties.put("key.deserializer", 
//            "org.apache.kafka.common.serialization.StringDeserializer");
//        properties.put("value.deserializer", 
//            "org.apache.kafka.common.serialization.StringDeserializer");
//
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
//        consumer.subscribe(Arrays.asList("test-topic"));
//
//        while (true) {
//            consumer.poll(1000).forEach(record -> 
//                System.out.println("Consumed message: " + record.value()));
//        }
//    }
//}
