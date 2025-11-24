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
    @Column(nullable = false, unique = true)
    private  String email;

}