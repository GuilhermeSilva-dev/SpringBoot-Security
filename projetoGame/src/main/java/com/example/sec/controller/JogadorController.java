package com.example.sec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.sec.dto.JogadorRequestDTO;
import com.example.sec.dto.JogadorResponseDTO;
import com.example.sec.service.JogadorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    ResponseEntity<List<JogadorResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(jogadorService.listarJogadores());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody JogadorRequestDTO jogadorDTO){
        jogadorService.salvarJogadores(jogadorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Usuário cadastrado com sucesso!")); 
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(@PathVariable Long id, @Valid @RequestBody JogadorRequestDTO jogadorDTO){
        jogadorService.atualizarJogador(id, jogadorDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Personagem atualizado com sucesso!"));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>deletar(@PathVariable Long id){
        jogadorService.deletarJogador(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Jogador excluído com sucesso!!"));
    }
    
}
