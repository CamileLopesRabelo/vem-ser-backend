package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.entity.Pessoa;
import com.dbc.pessoaapi.repository.PessoaRepository;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa create(Pessoa pessoa) throws Exception {
        if (StringUtils.isBlank(pessoa.getNome())) {
            throw new Exception("nome não informado");
        } else if (ObjectUtils.isEmpty(pessoa.getDataNascimento())) {
            throw new Exception("a data nascimento está vazia");
        } else if (StringUtils.length(pessoa.getCpf()) != 11) {
            throw new Exception("numero do cpr tem mais de 11 digitos");
        } else if (StringUtils.isBlank(pessoa.getCpf())) {
            throw new Exception("cpf vazio");
        } else return pessoaRepository.create(pessoa);
    }

    public List<Pessoa> list(){
        return pessoaRepository.list();
    }

    public Pessoa update(Integer id,
                         Pessoa pessoaAtualizar) throws Exception {
        return pessoaRepository.update(id, pessoaAtualizar);
    }

    public void delete(Integer id) throws Exception {
         pessoaRepository.delete(id);
    }

    public List<Pessoa> listByName(String nome) {
        return pessoaRepository.listByName(nome);
    }
}
