package com.example.tp_java.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class PetStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String managerName;

    @OneToMany(mappedBy="petStore")
    private Set<Animal> animals;

    @ManyToMany(mappedBy = "petStores")
    private Set<Product> products;

    @OneToOne
    private Address address;
}
