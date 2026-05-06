package com.example.sec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sec.dto.PersonagemRequestDTO;
import com.example.sec.dto.PersonagemResponseDTO;
import com.example.sec.service.PersonagemService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {
    @Autowired
    private PersonagemService pService;

    @GetMapping
    public ResponseEntity<List<PersonagemResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(pService.listarPersonagens());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody PersonagemRequestDTO peRequestDTO){
        pService.salvarPersonagens(peRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Personagem cadastrado com sucesso!!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>> atualizar(@PathVariable Long id, @Valid @RequestBody PersonagemRequestDTO peRequestDTO){
        pService.atualizarPersonagem(id, peRequestDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Personagem atualizado com sucesso!!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>> deletar(@PathVariable Long id){
        pService.deletarPersonagem(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Personagem deletado com sucesso!!"));
    }
}
