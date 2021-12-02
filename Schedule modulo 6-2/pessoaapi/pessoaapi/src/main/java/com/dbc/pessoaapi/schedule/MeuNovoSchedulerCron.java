package com.dbc.pessoaapi.schedule;

import com.dbc.pessoaapi.dto.EmailDTO;
import com.dbc.pessoaapi.entity.PessoaEntity;
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

//    @Scheduled(cron = "0 0 8,20 * * *", zone = "GMT-3")
//    public void meuPrimeiroScheduler() throws InterruptedException {
//        List<PessoaEntity> pessoasSemEndereco  = pessoaRepository.pessoaSemEndereco();
//        for (PessoaEntity pessoa: pessoasSemEndereco) {
//            emailService.enviarEmailSimples(pessoa);
//        }
//    }

//    @Scheduled(cron = "0 0 8 23 12 *", zone = "GMT-3")
//    public void meuSegundoScheduler() throws InterruptedException {
//        List<PessoaEntity> todasAsPessoas  = pessoaRepository.findAll();
//        for (PessoaEntity pessoa: todasAsPessoas) {
//            emailService.enviarEmailNatal(pessoa);
//        }
//    }

    @Scheduled(cron = "0 18 9 * * *", zone = "GMT-3")
    public void schedulerComKafka() throws JsonProcessingException {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setAssunto("ahhhh meu deuzu");
        emailDTO.setDestinatario("camile.oliveira@dbccompany.com.br");
        emailDTO.setTexto("e lá vamos nós outra vez");
        producer.sendMessageDTO(emailDTO);
    }
}
