package com.spring.peluqueria.service;

import com.spring.peluqueria.model.Client;
import com.spring.peluqueria.model.Invoice;

import java.util.List;

public interface InvoiceService {

    public List<Invoice> findByClient(Client client);

}
