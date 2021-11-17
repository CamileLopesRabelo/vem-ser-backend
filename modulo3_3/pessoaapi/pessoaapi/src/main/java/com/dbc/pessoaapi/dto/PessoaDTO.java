package com.dbc.pessoaapi.dto;

import com.dbc.pessoaapi.entity.ContatoEntity;
import com.dbc.pessoaapi.entity.EnderecoEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
public class PessoaDTO {
    private Integer idPessoa;
    @NotEmpty
    @NotNull
    @ApiModelProperty(value = "Nome da pessoa")
    private String nome;
    @NotNull
    @Past
    @ApiModelProperty(value = "Data de nascimento")
    private LocalDate dataNascimento;
    @NotNull
    @NotEmpty
    @Size(max = 11, min = 11,message = "Deve ter 11 caracteres")
    @ApiModelProperty(value = "CPF")
    private String cpf;
    @NotNull
    @Email
    @ApiModelProperty(value = "Email")
    private String email;
}
