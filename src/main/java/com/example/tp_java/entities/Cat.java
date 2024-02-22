package com.example.tp_java.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Cat extends Animal{
    public String getChipld() {
        return chipld;
    }

    public void setChipld(String chipld) {
        this.chipld = chipld;
    }

    private String chipld;
}
