package com.example.sec.controller;

import com.example.sec.dto.CenarioRequestDTO;
import com.example.sec.dto.CenarioResponseDTO;
import com.example.sec.service.CenarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cenarios")
public class CenarioController {
    @Autowired
    private CenarioService service;

   @GetMapping
   public ResponseEntity<List<CenarioResponseDTO>> listar() {
       return ResponseEntity
               .status(HttpStatus.OK)
               .body(service.listarTodos());
   }

   @PostMapping
    public ResponseEntity<Map<String, Object>> salvar(
           @Valid @RequestBody CenarioRequestDTO cenarioDTO){
       service.salvarCenario(cenarioDTO);
       return ResponseEntity
               .status(HttpStatus.CREATED)
               .body(Map.of("mensagem", "Cenário cadastrado com sucesso"));
   }
}
