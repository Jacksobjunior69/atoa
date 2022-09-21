package com.example.voces.teu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voces.teu.domain.cliente;

@Repository
public interface ClienteRepository extends JpaRepository<cliente, Long > {


    
}
