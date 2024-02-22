package com.example.tp_java.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;

    private String label;

    private ProdType type;

    private Double price;

    @ManyToMany
    @JoinTable(name = "PRO_PET",
        joinColumns = @JoinColumn(name="ID_PRO", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "ID_PET", referencedColumnName = "id")
    )
    private Set<PetStore> petStores;
}
