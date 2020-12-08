package com.madeira.springbootkafka.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madeira.springbootkafka.services.KafkaProducerService;

@RestController
public class KafkaResource {

	private final KafkaProducerService producer;

	public KafkaResource(KafkaProducerService producer) {
		super();
		this.producer = producer;
	}

	@PostMapping("/publish")
	public void writeMessageToTopic(@RequestParam("message") String message) {
		this.producer.writeMessage(message);

	}

}
