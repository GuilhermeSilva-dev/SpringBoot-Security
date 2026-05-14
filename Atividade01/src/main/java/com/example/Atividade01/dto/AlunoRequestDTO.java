package com.example.Atividade01.dto;

import com.example.Atividade01.model.enums.Sexo;
import jakarta.validation.constraints.*;

public class AlunoRequestDTO {
    @NotBlank(message = "O nome é obrigatório. ")
    @Size(min = 5, message = "O nome deve ter o mínimo de 5 caracteres")
    @Size(max = 40, message = "O nome deve ter o máximo de 40 caracteres")
    private String nome;

    @NotNull(message = "A mátricula é obrigatório")
    @Min(value = 10000, message = "A matricula deve ter o minimo de 6 digitos")
    @Max(value = 99999999, message = "A matricula deve ter o máximo de 15 digitos" )
    private int matricula;

    @NotBlank(message = "A senha é obrigatória.")
    @Size(min = 4, message = "A senha deve ter o mínimo de 4 caracteres")
    @Size(max = 20, message = "A senha deve ter o máximo de 15 carateres-")
    private String senha;

    @NotNull(message = "Deve inserir as opções definidas pelo sistema")
    private Sexo sexo;

    @NotNull(message = "A idade é obrigatória")
    private int idade;

    public AlunoRequestDTO() {
    }

    public AlunoRequestDTO(String nome, int matricula, String senha, Sexo sexo, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
        this.sexo = sexo;
        this.idade = idade;
    }

    public @NotBlank(message = "O nome é obrigatório. ") @Size(min = 5, message = "O nome deve ter o mínimo de 5 caracteres") @Size(max = 40, message = "O nome deve ter o máximo de 40 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório. ") @Size(min = 5, message = "O nome deve ter o mínimo de 5 caracteres") @Size(max = 40, message = "O nome deve ter o máximo de 40 caracteres") String nome) {
        this.nome = nome;
    }

    @NotNull(message = "A mátricula é obrigatório")
    @Min(value = 10000, message = "A matricula deve ter o minimo de 6 digitos")
    @Max(value = 99999999, message = "A matricula deve ter o máximo de 15 digitos")
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(@NotNull(message = "A mátricula é obrigatório") @Min(value = 10000, message = "A matricula deve ter o minimo de 6 digitos") @Max(value = 99999999, message = "A matricula deve ter o máximo de 15 digitos") int matricula) {
        this.matricula = matricula;
    }

    public @NotBlank(message = "A senha é obrigatória.") @Size(min = 4, message = "A senha deve ter o mínimo de 4 caracteres") @Size(max = 20, message = "A senha deve ter o máximo de 15 carateres-") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "A senha é obrigatória.") @Size(min = 4, message = "A senha deve ter o mínimo de 4 caracteres") @Size(max = 20, message = "A senha deve ter o máximo de 15 carateres-") String senha) {
        this.senha = senha;
    }

    public @NotNull(message = "Deve inserir as opções definidas pelo sistema") Sexo getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull(message = "Deve inserir as opções definidas pelo sistema") Sexo sexo) {
        this.sexo = sexo;
    }

    @NotNull(message = "A idade é obrigatória")
    public int getIdade() {
        return idade;
    }

    public void setIdade(@NotNull(message = "A idade é obrigatória") int idade) {
        this.idade = idade;
    }
}
