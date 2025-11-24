package sn.edu.isepat.tic.DFE.p6.diey;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.DFE.p6.diey.entities.Utilusateur;

public class TestAutoincrement {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projet1PU");
        EntityManager em = emf.createEntityManager();


        Utilusateur u1=new Utilusateur();
        u1.setNom("Dieyna");
        u1.setEmail("dieynabaf349@gmail.com");

        em.persist(u1);
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
