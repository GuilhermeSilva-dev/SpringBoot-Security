package com.example.sec.dto;

import com.example.sec.model.enums.Classe;
import com.example.sec.model.enums.Raca;
import com.example.sec.model.enums.Sexo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonagemRequestDTO {
    @NotBlank
    @Size(min = 5, max = 300, message = "O nome do personagem deve ter no mínimo 5 caracteres e no máximo 300 caracteres.")
    private String nome;

    @NotNull(message = "O nível do personagem deve ser informado.")
    private int nivel;

    @NotNull(message = "A classe do personagem deve ser uma das que foram determinadas.")
    private Classe classe;

    @NotNull(message = "A raça do personagem deve ser uma das que foram determinadas.")
    private Raca raca;

    @NotBlank
    @Size(max = 10000, message = "A história do seu personagem não pode ter mais de 10000 letras.")
    private String historia;
    
    @NotNull
    @Size(min = 2, message = "A habilidade não pode ter menos de 2 letras")
    @Size(max = 30, message = "A habilidade não pode ter mais de 30 palavras.")
    private String habilidade;

    @NotNull(message = "O sexo do personagem deve ser um dos sexos determinados no sistema.")
    private Sexo sexo;

    public PersonagemRequestDTO() {
    }

    public PersonagemRequestDTO(
            @NotBlank @Size(min = 5, max = 300, message = "O nome do personagem deve ter no mínimo 5 caracteres e no máximo 300 caracteres.") String nome,
            @NotNull(message = "O nível do personagem deve ser informado.") int nivel,
            @NotNull(message = "A classe do personagem deve ser uma das que foram determinadas.") Classe classe,
            @NotNull(message = "A raça do personagem deve ser uma das que foram determinadas.") Raca raca,
            @NotBlank @Size(max = 10000, message = "A história do seu personagem não pode ter mais de 10000 letras.") String historia,
            @NotNull @Size(min = 2, message = "A habilidade não pode ter menos de 2 letras") @Size(max = 30, message = "A habilidade não pode ter mais de 30 palavras.") String habilidade,
            @NotNull(message = "O sexo do personagem deve ser um dos sexos determinados no sistema.") Sexo sexo) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
        this.raca = raca;
        this.historia = historia;
        this.habilidade = habilidade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    

    
    
}
