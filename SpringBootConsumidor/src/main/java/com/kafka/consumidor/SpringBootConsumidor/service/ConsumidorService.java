package com.kafka.consumidor.SpringBootConsumidor.service;

import com.kafka.consumidor.SpringBootConsumidor.dto.ReqDatosDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConsumidorService {
    private static final Logger LOG = LoggerFactory.getLogger(ConsumidorService.class);

    public void procesaMensaje(ReqDatosDTO req) {
        LOG.info("Mensaje recibido: {}", req.toString());
        LOG.info("Id: {}, Nombre: {}, Fecha: {}", req.getId(), req.getNombre(), req.getFecha());
    }
}
