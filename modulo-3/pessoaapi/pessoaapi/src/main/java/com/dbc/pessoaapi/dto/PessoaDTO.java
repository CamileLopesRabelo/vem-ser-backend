package com.dbc.pessoaapi.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class PessoaDTO {
    private Integer idPessoa;
    @NotEmpty
    @NotNull
    private String nome;
    @NotNull
    @Past
    private LocalDate dataNascimento;
    private String email;
}
