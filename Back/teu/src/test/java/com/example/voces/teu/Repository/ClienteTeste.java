package com.example.voces.teu.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.voces.teu.domain.cliente;
import com.example.voces.teu.domain.endereco;
import com.example.voces.teu.repository.ClienteRepository;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

@DataJpaTest
public class ClienteTeste {

    @Autowired
    private ClienteRepository clienteRepository;


    @Test
    public void testAddCliente(){
        endereco endereco  = new endereco("Av.goias","Central","Goiania","GO","740000000");
        cliente cliente = new cliente("Jorge" ,"702558558854554","jorge!@gmail.com",endereco);

        cliente saveCliente = clienteRepository.save(cliente);

        assertThat(saveCliente).isNotNull();
        assertThat((saveCliente).getId()).isGreaterThan(0);

        assertThat(saveCliente.getEndereco()).isNotNull();
        assertThat(saveCliente.getEndereco().getId()).isGreaterThan(0);
    }


    
}
