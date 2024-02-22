package com.example.tp_java.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Cat extends Animal{
    private String chipld;
}
