package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.dto.EnderecoDTO;
import com.dbc.pessoaapi.dto.EnderecoCreateDTO;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/endereco")
@Validated
@RequiredArgsConstructor
@Slf4j
public class EnderecoController {

    private final EnderecoService enderecoService;

    @GetMapping
    public List<EnderecoDTO> list() {
        return enderecoService.list();
    }

    @GetMapping("/{idEndereco}")
    public List<EnderecoDTO> listByIdEndereco(@PathVariable("idEndereco") Integer idEndereco) {
                return enderecoService.listByIdEndereco(idEndereco);
    }

    @GetMapping("/{idPessoa}/pessoa")
    public List<EnderecoDTO> listByIdPessoa(@PathVariable("idPessoa") Integer idPessoa) {
        return enderecoService.listByIdPessoa(idPessoa);
    }

    @PostMapping("/{idPessoa}")
    public EnderecoDTO create(@PathVariable ("idPessoa") Integer idPessoa,
                              @Valid @RequestBody EnderecoCreateDTO enderecoCreateDTO) throws RegraDeNegocioException {
        log.info("criando endereço");
        EnderecoDTO enderecoEntityCriar = enderecoService.create(idPessoa, enderecoCreateDTO);
        log.info("Endereço criado com sucesso!");
        return enderecoEntityCriar;
    }

    @PutMapping("/{idEndereco}")
    public EnderecoDTO update(@PathVariable("idEndereco") Integer idEndereco,
                              @Valid @RequestBody EnderecoCreateDTO enderecoCreateDTO) throws Exception {
        log.info("alterando endereço");
        EnderecoDTO enderecoEntityAlter = enderecoService.update(idEndereco, enderecoCreateDTO);
        log.info("Endereço alterado com sucesso");
        return enderecoEntityAlter;
    }

    @DeleteMapping("/{idEndereco}")
    public void delete(@PathVariable("idEndereco") Integer idEndereco) throws Exception {
        log.info("começando a deletar endereço");
        enderecoService.delete(idEndereco);
        log.info("endereço deletado");
    }

}
