package com.example.tp_java.services;

import com.example.tp_java.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertPetStore(Product product) {
        entityManager.persist(product);
    }
}

