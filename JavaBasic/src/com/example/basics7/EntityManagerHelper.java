/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.basics7;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Student
 */
public class EntityManagerHelper {
    
    private static final EntityManagerFactory EMF;
    private static final ThreadLocal<EntityManager> THREAD_LOCAL;

    static {
        EMF = Persistence.createEntityManagerFactory("JavaBasicPU");
        THREAD_LOCAL = new ThreadLocal<>();
    }

    public static EntityManager getEntityManager() {
        EntityManager em = THREAD_LOCAL.get();

        if (em == null) {
            em = EMF.createEntityManager();
            // set your flush mode here
            THREAD_LOCAL.set(em);
        }
        return em;
    }

    public static void closeEntityManager() {
        EntityManager em = THREAD_LOCAL.get();
        if (em != null) {
            em.close();
            THREAD_LOCAL.set(null);
        }
    }

    public static void closeEntityManagerFactory() {
        EMF.close();
    }

    public static void beginTransaction() {
        getEntityManager().getTransaction().begin();
    }

    public static void rollback() {
        getEntityManager().getTransaction().rollback();
    }

    public static void commit() {
        getEntityManager().getTransaction().commit();
    }
}
