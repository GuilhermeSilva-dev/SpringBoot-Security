package com.example.sec.model.enums;

public enum Classe {
    GUERREIRO("Guerreiro"),
    BERSERKER("Berserker"),
    MAGO("Mago"),
    DRUIDA("Druida"),
    ARCANO("Arcano"),
    TECNO("Tecno"),
    TANK("Tank");

    private String classe;

    private Classe(String classe){
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }
    
    
}
