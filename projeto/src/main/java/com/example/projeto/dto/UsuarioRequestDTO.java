package com.example.projeto.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 2, message = "O nome deve ter no mínimo 2 caracters")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
    private String nome;

    @NotBlank(message = "O email é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank(message = "A senha é obrigatório.")
    @Size(min = 3,max = 8, message = "A senha deve ter entre 3 a 8 dígitos")
    private String senha;

    public UsuarioRequestDTO() {
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo 2 caracters") @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo 2 caracters") @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatório.") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 a 8 dígitos") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatório.") @Size(min = 3, max = 8, message = "A senha deve ter entre 3 a 8 dígitos") String senha) {
        this.senha = senha;
    }
}
