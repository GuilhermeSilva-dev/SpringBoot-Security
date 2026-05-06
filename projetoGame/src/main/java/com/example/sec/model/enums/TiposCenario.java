package com.example.sec.model.enums;

public enum TiposCenario {
    FANTASIA("Fantasy"),
    CYBERPUNK("Cyberpunk"),
    STEAMPUNK("Steampunk"),
    POS_APOLITICO("Pós Apocalíptico"),
    HISTORICO("Realista"),
    ESPACIAL("Espaço"),
    NATURAL("Natureza");

    private String cenario;

    private TiposCenario(String cenario){
        this.cenario = cenario;
    }

    public String getCenario() {
        return cenario;
    }
    
}
