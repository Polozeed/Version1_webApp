package com.beans.entity;


import com.beans.Product;
import com.beans.Temp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;

@Table(name = "product")
@Entity(name = "ProduitEntity")
public class ProduitEntity  implements Comparable<ProduitEntity>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produit", nullable = false)
    private Integer id;

    @Column(name = "nom", nullable = false, length = 60)
    private String nom;

    @Column(name = "prix", nullable = true)
    private String prix;

    @Column(name = "categorie", nullable = true)
    private String categorie;

    @Column(name = "quantite", nullable = true)
    private String quantite;

    @Column(name = "image", nullable = true)
    private String image;


    public ProduitEntity(Integer id, String nom, String prix, String quantite,String categorie,String image) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie =categorie;
        this.image = image;
    }

    public ProduitEntity(String nom, String prix, String quantite,String categorie,String image) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.categorie =categorie;
        this.image = image;
    }

    public ProduitEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "ProduitEntity{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", categorie='" + categorie + '\'' +
                ", quantite='" + quantite + '\'' +
                ", image='" + image + '\'' +
                '}';
    }


    public boolean check(ArrayList<String> cartlist, String id2) {
        for(String id : cartlist) {
            if(id.equals(id2))
                return true;
        }
        return false;
    }
    public ArrayList<String> remove(ArrayList<String> cartlist, String id) {
        for(String cid : cartlist) {
            if(cid.equals(id)) {
                cartlist.remove(cid);
                break;
            }
        }
        return cartlist;
    }

    public ArrayList<ProduitEntity> lowtohigh(ArrayList<ProduitEntity> list) {
        Collections.sort(list);
        return list;
    }

    public int compareTo(ProduitEntity p) {
        return Integer.parseInt(this.prix) - Integer.parseInt(p.prix);
    }
    public ArrayList<ProduitEntity> hightolow(ArrayList<ProduitEntity> list) {
        //Collections.sort(list, new Temp());
        return list;
    }

}





