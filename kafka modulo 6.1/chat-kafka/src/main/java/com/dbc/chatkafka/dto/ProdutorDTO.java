package com.dbc.chatkafka.dto;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ProdutorDTO {
  private String usuario;
  private String mensagem;
  private LocalDateTime dataCriacao;
}
