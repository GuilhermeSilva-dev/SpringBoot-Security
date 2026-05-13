package com.example.Atividade01.model.enums;

public enum Turno {
    VESPERTINO("Vespertino"),
    MATUTINO("Matutino"),
    NOTURNO("Noturno");

    private String texto;

    Turno(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
