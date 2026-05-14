package com.example.Atividade01.repository;

import com.example.Atividade01.model.AlunoModel;
import com.example.Atividade01.model.CursoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<CursoModel, Long> {
    Optional<AlunoModel>findByNome(String nome);
}
