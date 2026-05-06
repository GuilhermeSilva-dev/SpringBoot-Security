package com.example.sec.dto;

import com.example.sec.model.enums.Sexo;

public class JogadorResponseDTO {
    private String nome;
    private String email;
    private Sexo sexo;
    
    public JogadorResponseDTO() {
    }

    public JogadorResponseDTO(String nome, String email, Sexo sexo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    
}
