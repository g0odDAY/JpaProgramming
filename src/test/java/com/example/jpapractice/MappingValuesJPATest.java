package com.example.jpapractice;

import com.example.jpapractice.model.Item;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MappingValuesJPATest {
    @Test
    public void storeLoadEntities(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ch06.mapping_value_types");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        List<Item> items = em.createQuery("select i from Item i where i .metricWeight = :w",Item.class)
                .setParameter("w",2.0)
                .getResultList();
        em.getTransaction().commit();

    }
}
