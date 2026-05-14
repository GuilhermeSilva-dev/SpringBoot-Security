package com.example.Atividade01.dto;

import com.example.Atividade01.model.enums.Sexo;
import com.example.Atividade01.model.enums.Turno;
import jakarta.validation.constraints.*;

public class CursoRequestDTO {
    @NotBlank(message = "O nome é obrigatório. ")
    @Size(min = 5, message = "O nome deve ter o mínimo de 5 caracteres")
    @Size(max = 40, message = "O nome deve ter o máximo de 40 caracteres")
    private String nome;


    @NotBlank(message = "A senha é obrigatória.")
    private String turma;

    @NotNull(message = "Obrigatório o nome da matéria")
    private String materia;

    @NotNull(message = "Usar um dos turnos indicados pelo sistema")
    private Turno turno;

    public CursoRequestDTO() {
    }

    public CursoRequestDTO(String nome, String turma, String materia, Turno turno) {
        this.nome = nome;
        this.turma = turma;
        this.materia = materia;
        this.turno = turno;
    }

    public @NotBlank(message = "O nome é obrigatório. ") @Size(min = 5, message = "O nome deve ter o mínimo de 5 caracteres") @Size(max = 40, message = "O nome deve ter o máximo de 40 caracteres") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório. ") @Size(min = 5, message = "O nome deve ter o mínimo de 5 caracteres") @Size(max = 40, message = "O nome deve ter o máximo de 40 caracteres") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "A senha é obrigatória.") String getTurma() {
        return turma;
    }

    public void setTurma(@NotBlank(message = "A senha é obrigatória.") String turma) {
        this.turma = turma;
    }

    public @NotNull(message = "Obrigatório o nome da matéria") String getMateria() {
        return materia;
    }

    public void setMateria(@NotNull(message = "Obrigatório o nome da matéria") String materia) {
        this.materia = materia;
    }

    public @NotNull(message = "Usar um dos turnos indicados pelo sistema") Turno getTurno() {
        return turno;
    }

    public void setTurno(@NotNull(message = "Usar um dos turnos indicados pelo sistema") Turno turno) {
        this.turno = turno;
    }
}
