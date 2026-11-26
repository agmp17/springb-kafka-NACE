package com.kafka.consumidor.SpringBootConsumidor.listener;

import com.kafka.consumidor.SpringBootConsumidor.dto.ReqDatosDTO;
import com.kafka.consumidor.SpringBootConsumidor.service.ConsumidorService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import tools.jackson.databind.json.JsonMapper;

@Component
public class KafkaComsumidorListener {

    private final ConsumidorService service;
    private final JsonMapper mapper;

    public KafkaComsumidorListener(ConsumidorService service, JsonMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @KafkaListener(topics = {"topic1"}, groupId = "loquesea")
    public void listener(String req) {
        ReqDatosDTO reqDatosDTO = mapper.readValue(req, ReqDatosDTO.class);
        service.procesaMensaje(reqDatosDTO);
    }
}
