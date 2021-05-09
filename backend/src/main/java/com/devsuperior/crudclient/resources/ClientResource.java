package com.devsuperior.crudclient.resources;

import com.devsuperior.crudclient.entities.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> list = new ArrayList<>();
        list.add(new Client(1L,"Carlos","12345678900",2000.0,null,0));
        return ResponseEntity.ok().body(list);

    }

}
