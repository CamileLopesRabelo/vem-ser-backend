package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.*;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.dbc.pessoaapi.service.PessoaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
@Validated
@RequiredArgsConstructor
@Slf4j
public class PessoaController {
    private final PessoaService pessoaService;
    private final PessoaRepository pessoaRepository;

    @PostMapping
    @ApiOperation(value = "Cria nova pessoa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Pessoa criada com sucesso"),
            @ApiResponse(code = 400, message = "Pessoa com dados inconsistentes"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    public PessoaDTO create(@Valid @RequestBody PessoaCreateDTO pessoaDTO) throws Exception {
        log.info("iniciando criação da pessoa");
        PessoaDTO pessoaEntityCriada = pessoaService.create(pessoaDTO);
        log.info("pessoa criada com sucesso");
        return pessoaEntityCriada;
    }

    @GetMapping
    @ApiOperation(value = "Lista as pessoa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Pessoa listada com sucesso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    public List<PessoaDTO> list() {

        return pessoaService.list();
    }

    @PutMapping("/{idPessoa}")
    @ApiOperation(value = "Altera pessoa pelo id da pessoa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Pessoa alterada com sucesso"),
            @ApiResponse(code = 400, message = "Pessoa não encontrada"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    public PessoaDTO update(@PathVariable("idPessoa") Integer id,
                               @Valid @RequestBody PessoaCreateDTO pessoaCreateDTO) throws Exception {
        log.info("iniciando alteração da pessoa");
         PessoaDTO pessoaDTO = pessoaService.update(id, pessoaCreateDTO);
         log.info("pessoa atualizada com sucesso");
         return pessoaDTO;
    }

    @DeleteMapping("/{idPessoa}")
    @ApiOperation(value = "Deleta pessoa pelo id da pessoa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Pessoa deletada com sucesso"),
            @ApiResponse(code = 400, message = "Pessoa não encontrada"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    public void delete(@PathVariable("idPessoa") @NotNull Integer id) throws Exception {
        log.info("iniciando delete pessoa");
        pessoaService.delete(id);
        log.info("pessoa deletada com sucesso");
    }

    @GetMapping("/find-by-name")
    public List<PessoaEntity> findByNomeContainingIgnoreCase(@RequestParam String nome) {
        return pessoaRepository.findByNomeContainingIgnoreCase(nome);
    }

    @GetMapping("/find-by-cpf")
    public PessoaEntity findByCpf(@RequestParam String cpf) {
        return  pessoaRepository.findByCpf(cpf);
    }

    @GetMapping("/find-by-data-nascimento")
    public List<PessoaEntity> findDataNascimento(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataNascimentoInicial,
                                                 @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate dataNascimentoFinal) {
        return pessoaRepository.findByDataNascimentoBetween(dataNascimentoInicial,dataNascimentoFinal);
    }

    @GetMapping("/listar-pessoa-completo")
    public List<PessoaContatoEnderecoDTO>listarCompleto() {
        return pessoaService.listarPessoasCompleto();

    }

    @GetMapping("/pessoa-contato")
    public List<PessoaContatoDTO>listarPessoaComContatos(@RequestParam(required = false) Integer idPessoa) throws RegraDeNegocioException {
        if (idPessoa == null) {
            return pessoaService.listarPessoasComContatos(idPessoa);
        }
        return pessoaService.listarPessoasComContatos(idPessoa);
    }

        @GetMapping("/pessoa-endereco")
    public List<PessoaEnderecoDTO>listarPessoaComEnderecos() {
        return pessoaService.listarPessoaComEnderecos();
    }

    @GetMapping("/pessoa-com-endereco")
    public List<PessoaEntity> EnderecoPessoa() {
        return pessoaRepository.EnderecoPessoa();
    }
}
