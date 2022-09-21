package com.example.voces.teu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voces.teu.domain.cliente;
import com.example.voces.teu.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository  clienteRepository;

    public List<cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Object findById(Long id) {
        return clienteRepository.findById(id).get();
    }

    public void save(cliente cliente) {
        clienteRepository.save(cliente);
    }



    
}
