package com.dbc.pessoaapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;


@Getter
@Setter
@Entity(name = "endereco_pessoa")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENDERECO_SEQ")
    @SequenceGenerator(name = "ENDERECO_SEQ", sequenceName = "seq_endereco_contato", allocationSize = 1)
    @Column(name = "id_endereco")
    private Integer idEndereco;

    @Column(name = "tipo")
    @Enumerated(EnumType.ORDINAL)
    @NotNull
    private TipoEndereco tipo;

    @Column(name = "logradouro")
    @NotEmpty
    @Size(max = 250)
    private String logradouro;

    @Column(name = "numero")
    @NotNull
    private Integer numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cep")
    @NotEmpty
    @NotNull
    @Size(max = 8,min = 8,message = "mais de 8 caracteres")
    private String cep;

    @Column(name = "cidade")
    @NotEmpty
    @NotNull
    @Size(max = 250)
    private String cidade;

    @Column(name = "estado")
    @NotEmpty
    @NotNull
    private String estado;

    @Column(name = "pais")
    @NotEmpty
    @NotNull
    private String pais;

    @JsonIgnore
    @ManyToMany(mappedBy = "enderecos")
    private Set<PessoaEntity> pessoas;
}
