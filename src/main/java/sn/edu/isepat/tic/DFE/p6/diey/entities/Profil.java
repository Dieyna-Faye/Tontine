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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}