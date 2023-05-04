package com.spring.peluqueria.service;

import com.spring.peluqueria.model.Client;
import com.spring.peluqueria.model.Invoice;
import com.spring.peluqueria.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService{

    @Autowired
    InvoiceRepository repo;

    @Override
    public List<Invoice> findByClient(Client client) {
        return repo.findByClient(client);
    }
}
