package com.dev.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Service> services;
    private String description;
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public List<Service> getServices() {return services;}
    public void setServices(List<Service> services) {this.services = services;}

}
