package com.thbs.EConnect.controller;

import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.thbs.EConnect.serializer.KafkaJsonSerializers;

import java.util.List;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ProducerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ProducerController.class);

	String bootstrapServer, response;

	String bootstrapPort;
	String[] argsValues;

	public ProducerController(ApplicationArguments args) {

		LOGGER.info("Arguments List" + args.getNonOptionArgs());

		List<String> argsList = args.getNonOptionArgs();
		for (int i = 0; i < argsList.size(); i++) {
			argsValues = argsList.get(i).split(":");

			if (argsValues[0].equals("-config=ip")) {
				bootstrapServer = argsValues[1];
			}

			else if (argsValues[0].equals("-config=port")) {
				bootstrapPort = argsValues[1];
			}

		}

		bootstrapServer = bootstrapServer + ":" + bootstrapPort;
		System.out.println(bootstrapServer);

	}

	@PostMapping("/kafka/api/v1/publish")
	public String post(@RequestHeader(value = "topicName") String topicName,
			@RequestHeader(value = "service") String service, @RequestBody JSONObject data) throws Exception {

		try {

			LOGGER.info("Post API is called");
			System.out.println("Topic to send Data : " + topicName);
			System.out.println("Service Name" + service);

			if (service != null) {
				data.put("service", service);
			}
			System.out.println("Data for posting : " + data);

			EConnect<Object> connect = new EConnect<Object>();

			ProducerBuilder<Object> builder = connect.getProducerBuilder();

			builder.setBoostrap(bootstrapServer);
			builder.setKeySerializer("");
			builder.setValueSerializer(KafkaJsonSerializers.class.getName());

			Properties properties = builder.getProducerConfiguration();
			System.out.println("properties " + properties);
			response = builder.producerSendMessage(data, properties, topicName);
			System.out.println();
			System.out.println(response);

			if (response.equals("Succesfully published records to Kafka")) {

				System.out.println(" I have posted data: " + data + " to topic " + topicName);
				return response;
			}

			else {

				return response;
			}

		} catch (Exception e) {

			System.out.println("Exception occured");

			throw new Exception();

		}

	}

}