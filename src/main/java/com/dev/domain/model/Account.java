package com.dev.domain.model;

import jakarta.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity (name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 20, nullable = false)
    private String firstName;
    public String getFirstName() {
        return firstName;
    }

    @Column (length = 20, nullable = false)
    private String lastName;
    public String getLastName() {
        return lastName;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Service service;
    public Service getService() {
        return service;


    }
}
