package com.example.projetoFixacao.service;

import com.example.projetoFixacao.dto.FuncionarioRequestDTO;
import com.example.projetoFixacao.dto.FuncionarioResponseDTO;
import com.example.projetoFixacao.model.FuncionarioModel;
import com.example.projetoFixacao.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private FuncionarioRepository repository;

    public List<FuncionarioResponseDTO> listarTodos() {
        return repository
                .findAll()
                .stream()
                .map(funcionario -> new FuncionarioResponseDTO((funcionario.getNome()),funcionario.getEmail()))
                .toList();
    }

    public FuncionarioModel salvarFuncionario(FuncionarioRequestDTO funcionarioDTO){
        if (repository.findByEmail(funcionarioDTO.getEmail()).isPresent()){
            throw new RuntimeException("Funcionário já cadastrado");
        }
        FuncionarioModel novoFuncionario = new FuncionarioModel();
        novoFuncionario.setNome(funcionarioDTO.getNome());
        novoFuncionario.setEmail(funcionarioDTO.getEmail());
        novoFuncionario.setSenha(passwordEncoder.encode(funcionarioDTO.getSenha()));
        novoFuncionario.setTelefone(funcionarioDTO.getTelefone());
        return repository.save(novoFuncionario);




    }
}
