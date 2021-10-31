package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.ContatoCreateDTO;
import com.dbc.pessoaapi.dto.ContatoDTO;
import com.dbc.pessoaapi.entity.ContatoEntity;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.service.ContatoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@RestController
@RequestMapping("/contato")
@Validated
@RequiredArgsConstructor
@Slf4j
public class ContatoController {
    private final ContatoService contatoService;

    @GetMapping
    public List<ContatoDTO> list() {
        return contatoService.list();
    }

    @GetMapping("/{idPessoa}")
    public List<ContatoDTO> listByName(@PathVariable("idPessoa") Integer idPessoa) throws RegraDeNegocioException {
        return contatoService.listPorIdPessoa(idPessoa);
    }

    @PostMapping("/{idPessoa}")
    public ContatoDTO create(@PathVariable ("idPessoa") Integer idPessoa,
                             @RequestBody @Valid ContatoCreateDTO contatoCreateDTO) throws Exception {
        log.info("começcando a criar contato");
        ContatoDTO contatocriar = contatoService.create(idPessoa, contatoCreateDTO);
        log.info("Contato criado com sucesso");
        return contatocriar;
    }

    @PutMapping("/{idContato}")
    public ContatoDTO update(@PathVariable("idContato") Integer idContato,
                                @RequestBody @Valid ContatoCreateDTO contatoCreateDTO) throws Exception {
        log.info("iniciando alteração do contato");
        ContatoDTO contatoalter = contatoService.update(idContato, contatoCreateDTO);
        log.info("contato alterado com sucesso");
        return contatoalter;
    }

    @DeleteMapping("/{idContato}")
    public void delete(@PathVariable("idContato") Integer idContato) throws Exception {
        log.info("iniciando delete contato");
        contatoService.delete(idContato);
        log.info("contato delatado com sucesso!s");
    }
}
