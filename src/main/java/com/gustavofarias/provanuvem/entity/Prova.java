package com.gustavofarias.provanuvem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Prova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "materia_id")
    private Materia materia;

    @ManyToMany(mappedBy = "provas")
    private List<Aluno> alunos = new ArrayList<>();

}
