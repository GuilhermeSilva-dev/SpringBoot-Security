package com.example.Atividade02.service;

import com.example.Atividade02.dto.ClienteResponseDTO;
import com.example.Atividade02.dto.ClienteResquestDTO;
import com.example.Atividade02.model.ClienteModel;
import com.example.Atividade02.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    @Autowired
    public List<ClienteResponseDTO> listarClientes() {
        return repository
                .findAll()
                .stream()
                .map(cliente -> new ClienteResponseDTO(cliente.getNome(),cliente.getEmail(),cliente.getEndereco()))
                .toList();
    }

    public ClienteModel salvarClientes(ClienteResquestDTO clienteDTO){
        if (repository.findByEmail(clienteDTO.getEmail()).isPresent()){
            throw new RuntimeException("Cliente já cadastrado!");

        }
        ClienteModel novoCliente = new ClienteModel();
        novoCliente.setNome(clienteDTO.getNome());
        novoCliente.setEmail(clienteDTO.getEmail());
        novoCliente.setEndereco(clienteDTO.getEndereco());

        return repository.save(novoCliente);
    }

    @Transactional
    public ClienteResponseDTO atualizarCliente(Long id, ClienteResquestDTO clienteDTO) {
        ClienteModel clienteExistente = repository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("Este cliente não existe!"));

        clienteExistente.setNome(clienteDTO.getNome());
        clienteExistente.setEndereco(clienteDTO.getEndereco());
        clienteExistente.setEmail(clienteDTO.getEmail());
        ClienteModel atualizado = repository.save(clienteExistente);

        return new ClienteResponseDTO(atualizado.getNome(),atualizado.getEndereco(),atualizado.getEmail());
    }
}
