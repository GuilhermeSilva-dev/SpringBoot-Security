package com.example.sec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sec.model.CenarioModel;


@Repository
public interface CenarioRepository extends JpaRepository<CenarioModel,Long>{
Optional<CenarioModel>findByNome(String nome);
}
