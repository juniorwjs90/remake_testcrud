package com.github.juniorwjs90.remake_testcrud.repository;

import com.github.juniorwjs90.remake_testcrud.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long> {
}
