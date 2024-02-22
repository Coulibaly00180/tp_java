package com.example.tp_java.services;

import com.example.tp_java.entities.Animal;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnimalService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertPetStore(Animal animal) {
        entityManager.persist(animal);
    }
}

