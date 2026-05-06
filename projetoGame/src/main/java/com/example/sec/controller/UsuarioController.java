package com.example.sec.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sec.dto.UsuarioRequestDTO;
import com.example.sec.dto.UsuarioResponseDTO;
import com.example.sec.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.listarUsuarios());
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody UsuarioRequestDTO usuarioDTO){
        usuarioService.salvarUsuarios(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","usuário cadastrado com sucesso"));
    }
}
