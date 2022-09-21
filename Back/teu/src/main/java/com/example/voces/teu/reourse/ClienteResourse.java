package com.example.voces.teu.reourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.voces.teu.domain.cliente;
import com.example.voces.teu.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")

public class ClienteResourse {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<cliente>> obterTodosClientes() {
        List<cliente> clientes = clienteService.findAll();
        if (clientes.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(clientes);
    }
    @GetMapping("/{id}")
    public ResponseEntity<cliente> obterId(@PathVariable("id") Long id){
       cliente cliente;
       try{
        cliente = (com.example.voces.teu.domain.cliente) clienteService.findById(id);
        return ResponseEntity.ok(cliente);
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }

        
      
    }
    @PostMapping
    public  cliente saveCliente(@ResquestBody cliente cliente){
         clienteService.save(cliente);
         return cliente;



    }

}


/*{
    "nome": "Jorge",
    "cpf": "77777777777777",
    "email": "jorge@hotmal.com",
    endereco{
        "logradouro": "AV goias",
        "bairro": "Central",
        "cidade": "Goiania",
        "uf": "GO"
        "cep":"77777777777"
    }*/
    