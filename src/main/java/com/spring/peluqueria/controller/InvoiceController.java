package com.spring.peluqueria.controller;

import com.spring.peluqueria.model.Client;
import com.spring.peluqueria.model.Invoice;
import com.spring.peluqueria.service.ClientService;
import com.spring.peluqueria.service.InvoiceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/invoice")
public class InvoiceController {

    @Autowired
    ClientService clientService;
    @Autowired
    InvoiceService invoiceService;

    @GetMapping
    public ResponseEntity<?> getAllByClient(@Valid @RequestBody Client client, BindingResult result){

        List<Invoice> invoices = new ArrayList<>();
        Map<String, Object> response = new HashMap<>();

        if (result.hasErrors()){
            response.put("message", "The data is not in the correct format");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        if (clientService.findById(client.getId()) == null){
            response.put("message", "The user with id " + client.getId() + " does not appear in the data base");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        try {
            invoices = invoiceService.findByClient(client);
        } catch (DataAccessException e){
            response.put("error", "There was a problem trying to access to the data base");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (Exception e) {
            response.put("error", "The service is not available");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(invoices, HttpStatus.OK);
    }

}
