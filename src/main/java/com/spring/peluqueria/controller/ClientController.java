package com.spring.peluqueria.controller;

import com.spring.peluqueria.model.Client;
import com.spring.peluqueria.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public ResponseEntity<?> getAllClients(){

        List<Client> clients = new ArrayList<>();
        Map<String, Object> response = new HashMap<>();

        try {
            clients = clientService.findAll();
        } catch (DataAccessException e){
            response.put("error", "There was a problem trying to access to the data base");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            response.put("error", "The service is not available");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

}
