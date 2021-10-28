package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.entity.Contato;
import com.dbc.pessoaapi.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/contato")
public class ContatoController {
    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public List<Contato> list() {
        return contatoService.list();
    }

    @GetMapping("/{idPessoa}")
    public List<Contato> listByName(@PathVariable("idPessoa") Integer idPessoa) {
        return contatoService.listPorIdPessoa(idPessoa);
    }

    @PostMapping("/{idPessoa}")
    public Contato create(@PathVariable ("idPessoa") Integer idPessoa,@RequestBody Contato contato) {
        return contatoService.create(idPessoa,contato);
    }

    @PutMapping("/{idContato}")
    public Contato update(@PathVariable("idContato") Integer idContato, @RequestBody Contato contatoAtualizar) throws Exception {
        return contatoService.update(idContato,contatoAtualizar);
    }

    @DeleteMapping("/{idContato}")
    public void delete(@PathVariable("idContato") Integer idContato) throws Exception {
        contatoService.delete(idContato);
    }
}