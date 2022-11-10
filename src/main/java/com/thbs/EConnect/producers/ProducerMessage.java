package com.thbs.EConnect.producers;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerMessage<T> {

	Producer<String, T> producer;
	Properties props = new Properties();
	ProducerRecord<String, T> producerRecord;
	String response;

	public void buildProducer(T modelObj, Properties properties) {

		producer = new KafkaProducer<String, T>(properties);
	}

	public String sendRecords(String topic, T modelObj) {

		producerRecord = new ProducerRecord<String, T>(topic, modelObj);

		try {
			producer.send(producerRecord, new ProducerCallBack());

			response = "Succesfully published records to Kafka";
		} catch (Exception e) {
			// TODO Auto-generated catch block

			System.out.println(e);
			response = "Failed publishing records to Kafka";

		}

		return response;
	}

	public void flushProducer() {
		producer.flush();
		producer.close();
	}

}
