package com.example.Atividade02.repository;

import com.example.Atividade02.model.ClienteModel;
import com.example.Atividade02.model.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
    Optional<ClienteModel> findByMatricula(String matricula);
}
