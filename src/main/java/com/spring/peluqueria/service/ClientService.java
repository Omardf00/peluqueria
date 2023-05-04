package com.spring.peluqueria.service;

import com.spring.peluqueria.model.Client;

import java.util.List;

public interface ClientService {

    public Client findById(int id);

    public List<Client> findAll();

    public Client save(Client client);

    public void deleteById(int id);

}
