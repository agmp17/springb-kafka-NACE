package com.kafka.productor.SpringBootProductor.controller;

import com.kafka.productor.SpringBootProductor.dto.ReqDatosDTO;
import com.kafka.productor.SpringBootProductor.service.ClienteProductorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productor")
public class ProductorController {

    private final ClienteProductorService producerService;

    public ProductorController(ClienteProductorService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public ResponseEntity<Void> publicar(@RequestBody ReqDatosDTO datos) {
        producerService.publicar(datos);
        return ResponseEntity.accepted().build();
    }
}
