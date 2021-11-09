package com.dbc.pessoaapi.service;

import com.dbc.pessoaapi.dto.*;
import com.dbc.pessoaapi.entity.EnderecoEntity;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.EnderecoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;
    private final ObjectMapper objectMapper;

    private EnderecoEntity findById (Integer id) throws RegraDeNegocioException {
        EnderecoEntity entity = enderecoRepository.findById(id)
                .orElseThrow(() -> new RegraDeNegocioException("Endereço não encontrado"));
        return entity;
    }


    public List<EnderecoDTO> list() {
        return enderecoRepository.findAll().stream()
                .map(endereco -> objectMapper.convertValue(endereco,EnderecoDTO.class))
                .collect(Collectors.toList());
    }


    public EnderecoDTO GetByIdEndereco(Integer idEndereco) throws RegraDeNegocioException {
        EnderecoEntity endereco = findById(idEndereco);
        EnderecoDTO dto = objectMapper.convertValue(endereco,EnderecoDTO.class);
        return dto;
    }


    public EnderecoDTO create(Integer idPessoa, EnderecoCreateDTO enderecoCreateDTO) throws RegraDeNegocioException {
        EnderecoEntity enderecoEntity1 = objectMapper.convertValue(enderecoCreateDTO, EnderecoEntity.class);
        EnderecoEntity enderecoCriado = enderecoRepository.save(enderecoEntity1);
        EnderecoDTO dto = objectMapper.convertValue(enderecoCriado,EnderecoDTO.class);
        return dto;
    }

    public EnderecoDTO update(Integer idEndereco, EnderecoCreateDTO enderecoCreateDTO) throws Exception {
        findById(idEndereco);
        EnderecoEntity enderecoEntity1 = objectMapper.convertValue(enderecoCreateDTO, EnderecoEntity.class);
        enderecoEntity1.setIdEndereco(idEndereco);
        EnderecoEntity enderecoCriado = enderecoRepository.save(enderecoEntity1);
        EnderecoDTO dto = objectMapper.convertValue(enderecoCriado,EnderecoDTO.class);
        return dto;
    }

    public void delete(Integer idEndereco) throws Exception {
        EnderecoEntity enderecoEntity = findById(idEndereco);
        enderecoRepository.delete(enderecoEntity);
    }
}
