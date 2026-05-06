package com.example.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.sec.dto.UsuarioRequestDTO;
import com.example.sec.dto.UsuarioResponseDTO;
import com.example.sec.model.UsuarioModel;
import com.example.sec.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private  UsuarioRepository usuarioRepository;

    public List<UsuarioResponseDTO>listarUsuarios(){
        return usuarioRepository.findAll().stream().map(u -> new UsuarioResponseDTO(u.getNome(),u.getEmail())).toList();
    }

    public UsuarioModel salvarUsuarios(UsuarioRequestDTO usuarioDTO){
        if (usuarioRepository.findByEmail(usuarioDTO.getEmail()).isPresent()) {
            throw new RuntimeException("Usuário já cadastrado!");
        }
        UsuarioModel novUsuario= new UsuarioModel();
        novUsuario.setNome(usuarioDTO.getNome());
        novUsuario.setEmail(usuarioDTO.getEmail());
        novUsuario.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));
        
        return usuarioRepository.save(novUsuario);
    }
    
}
