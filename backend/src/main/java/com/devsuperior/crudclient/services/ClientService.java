package com.devsuperior.crudclient.services;

import com.devsuperior.crudclient.entities.Client;
import com.devsuperior.crudclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll(){
       return repository.findAll();
    }
}
