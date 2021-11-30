package com.dbc.veiculoprodutorconsumidor.controller;

import com.dbc.veiculoprodutorconsumidor.service.VeiculoService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.Document;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
@Validated
@Slf4j
@RequiredArgsConstructor
public class VeiculoController {
    private final VeiculoService veiculoService;

    @ApiOperation(value = "Lista os Veiculos")
    @GetMapping
    public List<Document> list() {
        return veiculoService.list();
    }


}
