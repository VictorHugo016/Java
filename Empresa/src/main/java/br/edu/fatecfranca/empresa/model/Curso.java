package br.edu.fatecfranca.empresa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String area;

    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos;

    // Getters e Setters
}
