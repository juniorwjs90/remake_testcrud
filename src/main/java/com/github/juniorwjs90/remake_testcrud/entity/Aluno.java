package com.github.juniorwjs90.remake_testcrud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data_nascimento;
    private String email;
    private String matricula;
    private String name;

}
