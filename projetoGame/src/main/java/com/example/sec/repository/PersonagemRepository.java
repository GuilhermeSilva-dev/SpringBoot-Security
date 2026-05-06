package com.example.sec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sec.model.PersonagemModel;




@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemModel,Long>{
    Optional<PersonagemModel>findByHabilidade(String habilidade);
}
