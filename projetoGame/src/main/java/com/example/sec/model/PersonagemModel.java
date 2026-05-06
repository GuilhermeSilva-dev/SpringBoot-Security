package com.example.sec.model;

import com.example.sec.model.enums.Classe;
import com.example.sec.model.enums.Raca;
import com.example.sec.model.enums.Sexo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personagem")
public class PersonagemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private Classe classe;

    @Column(nullable = false)
    private int nivel;

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private Raca raca;

    @Column(nullable = false)
    private String historia;

    @Column(nullable = false, unique = true)
    private String habilidade;

    public PersonagemModel() {
    }

    public PersonagemModel(Long id, String nome, Sexo sexo, Classe classe, int nivel, Raca raca, String historia,
            String habilidade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.classe = classe;
        this.nivel = nivel;
        this.raca = raca;
        this.historia = historia;
        this.habilidade = habilidade;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    
}
