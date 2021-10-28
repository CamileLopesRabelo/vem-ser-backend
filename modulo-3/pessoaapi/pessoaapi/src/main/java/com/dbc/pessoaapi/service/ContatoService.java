package com.dbc.pessoaapi.service;



import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.entity.Pessoa;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.ContatoRepository;
import com.dbc.pessoaapi.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;


    public List<Contato> list(){
        return contatoRepository.list();
    }

    public List<Contato> listPorIdPessoa(Integer idPessoa) {
        return contatoRepository.listByIdPessoa(idPessoa);
    }

    public Contato create(Integer idPessoa,Contato contato) throws Exception {
        pessoaRepository.getById(idPessoa);
        return contatoRepository.create(idPessoa,contato);
    }

    public Contato update(Integer idContato, Contato contatoAtualizar) throws Exception {
        return contatoRepository.update(idContato, contatoAtualizar);
    }

    public void delete(Integer idContato) throws Exception {
        contatoRepository.delete(idContato);
    }
}
