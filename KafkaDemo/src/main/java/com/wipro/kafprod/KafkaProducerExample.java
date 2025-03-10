package com.wipro.kafprod;

import org.apache.kafka.clients.producer.*;

import java.util.Properties;

public class KafkaProducerExample {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");
		properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
				"org.apache.kafka.common.serialization.StringSerializer");

		KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

		for (int i = 0; i < 10; i++) {
			producer.send(new ProducerRecord<>("test-topic", "key-" + i, "value-" + i));
		}

		producer.close();
	}
}
