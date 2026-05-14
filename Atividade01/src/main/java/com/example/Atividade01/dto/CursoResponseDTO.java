package com.example.Atividade01.dto;

import com.example.Atividade01.model.enums.Turno;

public class CursoResponseDTO {
    private String nome;
    private String turma;
    private String materia;
    private Turno turno;

    public CursoResponseDTO() {
    }

    public CursoResponseDTO(String nome, String turma, String materia, Turno turno) {
        this.nome = nome;
        this.turma = turma;
        this.materia = materia;
        this.turno = turno;
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
