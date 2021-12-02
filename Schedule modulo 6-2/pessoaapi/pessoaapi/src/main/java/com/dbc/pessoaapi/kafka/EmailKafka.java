package com.dbc.pessoaapi.kafka;

import com.dbc.pessoaapi.dto.EmailDTO;
import com.dbc.pessoaapi.entity.PessoaEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmailKafka {
    private final Producer producer;

    public void enviarKafkaPromocaoNatal(PessoaEntity pessoaEntity) throws JsonProcessingException {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setDestinatario(pessoaEntity.getEmail());
        emailDTO.setAssunto("Promoção de Natal");
        emailDTO.setTexto("Olá " + pessoaEntity.getNome() + "," +
                "\n\nSelecionamos algumas das nossas super promoções de natal na nossa plataforma especialmente para você:" +
                "\n-Na compra de 1CD do Chitãozinho e Xororó, ganhe 1 do Milionário e José Rico." +
                "\n-Na locação de um filme em VHS, a outra locação é grátis" +
                "\n-Fita de Super Nitendo com 50% de desconto." +
                "\n\nAproveite...\nMagazine OldSchool");
        producer.sendMessageDTO(emailDTO);
    }

    public void enviarKafkaAtualizarEndereco(PessoaEntity pessoaEntity) throws JsonProcessingException {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setDestinatario(pessoaEntity.getEmail());
        emailDTO.setAssunto("Atualize seu endereço");
        emailDTO.setTexto("Olá " + pessoaEntity.getNome() + ",\n\nEstamos muito felizes que você está em nosso sistema.\n" +
                "Para que possamos envia-lo um brinde excluisivo, por gentileza, adicione ou atualize o seu endereço no seu cadastro \n\n" +
                "Muito Obrigado,\nSistema de Pessoas.");
        producer.sendMessageDTO(emailDTO);
    }
}
