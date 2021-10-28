package com.dbc.pessoaapi.repository;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.entity.Pessoa;
import com.dbc.pessoaapi.entity.TipoContato;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import org.apache.commons.lang3.Functions;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class ContatoRepository {
    private static List<Contato> listaContatos = new ArrayList<>();
    private AtomicInteger COUNTER = new AtomicInteger();
    private AtomicInteger COUNTER2 = new AtomicInteger();

    public ContatoRepository() {

        listaContatos.add(new Contato(COUNTER.incrementAndGet(), COUNTER2.incrementAndGet(), TipoContato.COMERCIAL, "71987130989", "trabalho"));
        listaContatos.add(new Contato(COUNTER.incrementAndGet(), COUNTER2.incrementAndGet(), TipoContato.RESIDENCIAL, "7182759675", "casa"));
        listaContatos.add(new Contato(COUNTER.incrementAndGet(), COUNTER2.incrementAndGet(), TipoContato.COMERCIAL, "71986759796", "trabalho dois"));
    }

    public Contato create( Integer IdPessoa,Contato contato) throws Exception{
        contato.setIdPessoa(IdPessoa);
        contato.setIdContato(COUNTER.incrementAndGet());
        listaContatos.add(contato);
        return contato;
    }


    public List<Contato> list() {
        return listaContatos;
    }

    public List<Contato> listByIdPessoa(Integer id) {
        return listaContatos.stream()
                .filter(contato -> contato.getIdPessoa().equals(id))
                .collect(Collectors.toList());
    }

    public Contato update(Integer idContato, Contato contatoAtualizar) throws Exception {
        Contato contatobackup = listaContatos.stream()
                .filter(contato -> contato.getIdContato().equals(idContato))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException("Contato não  foi encontrado"));
        contatobackup.setIdPessoa(contatoAtualizar.getIdPessoa());
        contatobackup.setTipoContato(contatoAtualizar.getTipoContato());
        contatobackup.setNumero(contatoAtualizar.getNumero());
        contatobackup.setDescricao(contatoAtualizar.getDescricao());
        return contatobackup;
    }

    public void delete(Integer id) throws Exception {
        Contato contatobackup = listaContatos.stream()
                .filter(contato -> contato.getIdContato().equals(id))
                .findFirst()
                .orElseThrow(() -> new RegraDeNegocioException("Contato não encontrado"));
        listaContatos.remove(contatobackup);
    }
}