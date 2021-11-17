package com.dbc.pessoaapi.dto;

import com.dbc.pessoaapi.entity.PessoaEntity;
import lombok.Data;

import java.util.List;

@Data
public class PessoaContatoDTO extends PessoaDTO {
    private List<ContatoDTO> contatoDTOS;
}
