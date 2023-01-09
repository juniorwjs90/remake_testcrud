package com.github.juniorwjs90.remake_testcrud.service;

import com.github.juniorwjs90.remake_testcrud.entity.Aluno;
import com.github.juniorwjs90.remake_testcrud.repository.AlunoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;

    public Aluno salvarAluno(Aluno alunoParaSalvar){
        return repository.save(alunoParaSalvar);
    }
}
