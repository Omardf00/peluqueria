package com.spring.peluqueria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "invoice_product",
            joinColumns = @JoinColumn(name = "invoice_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "product_id", nullable = false)
    )
    private List<Product> products;

    @Column(length = 300)
    private String observation;

}
