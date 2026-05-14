package com.example.Atividade01.dto;


import com.example.Atividade01.model.enums.Sexo;

public class AlunoResponseDTO {
    private String nome;
    private int matricula;
    private Sexo sexo;
    private int idade;

    public AlunoResponseDTO() {
    }

    public AlunoResponseDTO(String nome, int matricula, Sexo sexo, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

