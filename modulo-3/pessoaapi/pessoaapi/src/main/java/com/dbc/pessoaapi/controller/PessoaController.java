package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.PessoaCreateDTO;
import com.dbc.pessoaapi.dto.PessoaDTO;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
@Validated
@RequiredArgsConstructor
@Slf4j
public class PessoaController {
    private final PessoaService pessoaService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @PostMapping
    public PessoaDTO create(@Valid @RequestBody PessoaCreateDTO pessoaDTO) throws Exception {
        log.info("iniciando criação da pessoa");
        PessoaDTO pessoaEntityCriada = pessoaService.create(pessoaDTO);
        log.info("pessoa criada com sucesso");
        return pessoaEntityCriada;
    }

    @GetMapping
    public List<PessoaDTO> list() {

        return pessoaService.list();
    }

    @GetMapping("/byname")
    public List<PessoaDTO> listByName(@RequestParam("nome") String nome) {
        return pessoaService.listByName(nome);
    }


    @PutMapping("/{idPessoa}")
    public PessoaDTO update(@PathVariable("idPessoa") Integer id,
                               @Valid @RequestBody PessoaCreateDTO pessoaCreateDTO) throws Exception {
        log.info("iniciando alteração da pessoa");
         PessoaDTO pessoaDTO = pessoaService.update(id, pessoaCreateDTO);
         log.info("pessoa atualizada com sucesso");
         return pessoaDTO;
    }

    @DeleteMapping("/{idPessoa}")
    public void delete(@PathVariable("idPessoa") @NotNull Integer id) throws Exception {
        log.info("iniciando delete pessoa");
        pessoaService.delete(id);
        log.info("pessoa deletada com sucesso");
    }
}
