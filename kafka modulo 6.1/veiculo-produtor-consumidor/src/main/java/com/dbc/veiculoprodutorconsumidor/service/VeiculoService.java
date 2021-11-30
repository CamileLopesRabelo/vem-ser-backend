package com.dbc.veiculoprodutorconsumidor.service;

import com.dbc.veiculoprodutorconsumidor.dto.VeiculoDTO;
import com.dbc.veiculoprodutorconsumidor.entity.VeiculoEntity;
import com.dbc.veiculoprodutorconsumidor.repository.VeiculoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;
    private final ObjectMapper objectMapper;

    public Document create(VeiculoDTO veiculoDTO) {
        VeiculoEntity veiculoEntity = objectMapper.convertValue(veiculoDTO, VeiculoEntity.class);
        VeiculoEntity veiculo = veiculoRepository.save(veiculoEntity);
        Document veiculoCriado = objectMapper.convertValue(veiculo, Document.class);
        return veiculoCriado;
    }

    public List<Document> list() {
        return veiculoRepository.findAll().stream()
                .map(veiculo -> objectMapper.convertValue(veiculo, Document.class))
                .collect(Collectors.toList());
    }

}
