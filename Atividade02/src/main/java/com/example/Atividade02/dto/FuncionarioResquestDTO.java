package com.example.Atividade02.dto;

import com.example.Atividade02.model.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class FuncionarioResquestDTO {
    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "Seu número de matrícula é obrigatório")
    private String matricula;

    @NotBlank(message = "Sua data de nascimento é obrigatória")
    private String dataNascimento;

    @NotNull(message = "Seu salário é obrigatório")
    private Double salario;

    @NotBlank(message = "Seu email é obrigatório")
    private String email;

    @NotNull(message = "O endereço é obrigatório")
    private Endereco endereco;

    public FuncionarioResquestDTO() {
    }

    public FuncionarioResquestDTO(String nome, String matricula, String dataNascimento, Double salario, String email, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public @NotBlank(message = "O nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Seu número de matrícula é obrigatório") String getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotBlank(message = "Seu número de matrícula é obrigatório") String matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "Sua data de nascimento é obrigatória") String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "Sua data de nascimento é obrigatória") String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull(message = "Seu salário é obrigatório") Double getSalario() {
        return salario;
    }

    public void setSalario(@NotNull(message = "Seu salário é obrigatório") Double salario) {
        this.salario = salario;
    }

    public @NotBlank(message = "Seu email é obrigatório") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Seu email é obrigatório") String email) {
        this.email = email;
    }

    public @NotNull(message = "O endereço é obrigatório") Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull(message = "O endereço é obrigatório") Endereco endereco) {
        this.endereco = endereco;
    }
}
