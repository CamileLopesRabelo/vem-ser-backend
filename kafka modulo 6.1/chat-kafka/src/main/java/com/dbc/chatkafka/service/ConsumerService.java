package com.dbc.chatkafka.service;

import com.dbc.chatkafka.dto.ProdutorDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
@Slf4j
@RequiredArgsConstructor
public class ConsumerService {
    private final KafkaTemplate<String, String> stringKafkaTemplate;
    private final ObjectMapper objectMapper;

    @KafkaListener(
            topics = "${kafka.topic.geral}",
            groupId = "${kafka.group-id}",
            containerFactory = "listenerContainerFactoryLatest",
            clientIdPrefix = "primeiro"
    )
    public void consumeGeral(@Payload String mensagem,
                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                        @Header(KafkaHeaders.OFFSET) Long offset) throws JsonProcessingException {
        ProdutorDTO produtorDTO = objectMapper.readValue(mensagem, ProdutorDTO.class);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        log.info("DATA CRIAÇÃO: '{}', USUARIO: '{}', MENSAGEM: '{}'",
                produtorDTO.getDataCriacao().format(formatter), produtorDTO.getUsuario(), produtorDTO.getMensagem());
    }

    @KafkaListener(
            topics = "${kafka.topic.privado}",
            groupId = "${kafka.group-id}",
            containerFactory = "listenerContainerFactoryEarliest",
            clientIdPrefix = "segundo"
    )
    public void consumePrivate(@Payload String mensagem,
                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                        @Header(KafkaHeaders.OFFSET) Long offset) throws JsonProcessingException {
        ProdutorDTO produtorDTO = objectMapper.readValue(mensagem, ProdutorDTO.class);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        log.info("DATA CRIAÇÃO: '{}', USUARIO: '{}', MENSAGEM (privada): '{}'",
                produtorDTO.getDataCriacao().format(formatter), produtorDTO.getUsuario(), produtorDTO.getMensagem());
    }

}
