package com.example.Atividade01.service;

import com.example.Atividade01.dto.AlunoRequestDTO;
import com.example.Atividade01.dto.AlunoResponseDTO;
import com.example.Atividade01.dto.CursoResponseDTO;
import com.example.Atividade01.model.AlunoModel;
import com.example.Atividade01.model.CursoModel;
import com.example.Atividade01.repository.AlunoRepository;
import com.example.Atividade01.repository.CursoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<CursoResponseDTO>listarCursos() {
        return repository
                .findAll()
                .stream()
                .map(curso-> new CursoResponseDTO(curso.getNome(), curso.getTurma(),curso.getMateria(),curso.getTurno()))
                .toList();
    }

    public CursoModel salvarCursos(CursoRequestDTO cursoDTO){
        if (repository.findByNome(cursoDTO.getMatricula()).isPresent()){
            throw new RuntimeException("Aluno já cadastrado!");
        }

        AlunoModel novoAluno = new AlunoModel();
        novoAluno.setNome(alunoDTO.getNome());
        novoAluno.setSexo(alunoDTO.getSexo());
        novoAluno.setIdade(alunoDTO.getIdade());
        novoAluno.setMatricula(alunoDTO.getMatricula());
        novoAluno.setSenha(passwordEncoder.encode(alunoDTO.getSenha()));

        return repository.save(novoAluno);
    }

    @Transactional
    public AlunoResponseDTO atualizarAluno(Long id, AlunoRequestDTO alunoDTO) {
        AlunoModel alunoExistente = repository.findById(id)
                .orElseThrow(() -> new  IllegalArgumentException("Este aluno não existe!"));

        alunoExistente.setNome(alunoDTO.getNome());
        alunoExistente.setMatricula(alunoDTO.getMatricula());
        alunoExistente.setSexo(alunoDTO.getSexo());
        alunoExistente.setIdade(alunoDTO.getIdade());
        AlunoModel atualizado = repository.save(alunoExistente);

        return new AlunoResponseDTO(atualizado.getNome(),atualizado.getMatricula(),atualizado.getSexo(),atualizado.getIdade());
    }

    @Transactional
    public void deletarAluno(Long id){
        if (!repository.existsById(id)) {
            throw new RuntimeException("Este aluno não existe!");
        }
        repository.existsById(id);
    }

}
