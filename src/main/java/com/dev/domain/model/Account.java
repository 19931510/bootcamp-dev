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
    private String password;
    public String getPassword() {
        return password;}

    @Column(length = 100, nullable = false)
    private String email;
    public String getEmail() {
        return email;}

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

    @Column(length = 20, nullable = false)
    private String address;
    public String getAddress() {
        return address;
    }

    @Column(length = 20, nullable = false)
    private String city;
    public String getCity() {
        return city;
    }
    @Column(length = 20, nullable = false)
    private String state;
    public String getState() {
        return state;
    }

    @OneToOne(cascade = CascadeType.ALL)
    private Service service;
    public Service getService() {
        return service;


    }
}
