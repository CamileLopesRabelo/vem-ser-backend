package com.dbc.pessoaapi.schedule;

import com.dbc.pessoaapi.dto.EmailDTO;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.kafka.EmailKafka;
import com.dbc.pessoaapi.kafka.Producer;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.dbc.pessoaapi.service.EmailService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class MeuNovoSchedulerCron {
    private final EmailService emailService;
    private final PessoaRepository pessoaRepository;
    private final Producer producer;
    private final EmailKafka emailKafka;

    @Scheduled(cron = "0 0 8,20 * * *", zone = "GMT-3")
    public void meuPrimeiroScheduler() throws InterruptedException, JsonProcessingException {
        List<PessoaEntity> pessoasSemEndereco  = pessoaRepository.pessoaSemEndereco();
        if (!pessoasSemEndereco.isEmpty()) {
            for (PessoaEntity pessoa: pessoasSemEndereco) {
            emailKafka.enviarKafkaAtualizarEndereco(pessoa);
            }
        }
    }

    @Scheduled(cron = "0 0 8 23 12 *", zone = "GMT-3")
    public void meuSegundoScheduler() throws InterruptedException, JsonProcessingException {
        List<PessoaEntity> todasAsPessoas  = pessoaRepository.findAll();
        for (PessoaEntity pessoa: todasAsPessoas) {
            emailKafka.enviarKafkaPromocaoNatal(pessoa);
        }
    }

    @Scheduled(cron = "0 18 9 * * *", zone = "GMT-3")
    public void schedulerComKafka() throws JsonProcessingException {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setAssunto("oi");
        emailDTO.setDestinatario("camile.oliveira@dbccompany.com.br");
        emailDTO.setTexto("feliz da vida");
        producer.sendMessageDTO(emailDTO);
    }
}
