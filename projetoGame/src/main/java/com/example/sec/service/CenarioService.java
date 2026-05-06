package com.example.sec.service;

import java.util.List;

import com.example.sec.dto.CenarioRequestDTO;
import com.example.sec.dto.CenarioResponseDTO;
import com.example.sec.model.CenarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.sec.repository.CenarioRepository;

@Service
public class CenarioService {
    @Autowired
    private CenarioRepository repository;

    public List<CenarioResponseDTO> listarTodos() {
        return repository
                .findAll()
                .stream()
                .map(cenario -> new CenarioResponseDTO((cenario.getNome()),cenario.getTipo(),cenario.getHistoria()))
                .toList();

    }

    public CenarioModel salvarCenario(CenarioRequestDTO cenarioDTO){
        if (repository.findByNome(cenarioDTO.getNome()).isPresent()){
            throw new RuntimeException("Cenário já criado");
        }
        CenarioModel novoCenario = new CenarioModel();
        novoCenario.setNome(cenarioDTO.getNome());
        novoCenario.setTipo(cenarioDTO.getTipo());
        novoCenario.setMusica(cenarioDTO.getMusica());
        novoCenario.setHistoria(cenarioDTO.getHistoria());
        return repository.save(novoCenario);
    }


    
}
