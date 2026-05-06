package com.example.sec.model.enums;

public enum Raca {
    HUMANO("Humano"),
    ELFO("Elfo"),
    ANAO("Anão"),
    VAMPIRO("Vampiro"),
    MEIO_SANGUE("Meio Sangue");

    private String raca;

    private Raca(String raca){
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }
    
}
