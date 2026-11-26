package com.kafka.productor.SpringBootProductor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootProductorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductorApplication.class, args);
	}

	/*@Bean
    CommandLineRunner init(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> {
			kafkaTemplate.send("topic1", "Cuac PATO ñandú No pasan las ñ ni los acentos");
		};
	}*/
}
