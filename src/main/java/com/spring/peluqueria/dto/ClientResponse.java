package com.spring.peluqueria.dto;

import com.spring.peluqueria.model.Client;
import lombok.Data;

@Data
public class ClientResponse {

    private int id;

    private String name;

    private String firstLastName;

    private String secondLastName;

    public ClientResponse(Client client) {
        this.id = client.getId();
        this.name = client.getName();
        this.firstLastName = client.getFirstLastName();
        this.secondLastName = client.getSecondLastName();
    }
}
