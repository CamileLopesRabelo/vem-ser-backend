package com.dbc.pessoaapi.controller;

import com.dbc.pessoaapi.entity.ProfessorEntity;
import com.dbc.pessoaapi.exception.RegraDeNegocioException;
import com.dbc.pessoaapi.repository.ProfessorRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/professor")
@RequiredArgsConstructor
@Slf4j
public class ProfessorController{

    private final ProfessorRepository professorRepository;

    @GetMapping
    @ApiOperation(value = "Lista os professores")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Professores listados com sucesso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    public List<ProfessorEntity> list() {
        return professorRepository.findAll();
    }

    @PostMapping
    @ApiOperation(value = "Cria novo professor")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "professor criado com sucesso"),
            @ApiResponse(code = 400, message = "professor com dados inconsistentes"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção")
    })
    public ProfessorEntity create(@Valid @RequestBody ProfessorEntity professorEntity) throws RegraDeNegocioException {
        return professorRepository.save(professorEntity);
    }

}
