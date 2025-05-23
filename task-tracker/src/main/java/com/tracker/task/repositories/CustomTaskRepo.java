package com.tracker.task.repositories;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomTaskRepo {

// Object that has methods to interact with dataBase.
    @Autowired
    private EntityManager entityManager;




}
