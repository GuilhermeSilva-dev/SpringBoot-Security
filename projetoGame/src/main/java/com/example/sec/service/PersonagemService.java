package com.example.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sec.dto.PersonagemRequestDTO;
import com.example.sec.dto.PersonagemResponseDTO;
import com.example.sec.model.PersonagemModel;
import com.example.sec.repository.PersonagemRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonagemService {
    @Autowired
    private PersonagemRepository pRepository;

   

    public List<PersonagemResponseDTO>listarPersonagens(){
        return pRepository.findAll().stream().map(p ->  new PersonagemResponseDTO(p.getNome(),p.getRaca(),p.getClasse(),p.getSexo(),p.getNivel(),p.getHabilidade())).toList();
    
    }

    public PersonagemModel salvarPersonagens(PersonagemRequestDTO personagemDTO){
        if (pRepository.findByHabilidade(personagemDTO.getHabilidade()).isPresent()) {
            throw new RuntimeException("Esta habilidade já existe...Logo este personagem já existe.");
        }
        PersonagemModel nPersonagem = new PersonagemModel();
        nPersonagem.setNome(personagemDTO.getNome());
        nPersonagem.setSexo(personagemDTO.getSexo());
        nPersonagem.setClasse(personagemDTO.getClasse());
        nPersonagem.setNivel(personagemDTO.getNivel());
        nPersonagem.setRaca(personagemDTO.getRaca());
        nPersonagem.setHistoria(personagemDTO.getHistoria());
        nPersonagem.setHabilidade(personagemDTO.getHabilidade());

        return pRepository.save(nPersonagem);
    }

    @Transactional
    public PersonagemResponseDTO atualizarPersonagem(Long id, PersonagemRequestDTO dto) {
        // 1. Verifica se o personagem existe
        PersonagemModel personagemExistente = pRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Personagem não encontrado com o ID: " + id));

        // 2. Validação de "Habilidade" Única
        // Só validamos se a habilidade enviada for diferente da que ele já tem
        if (!personagemExistente.getHabilidade().equals(dto.getHabilidade())) {
            if (pRepository.findByHabilidade(dto.getHabilidade()).isPresent()) {
                throw new RuntimeException("Não é possível atualizar: esta habilidade já pertence a outro personagem.");
            }
        }

        // 3. Atualiza os campos (Exceto o ID)
        personagemExistente.setNome(dto.getNome());
        personagemExistente.setRaca(dto.getRaca());
        personagemExistente.setClasse(dto.getClasse());
        personagemExistente.setSexo(dto.getSexo());
        personagemExistente.setNivel(dto.getNivel());
        personagemExistente.setHabilidade(dto.getHabilidade());
        personagemExistente.setHistoria(dto.getHistoria());

        // 4. Salva e converte para ResponseDTO
        PersonagemModel atualizado = pRepository.save(personagemExistente);
        
        return new PersonagemResponseDTO(
            atualizado.getNome(), atualizado.getRaca(), atualizado.getClasse(), 
            atualizado.getSexo(), atualizado.getNivel(), atualizado.getHabilidade()
        );
    }

    @Transactional
    public void deletarPersonagem(Long id) {
        // Verifica se existe antes de tentar deletar para evitar erros de banco
        if (!pRepository.existsById(id)) {
            throw new RuntimeException("Erro ao deletar: Personagem com ID " + id + " não existe.");
        }
        pRepository.deleteById(id);
    }

}