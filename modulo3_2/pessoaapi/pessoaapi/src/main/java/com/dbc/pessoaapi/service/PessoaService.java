package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.dto.*;
import com.dbc.pessoaapi.entity.ContatoEntity;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PessoaService {
    private final PessoaRepository pessoaRepository;
    private final ObjectMapper objectMapper;

    public PessoaDTO create(PessoaCreateDTO pessoaCreateDTO) throws Exception {

        PessoaEntity pessoaEntity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        PessoaEntity pessoaCriada = pessoaRepository.save(pessoaEntity);
        PessoaDTO pessoaDTO = objectMapper.convertValue(pessoaCriada, PessoaDTO.class);
        return pessoaDTO;
    }

    public PessoaEntity findById (Integer id) throws RegraDeNegocioException {
        PessoaEntity entity =pessoaRepository.findById(id)
                .orElseThrow(() -> new RegraDeNegocioException("Pessoa não encontrada"));
        return entity;
    }

    public List<PessoaDTO> list() {
        return pessoaRepository.findAll()
                .stream()
                .map(pessoa -> objectMapper.convertValue(pessoa, PessoaDTO.class))
                .collect(Collectors.toList());
    }

    public PessoaDTO update(Integer id, PessoaCreateDTO pessoaCreateDTO) throws Exception {
        findById(id);
        PessoaEntity pessoaEntity = objectMapper.convertValue(pessoaCreateDTO, PessoaEntity.class);
        pessoaEntity.setIdPessoa(id);
        PessoaEntity pessoa = pessoaRepository.save(pessoaEntity);
        PessoaDTO dto = objectMapper.convertValue(pessoa, PessoaDTO.class);
        return dto;
    }

    public void delete(Integer id) throws RegraDeNegocioException {
        PessoaEntity pessoa = findById(id);
        pessoaRepository.delete(pessoa);
    }

    public PessoaDTO getById(Integer id) throws RegraDeNegocioException {
        PessoaEntity pessoaEntityRecuperada = findById(id);
        PessoaDTO dto = objectMapper.convertValue(pessoaEntityRecuperada,PessoaDTO.class);
        return dto;
    }

    public List<PessoaContatoDTO> listarPessoasCompleto(Integer id) {
        return pessoaRepository.findAll().stream()
                .map(pessoa -> {
                    PessoaContatoDTO pessoaContatoDTO = objectMapper.convertValue(pessoa,PessoaContatoDTO.class);
                    pessoaContatoDTO.setContatoDTOS(pessoa.getContatos().stream()
                            .map(contato -> objectMapper.convertValue(contato, ContatoDTO.class))
                            .collect(Collectors.toList()));
                    return pessoaContatoDTO;
                })
                .collect(Collectors.toList());
    }

    public List<PessoaContatoDTO> listarPessoasComContatos(Integer id) throws RegraDeNegocioException {
        List<PessoaContatoDTO> listaPessoaContatoDTO = new ArrayList<>();
        if (id == null) {
            listaPessoaContatoDTO = pessoaRepository.findAll().stream()
                    .map(pessoa -> {
                        PessoaContatoDTO pessoaContatoDTO = objectMapper.convertValue(pessoa, PessoaContatoDTO.class);
                        pessoaContatoDTO.setContatoDTOS(pessoa.getContatos().stream()
                                .map(contato -> {
                                    ContatoDTO contatoDTO = objectMapper.convertValue(contato, ContatoDTO.class);
                                    return contatoDTO;
                                })
                                .collect(Collectors.toList()));
                        return pessoaContatoDTO;
                    })
                    .collect(Collectors.toList());

            return listaPessoaContatoDTO;
        }
        PessoaEntity pessoa = findById(id);
        PessoaContatoDTO pessoaContatoDTO = objectMapper.convertValue(pessoa, PessoaContatoDTO.class);
        pessoaContatoDTO.setContatoDTOS(pessoa.getContatos().stream()
                .map(contatoEntity -> {
                    ContatoDTO contatoDTO = objectMapper.convertValue(contatoEntity,ContatoDTO.class);
                    contatoDTO.setIdPessoa(id);
                    return contatoDTO;
                })
                .collect(Collectors.toList())
        );
        listaPessoaContatoDTO.add(pessoaContatoDTO);
        return listaPessoaContatoDTO;
    }


    public List<PessoaEnderecoDTO> listarPessoaComEnderecos() {
        return pessoaRepository.findAll().stream()
                .map(pessoaEntity -> {
                    PessoaEnderecoDTO pessoaEnderecoDTO = objectMapper.convertValue(pessoaEntity, PessoaEnderecoDTO.class);
                    pessoaEnderecoDTO.setEnderecoDTOS(pessoaEntity.getEnderecos().stream()
                            .map(enderecoEntity -> {
                                EnderecoDTO enderecoDTO = objectMapper.convertValue(enderecoEntity, EnderecoDTO.class);
                                return enderecoDTO;
                            })
                            .collect(Collectors.toList()));
                    return pessoaEnderecoDTO;
                })
                .collect(Collectors.toList());
    }
 }

