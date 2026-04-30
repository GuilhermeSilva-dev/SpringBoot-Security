package com.example.projetoFixacao.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class FuncionarioRequestDTO {
    @NotBlank(message = "O nome é obrigatório.")
    @Size(min = 3, message = "O nome deve ter no mínimo 2 caracteres")
    @Size(max = 30, message = "O nome deve ter no máximo 30 caracteres")
    private String nome;

    @NotBlank(message = "O email é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @NotBlank(message = "A senha é obrigatório")
    @Size(min = 2, message = "A senha deve ter o mínimo de 2 caracteres. ")
    @Size(max = 15, message = "A senha deve ter o máximo de 15 caracteres.")
    private String senha;

    @NotBlank(message = "Telefone é obrigátorio")
    @Size(min = 10, max = 13, message = "O telefone deve ter o minimo de 10 e máximo de 13 caracteres")
    private String telefone;

    public FuncionarioRequestDTO(){

    }

    public FuncionarioRequestDTO(String nome, String email, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public @NotBlank(message = "O nome é obrigatório.") @Size(min = 3, message = "O nome deve ter no mínimo 2 caracteres") @Size(max = 30, message = "O nome deve ter no máximo 30 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório.") @Size(min = 3, message = "O nome deve ter no mínimo 2 caracteres") @Size(max = 30, message = "O nome deve ter no máximo 30 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "O email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "O email é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "A senha é obrigatório") @Size(min = 2, message = "A senha deve ter o mínimo de 2 caracteres. ") @Size(max = 15, message = "A senha deve ter o máximo de 15 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatório") @Size(min = 2, message = "A senha deve ter o mínimo de 2 caracteres. ") @Size(max = 15, message = "A senha deve ter o máximo de 15 caracteres.") String senha) {
        this.senha = senha;
    }

    public @NotBlank(message = "Telefone é obrigátorio") @Size(min = 10, max = 13, message = "O telefone deve ter o minimo de 10 e máximo de 13 caracteres") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone é obrigátorio") @Size(min = 10, max = 13, message = "O telefone deve ter o minimo de 10 e máximo de 13 caracteres") String telefone) {
        this.telefone = telefone;
    }
}
