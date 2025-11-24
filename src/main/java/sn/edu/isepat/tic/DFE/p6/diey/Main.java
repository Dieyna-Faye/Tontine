package sn.edu.isepat.tic.DFE.p6.diey;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("projet1PU");
        EntityManager em=emf.createEntityManager();
        em.close();
        emf.close();
    }
}
