package com.dbc.veiculoprodutorconsumidor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDTO {
    private LocalDateTime dataLeitura;
    private Double velocidade;
    private Integer rotacao;
    private Boolean sensorFrenagem;
}
