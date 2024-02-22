package com.example.tp_java.services;

import com.example.tp_java.entities.Address;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AddressService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertPetStore(Address address) {
        entityManager.persist(address);
    }
}

