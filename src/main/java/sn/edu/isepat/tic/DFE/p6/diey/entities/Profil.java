package sn.edu.isepat.tic.DFE.p6.diey.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "profil")
public class Profil {
    @Id
    private long id;
    private String bio;
    private String telephone;
    private String photo;
    @OneToOne
    @JoinColumn
    private Profil profil;
}