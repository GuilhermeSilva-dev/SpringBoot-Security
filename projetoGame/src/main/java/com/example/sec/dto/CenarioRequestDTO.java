package com.example.sec.dto;

import com.example.sec.model.enums.TiposCenario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CenarioRequestDTO {
    @NotBlank(message = "Nome do cenário é obrigatório!")
    @Size(min = 15, max = 200, message = "O nome do cenário deve conter entre 15 e 200 caracteres")
    private String nome;

    @NotNull(message = "O cenário deve ser um dos registrados no sistema.")
    private TiposCenario tipo;

    @NotBlank(message =  "Nome da música é obrigatório!")
    @Size(min = 10, message = "o mínimo que uma música pode ter é 10 caracteres.")
    @Size(max =217, message = "O máximo que uma música pode ter é 200 caracteres")
    private String musica;

    @NotBlank(message = "A história é obrigatória")
    @Size(min = 40, message = "A história deve ter o minimo de 40 caracteres")
    @Size(max = 250, message = "A história deve ter o máximo de 250 caracteres")
    private String historia;

    public CenarioRequestDTO() {

    }

    public CenarioRequestDTO(String nome, TiposCenario tipo, String musica, String historia) {
        this.nome = nome;
        this.tipo = tipo;
        this.musica = musica;
        this.historia = historia;
    }

    public @NotBlank(message = "Nome do cenário é obrigatório!") @Size(min = 15, max = 200, message = "O nome do cenário deve conter entre 15 e 200 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome do cenário é obrigatório!") @Size(min = 15, max = 200, message = "O nome do cenário deve conter entre 15 e 200 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotNull(message = "O cenário deve ser um dos registrados no sistema.") TiposCenario getTipo() {
        return tipo;
    }

    public void setTipo(@NotNull(message = "O cenário deve ser um dos registrados no sistema.") TiposCenario tipo) {
        this.tipo = tipo;
    }

    public @NotBlank(message = "Nome da música é obrigatório!") @Size(min = 10, message = "o mínimo que uma música pode ter é 10 caracteres.") @Size(max = 217, message = "O máximo que uma música pode ter é 200 caracteres") String getMusica() {
        return musica;
    }

    public void setMusica(@NotBlank(message = "Nome da música é obrigatório!") @Size(min = 10, message = "o mínimo que uma música pode ter é 10 caracteres.") @Size(max = 217, message = "O máximo que uma música pode ter é 200 caracteres") String musica) {
        this.musica = musica;
    }

    public @NotBlank(message = "A história é obrigatória") @Size(min = 40, message = "A história deve ter o minimo de 40 caracteres") @Size(max = 250, message = "A história deve ter o máximo de 250 caracteres") String getHistoria() {
        return historia;
    }

    public void setHistoria(@NotBlank(message = "A história é obrigatória") @Size(min = 40, message = "A história deve ter o minimo de 40 caracteres") @Size(max = 250, message = "A história deve ter o máximo de 250 caracteres") String historia) {
        this.historia = historia;
    }
}
