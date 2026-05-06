package com.example.sec.dto;

import com.example.sec.model.enums.Sexo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class JogadorRequestDTO {
    @NotBlank(message = "Obrigatório ter nome.")
    @Size(min=5, message = "O nome do jogador(a) deve ter no mínimo 5 caracteres")
    @Size(max=20, message = "O nome do jogador(a) deve ter no máximo 20 caracteres")
    private String nome;

    @NotBlank(message = "Obrigatório ter nome.")
    @Email(message = "Deve ser inserido um email válido.")
    private String email;

    @NotBlank
    @Size(min = 6, max = 20, message = "A senha deve possui entre 6 a 20 caracteres.")
    private String senha;

    @NotNull(message = "O deve ser inserido os sexos definidos pelo sistema")
    private Sexo sexo;

    @NotNull(message = "Obirgatória a idade")
    private Integer idade;

    public JogadorRequestDTO() {
    }

    public JogadorRequestDTO(
            @NotBlank(message = "Obrigatório ter nome.") @Size(min = 5, message = "O nome do jogador(a) deve ter no mínimo 5 caracteres") @Size(max = 20, message = "O nome do jogador(a) deve ter no máximo 20 caracteres") String nome,
            @NotBlank(message = "Obrigatório ter nome.") @Email(message = "Deve ser inserido um email válido.") String email,
            @NotBlank @Size(min = 6, max = 20, message = "A senha deve possui entre 6 a 20 caracteres.") String senha,
            @NotNull(message = "O deve ser inserido os sexos definidos pelo sistema") Sexo sexo,
            @NotNull(message = "Obirgatória a idade") Integer idade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.idade = idade;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    
}
