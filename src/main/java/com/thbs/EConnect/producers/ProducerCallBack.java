package com.thbs.EConnect.producers;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class ProducerCallBack implements Callback {


	public void onCompletion(RecordMetadata metadata, Exception exception) {

		if (exception == null) {
			System.out.println(metadata);

		} else {

			try {
			} finally {throw new RuntimeException(exception);}
		}

	}
}