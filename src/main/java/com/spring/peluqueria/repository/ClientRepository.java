package com.spring.peluqueria.repository;

import com.spring.peluqueria.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
