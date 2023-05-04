package com.spring.peluqueria.service;

import com.spring.peluqueria.model.Client;
import com.spring.peluqueria.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository repo;

    @Override
    public Client findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Client> findAll() {
        return repo.findAll();
    }

    @Override
    public Client save(Client client) {
        return save(client);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }
}
