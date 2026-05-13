package com.example.Atividade01.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_professores")
public class ProfessorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column (nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String senha;

    public ProfessorModel() {
    }

    public ProfessorModel(Long id, String nome, String email, String cpf, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
