package com.example.Atividade01.service;

import com.example.Atividade01.dto.AlunoRequestDTO;
import com.example.Atividade01.dto.AlunoResponseDTO;
import com.example.Atividade01.model.AlunoModel;
import com.example.Atividade01.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<AlunoResponseDTO>listarAlunos() {
        return AlunoRepository.findAll().stream().map(j -> new AlunoResponseDTO(j.getNome(),j.getMatricula(),j.getSenha(),j.getSexo(),j.getIdade())).toList();
    }

    public AlunoModel salvarAlunos(AlunoRequestDTO alunoDTO){
        if (AlunoRepository.)
    }
}
