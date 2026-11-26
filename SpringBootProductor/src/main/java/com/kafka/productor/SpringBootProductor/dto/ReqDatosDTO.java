package com.kafka.productor.SpringBootProductor.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReqDatosDTO {
    private Integer id;
    private String nombre;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fecha;
}
