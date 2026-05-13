package com.example.Atividade01.model;

import com.example.Atividade01.model.enums.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_alunos")
public class AlunoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false,unique = true)
    private int matricula;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(nullable = false)
    private int idade;

    public AlunoModel() {
    }

    public AlunoModel(Long id, String nome, int matricula, String senha, Sexo sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        this.sexo = sexo;
        this.idade = idade;
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
