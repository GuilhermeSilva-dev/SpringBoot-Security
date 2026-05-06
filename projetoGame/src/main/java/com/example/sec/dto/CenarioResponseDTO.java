package com.example.sec.dto;

import com.example.sec.model.enums.TiposCenario;

public class CenarioResponseDTO {
    private String nome;
    private TiposCenario tipo;
    private String historia;
    
    public CenarioResponseDTO() {
    }

    public CenarioResponseDTO(String nome, TiposCenario tipo, String historia) {
        this.nome = nome;
        this.tipo = tipo;
        this.historia = historia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TiposCenario getTipo() {
        return tipo;
    }

    public void setTipo(TiposCenario tipo) {
        this.tipo = tipo;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    
}
