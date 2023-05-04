package com.spring.peluqueria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    @NotNull
    @NotBlank
    private String name;

    @Column(length = 50)
    @NotNull
    @NotBlank
    private String firstLastName;

    @Column(length = 50)
    @NotNull
    @NotBlank
    private String secondLastName;

    @Column(length = 15)
    @NotNull
    @NotBlank
    @Pattern(regexp = "^\\+[0-9]{1,15}$",
            message = "El campo debe comenzar con el símbolo '+' seguido de un máximo de 15 números")
    private String phoneNumber;

    @Email
    @NotNull
    @NotBlank
    private String email;

    @OneToOne
    @JoinColumn(name = "client_detail_id")
    private ClientDetail clientDetail;

}
