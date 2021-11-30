package com.dbc.chatkafka.controller;



import com.dbc.chatkafka.dto.ProdutorDTO;
import com.dbc.chatkafka.kafka.Producer;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class ProdutorController {
    private final Producer producer;

    @PostMapping("/enviarMensagemGeral")
    public void enviarMensagemGeral(@RequestBody ProdutorDTO produtorDTO) throws JsonProcessingException {
        producer.sendMessageGeral(produtorDTO);
    }

    @PostMapping("/enviarMensagemPrivada")
    public void enviarMensagemPrivada(@RequestBody ProdutorDTO produtorDTO, @RequestParam (value = "topico")String topico) throws JsonProcessingException {
        producer.sendMessagePrivado(produtorDTO,topico);
    }
}
