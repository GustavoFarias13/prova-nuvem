package com.gustavofarias.provanuvem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "ano_id")
    private AnoEscolar anoEscolar;

    @ManyToMany
    @JoinTable(
            name = "aluno_prova",
            joinColumns = @JoinColumn(name = "aluno_id"),
            inverseJoinColumns = @JoinColumn(name = "prova_id")
    )
    private List<Prova> provas = new ArrayList<>();
}