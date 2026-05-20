package com.example.Atividade02.model.enums;

public enum UnidadeFederativa {
    BAHIA("bahia","BA"),
    SAO_PAULO("saoPaulo", "SP"),
    RIO_DE_JANEIRO("rioDeJaneiro", "RJ");

    private String nome;
    private String sigla;

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
