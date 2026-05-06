package com.example.sec.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.")
    @Size(max = 100, message = "O nome deve ter no máximo cem caracteres.")
    private String nome;

    @NotBlank(message = "O email é obrigatório.")
    @Email(message = "Deve ser um email válido.")
    private String email;

    @NotBlank(message = "A senha é obrigatória.")
    @Size (min = 3 , max = 8, message = "Senha deve ter entre 3 a 8 digitos.")
    private String senha;

    public UsuarioRequestDTO() {
    }

    public UsuarioRequestDTO(
            @NotBlank(message = "O nome é obrigatório.") @Size(min = 2, message = "O nome deve ter no mínimo dois caracteres.") @Size(max = 100, message = "O nome deve ter no máximo cem caracteres.") String nome,
            @NotBlank(message = "O email é obrigatório.") @Email(message = "Deve ser um email válido.") String email,
            @NotBlank(message = "A senha é obrigatória.") @Size(min = 3, max = 8, message = "Senha deve ter entre 3 a 8 digitos.") String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
