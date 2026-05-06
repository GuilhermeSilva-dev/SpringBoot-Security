package com.example.sec.dto;

import com.example.sec.model.enums.Classe;
import com.example.sec.model.enums.Raca;
import com.example.sec.model.enums.Sexo;

public class PersonagemResponseDTO {
    private String nome;
    private Raca raca;
    private Classe classe;
    private Sexo sexo;
    private int nivel;
    private String habilidade;
    
    public PersonagemResponseDTO() {
    }

    public PersonagemResponseDTO(String nome, Raca raca, Classe classe, Sexo sexo, int nivel, String habilidade) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.sexo = sexo;
        this.nivel = nivel;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }
    
    
    
}
