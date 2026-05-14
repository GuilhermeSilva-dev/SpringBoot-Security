package com.example.Atividade01.controller;

import com.example.Atividade01.dto.AlunoRequestDTO;
import com.example.Atividade01.dto.AlunoResponseDTO;
import com.example.Atividade01.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoService service;

    @GetMapping
    ResponseEntity<List<AlunoResponseDTO>>listar(){
        return ResponseEntity.status(HttpStatus.OK).body(service.listarAlunos());

    }
    @PostMapping
    public ResponseEntity<Map<String,Object>>salvar(@Valid @RequestBody AlunoRequestDTO alunoDTO){
        service.salvarAlunos(alunoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem","Aluno cadastrado com sucesso!"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String,Object>>atualizar(@PathVariable Long id, @Valid @RequestBody AlunoRequestDTO alunoDTO){
       service.atualizarAluno(id, alunoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Aluno atualizado com sucesso!"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Object>>deletar(@PathVariable Long id){
        service.deletarAluno(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem","Aluno excluído com sucesso!!"));
    }
}
