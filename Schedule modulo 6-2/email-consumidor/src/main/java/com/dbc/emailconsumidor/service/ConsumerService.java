package com.dbc.emailconsumidor.service;

import com.dbc.emailconsumidor.dto.EmailDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
@Slf4j
@RequiredArgsConstructor
public class ConsumerService {
    private final EmailService emailService;

    private final ObjectMapper objectMapper;

//    public ConsumerService(ObjectMapper objectMapper) {
//        this.objectMapper = objectMapper;
//    }

    @KafkaListener(
            topics = "${kafka.topic.email}",
            groupId = "${kafka.group-id}",
            containerFactory = "listenerContainerFactoryEarliest"
    )
    public void consumeDto(@Payload String mensagem,
                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                        @Header(KafkaHeaders.OFFSET) Long offset) throws JsonProcessingException, MessagingException {
        EmailDTO emailDTO = objectMapper.readValue(mensagem, EmailDTO.class);
        System.out.println(emailDTO);
        emailService.enviarEmail(emailDTO);
        log.info("MENSAGEM LIDA: '{}', CHAVE: '{}', OFFSET: '{}'", emailDTO, key, offset);


    }

}
