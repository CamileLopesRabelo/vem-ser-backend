package com.dbc.pessoaapi.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmailDTO {
    private String destinatario = "camile.oliveira@dbccompany.com.br";
    private String assunto = "Nada na vida é fácil";
    private String texto = "Mas você vai superar";
}
