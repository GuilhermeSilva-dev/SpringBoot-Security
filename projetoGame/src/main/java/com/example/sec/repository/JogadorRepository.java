package com.example.sec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sec.model.JogadorModel;



@Repository
public interface JogadorRepository extends JpaRepository<JogadorModel,Long>{
    Optional<JogadorModel>findByEmail(String email);
}
