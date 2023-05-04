package com.spring.peluqueria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    @NotNull
    @NotBlank
    private String name;

    @Column(length = 300)
    private String description;

    @NotNull
    @NotBlank
    private Float price;

    @ManyToOne
    @JoinColumn(name = "distributor_id")
    private Distributor distributor;

}
