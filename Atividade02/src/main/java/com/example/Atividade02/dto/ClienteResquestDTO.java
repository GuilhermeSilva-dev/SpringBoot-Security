package com.example.Atividade02.dto;

import com.example.Atividade02.model.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ClienteResquestDTO {
    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 3, message = "O nome deve conter o mínimo de 3 caracteres")
    @Size(max = 60, message = "O nome deve conter o máximo de 60 caracteres")
    private String nome;

    @NotBlank(message = "O email é obrigatório")
    private String email;

    @NotNull(message = "O endereço é obrigatório")
    private Endereco endereco;

    public ClienteResquestDTO() {
    }

    public ClienteResquestDTO(String nome, String email, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "O nome é obrigatório") @Size(min = 3, message = "O nome deve conter o mínimo de 3 caracteres") @Size(max = 60, message = "O nome deve conter o máximo de 60 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") @Size(min = 3, message = "O nome deve conter o mínimo de 3 caracteres") @Size(max = 60, message = "O nome deve conter o máximo de 60 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatório") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório") String email) {
        this.email = email;
    }

    public @NotBlank(message = "O endereço é obrigatório") Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotBlank(message = "O endereço é obrigatório") Endereco endereco) {
        this.endereco = endereco;
    }
}
