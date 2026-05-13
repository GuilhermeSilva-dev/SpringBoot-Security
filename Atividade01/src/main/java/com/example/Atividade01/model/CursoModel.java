package com.example.Atividade01.model;

import com.example.Atividade01.model.enums.Turno;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_alunos")
public class CursoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String turma;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String materia;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Turno turno;

    public CursoModel() {
    }

    public CursoModel(Long id, String nome, String turma, String senha, String materia, Turno turno) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.senha = senha;
        this.materia = materia;
        this.turno = turno;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
