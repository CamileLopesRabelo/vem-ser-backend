package com.dbc.pessoaapi.dto;

import lombok.Data;

import java.util.List;

@Data
public class PessoaEnderecoDTO extends PessoaDTO{
    List<EnderecoDTO> enderecoDTOS;
}
