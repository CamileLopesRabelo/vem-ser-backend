package com.dbc.pessoaapi.schedule;

import com.dbc.pessoaapi.entity.PessoaEntity;
import com.dbc.pessoaapi.repository.PessoaRepository;
import com.dbc.pessoaapi.service.EmailService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class MeuNovoSchedulerCron {
    private final EmailService emailService;
    private final PessoaRepository pessoaRepository;

    @Scheduled(cron = "0 0 8,20 * * *", zone = "GMT-3")
    public void meuPrimeiroScheduler() throws InterruptedException {
        List<PessoaEntity> pessoasSemEndereco  = pessoaRepository.pessoaSemEndereco();
        for (PessoaEntity pessoa: pessoasSemEndereco) {
            emailService.enviarEmailSimples(pessoa);
        }
    }

    @Scheduled(cron = "0 44 18 * * *", zone = "GMT-3")
    public void meuSegundoScheduler() throws InterruptedException {
        List<PessoaEntity> todasAsPessoas  = pessoaRepository.findAll();
        for (PessoaEntity pessoa: todasAsPessoas) {
            emailService.enviarEmailNatal(pessoa);
        }
    }
}
