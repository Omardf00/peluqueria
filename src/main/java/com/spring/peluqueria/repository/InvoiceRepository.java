package com.spring.peluqueria.repository;

import com.spring.peluqueria.model.Client;
import com.spring.peluqueria.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

    public List<Invoice> findByClient(Client client);

}
