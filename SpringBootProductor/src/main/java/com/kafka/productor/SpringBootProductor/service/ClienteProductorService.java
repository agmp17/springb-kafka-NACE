package com.kafka.productor.SpringBootProductor.service;

import com.kafka.productor.SpringBootProductor.dto.ReqDatosDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import tools.jackson.databind.ObjectMapper;

@Service
public class ClienteProductorService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    public ClienteProductorService(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public void publicar(ReqDatosDTO datos) {
        String mensaje = objectMapper.writeValueAsString(datos);
        kafkaTemplate.send("topic1", mensaje);
    }
}
