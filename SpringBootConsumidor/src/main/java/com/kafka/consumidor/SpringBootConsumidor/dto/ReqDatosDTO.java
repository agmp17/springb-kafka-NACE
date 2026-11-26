package com.kafka.consumidor.SpringBootConsumidor.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ReqDatosDTO {
    private Integer id;
    private String nombre;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fecha;
}
