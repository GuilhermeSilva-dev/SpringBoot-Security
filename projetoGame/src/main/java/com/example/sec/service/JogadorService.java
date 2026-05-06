package com.example.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.sec.dto.JogadorRequestDTO;
import com.example.sec.dto.JogadorResponseDTO;
import com.example.sec.model.JogadorModel;
import com.example.sec.repository.JogadorRepository;

import jakarta.transaction.Transactional;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<JogadorResponseDTO>listarJogadores(){
        return jogadorRepository.findAll().stream().map(j -> new JogadorResponseDTO(j.getNome(),j.getEmail(),j.getSexo())).toList();
    }

    public JogadorModel salvarJogadores(JogadorRequestDTO jogadorDTO){
        if (jogadorRepository.findByEmail(jogadorDTO.getEmail()).isPresent()) {
            throw new RuntimeException("Jogador já cadastrado!");
        }
        JogadorModel novUsuario = new JogadorModel();
        novUsuario.setEmail(jogadorDTO.getEmail());
        novUsuario.setNome(jogadorDTO.getNome());
        novUsuario.setIdade(jogadorDTO.getIdade());
        novUsuario.setSenha(passwordEncoder.encode(jogadorDTO.getSenha()));
        novUsuario.setSexo(jogadorDTO.getSexo());

        return jogadorRepository.save(novUsuario);
    }

    @Transactional
public JogadorResponseDTO atualizarJogador(Long id, JogadorRequestDTO jogadorDTO) {
    // 1. Busque o jogador existente (isso traz a senha e o ID do banco)
    JogadorModel jogadorExistente = jogadorRepository.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Este jogador não existe!"));

    // 2. Atualize apenas os campos necessários no objeto que VEIO do banco
    jogadorExistente.setNome(jogadorDTO.getNome());
    jogadorExistente.setEmail(jogadorDTO.getEmail());
    jogadorExistente.setIdade(jogadorDTO.getIdade());
    jogadorExistente.setSexo(jogadorDTO.getSexo());
    
    // Se quiser permitir atualizar a senha, teria que fazer o encode aqui:
    // jogadorExistente.setSenha(passwordEncoder.encode(jogadorDTO.getSenha()));

    // 3. O save agora fará um UPDATE, pois o objeto já tem ID e senha
    JogadorModel atualizado = jogadorRepository.save(jogadorExistente);

    return new JogadorResponseDTO(atualizado.getNome(), atualizado.getEmail(), atualizado.getSexo());
}

    @Transactional
    public void deletarJogador(Long id){
        if (!jogadorRepository.existsById(id)) {
            throw new RuntimeException("Este jogador não existe!");
        }
        jogadorRepository.deleteById(id);
    }
}
