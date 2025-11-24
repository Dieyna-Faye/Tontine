package sn.edu.isepat.tic.DFE.p6.diey.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilusateur")
public class Utilusateur {
    @Id
    private long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false, unique = true,length = 50)
    private  String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}