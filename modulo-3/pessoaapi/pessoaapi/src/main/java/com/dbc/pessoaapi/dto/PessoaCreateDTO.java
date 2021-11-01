package com.dbc.pessoaapi.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class PessoaCreateDTO {
    @NotEmpty
    @NotNull
    private String nome;
    @NotNull
    @Past
    private LocalDate dataNascimento;
    @NotNull
    @NotEmpty
    @Size(max = 11, min = 11,message = "Deve ter 11 caracteres")
    private String cpf;
    private String email;
}
