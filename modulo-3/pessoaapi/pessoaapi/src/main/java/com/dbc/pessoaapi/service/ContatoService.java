package com.dbc.pessoaapi.service;



import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.entity.Pessoa;
import com.dbc.pessoaapi.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ContatoService {
    @Autowired
    private ContatoRepository contatoRepository;

    public List<Contato> list(){
        return contatoRepository.list();
    }

    public List<Contato> listPorIdPessoa(Integer idPessoa) {
        return contatoRepository.listByIdPessoa(idPessoa);
    }

    public Contato create(Integer idPessoa,Contato contato){
        return contatoRepository.create(idPessoa,contato);
    }

    public Contato update(Integer idContato, Contato contatoAtualizar) throws Exception {
        return contatoRepository.update(idContato, contatoAtualizar);
    }

    public void delete(Integer idContato) throws Exception {
        contatoRepository.delete(idContato);
    }
}
