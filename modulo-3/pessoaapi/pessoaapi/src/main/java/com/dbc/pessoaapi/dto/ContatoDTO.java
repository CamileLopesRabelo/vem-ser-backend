package com.dbc.pessoaapi.dto;

import com.dbc.pessoaapi.entity.TipoContato;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ContatoDTO {
    private Integer idContato;
    @NotNull
    private Integer idPessoa;
    @NotNull
    private TipoContato tipoContato;
    @NotEmpty
    @NotNull
    @Size(max = 13, message = "numero maior que 13 digitos")
    private String numero;
    @NotEmpty
    @NotNull
    private String descricao;
}
