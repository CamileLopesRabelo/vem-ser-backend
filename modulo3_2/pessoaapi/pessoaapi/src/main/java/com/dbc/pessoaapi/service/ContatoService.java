package com.dbc.pessoaapi.service;



import com.dbc.pessoaapi.dto.ContatoCreateDTO;
import com.dbc.pessoaapi.dto.ContatoDTO;
import com.dbc.pessoaapi.entity.ContatoEntity;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.ContatoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ContatoService {
    private final ContatoRepository contatoRepository;
    private final ObjectMapper objectMapper;

    private ContatoEntity findById (Integer id) throws RegraDeNegocioException {
        ContatoEntity entity = contatoRepository.findById(id)
                .orElseThrow(() -> new RegraDeNegocioException("Contato não encontrado"));
        return entity;
    }

    public List<ContatoDTO> list(){
        return contatoRepository.findAll().stream()
                .map(contato -> objectMapper.convertValue(contato, ContatoDTO.class))
                .collect(Collectors.toList());
    }

    public ContatoDTO create(Integer idPessoa, ContatoCreateDTO contatoCreateDTO) throws RegraDeNegocioException {
        ContatoEntity contatoEntity = objectMapper.convertValue(contatoCreateDTO,ContatoEntity.class);
        contatoEntity.setIdPessoa(idPessoa);
        ContatoEntity contatoCriado = contatoRepository.save(contatoEntity);
        ContatoDTO contatoDTO = objectMapper.convertValue(contatoCriado,ContatoDTO.class);
        return contatoDTO;

    }

    public ContatoDTO update(Integer idContato, ContatoCreateDTO contatoCreateDTO) throws RegraDeNegocioException {
        findById(idContato);
        ContatoEntity contatoEntity = objectMapper.convertValue(contatoCreateDTO,ContatoEntity.class);
        contatoEntity.setIdContato(idContato);
        ContatoEntity contatoEntity1 = contatoRepository.save(contatoEntity);
        ContatoDTO dto = objectMapper.convertValue(contatoEntity1,ContatoDTO.class);
        return dto;
    }

    public void delete(Integer idContato) throws RegraDeNegocioException {
        ContatoEntity contato = findById(idContato);
        contatoRepository.delete(contato);
    }
}
