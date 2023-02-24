package com.github.juniorwjs90.remake_testcrud.controller;

import com.github.juniorwjs90.remake_testcrud.entity.Aluno;
import com.github.juniorwjs90.remake_testcrud.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
@AllArgsConstructor

public class AlunoController {
    private final AlunoService service;
    @PostMapping
    public Aluno alunoParaSalvar(@RequestBody Aluno salvarAluno){
        return service.salvarAluno(salvarAluno);
    }
}