package com.example.sec.model;

import com.example.sec.model.enums.TiposCenario;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cenarios")
public class CenarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TiposCenario tipo;

    @Column(nullable = false)
    private String musica;

    @Column(nullable = false)
    private String historia;

    public CenarioModel() {
    }

    public CenarioModel(Long id, String nome, TiposCenario tipo, String musica,
            String historia) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.musica = musica;
        this.historia = historia;
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

    public TiposCenario getTipo() {
        return tipo;
    }

    public void setTipo(TiposCenario tipo) {
        this.tipo = tipo;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    
    
    
}
