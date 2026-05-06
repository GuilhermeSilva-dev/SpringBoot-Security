package com.example.sec.model.enums;

public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    INDETERMINADO("Indeterminado");

    private String sexo;
    private Sexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }
    
}
