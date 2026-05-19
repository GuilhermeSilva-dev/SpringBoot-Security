package com.example.Atividade01.service;


import com.example.Atividade01.dto.CursoRequestDTO;
import com.example.Atividade01.dto.CursoResponseDTO;
import com.example.Atividade01.model.CursoModel;
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
        if (repository.findByNome(cursoDTO.getNome()).isPresent()){
            throw new RuntimeException("Curso já cadastrado!");
        }

        CursoModel novoCurso = new CursoModel();
        novoCurso.setNome(cursoDTO.getNome());
        novoCurso.setTurma(cursoDTO.getTurma());
        novoCurso.setMateria(cursoDTO.getMateria());
        novoCurso.setTurno(cursoDTO.getTurno());

        return repository.save(novoCurso);
    }

    @Transactional
    public CursoResponseDTO atualizarCurso(Long id, CursoRequestDTO cursoDTO) {
        CursoModel cursoExistente = repository.findById(id)
                .orElseThrow(() -> new  IllegalArgumentException("Este curso não existe!"));

        cursoExistente.setNome(cursoDTO.getNome());
        cursoExistente.setTurma(cursoDTO.getTurma());
        cursoExistente.setTurno(cursoDTO.getTurno());
        cursoExistente.setMateria(cursoDTO.getMateria());
        CursoModel atualizado = repository.save(cursoExistente);

        return new CursoResponseDTO(atualizado.getNome(),atualizado.getTurma(),atualizado.getMateria(),atualizado.getTurno());
    }

    @Transactional
    public void deletarCurso(Long id){
        if (!repository.existsById(id)) {
            throw new RuntimeException("Este curso não existe!");
        }
        repository.existsById(id);
    }

}
