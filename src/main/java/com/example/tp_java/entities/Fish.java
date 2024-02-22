package com.example.tp_java.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Fish extends Animal{
    private Fishl_ivEnv livingEnv;

    public Fishl_ivEnv getLivingEnv() {
        return livingEnv;
    }

    public void setLivingEnv(Fishl_ivEnv livingEnv) {
        this.livingEnv = livingEnv;
    }
}
