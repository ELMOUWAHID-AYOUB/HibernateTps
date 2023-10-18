/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.entite;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
@NamedNativeQuery(name = "findBetweenDate", query = "from Produit where dateNaissance between :d1 and :d2")
//@NamedNativeQuery(name = "betweenDate", query = "SELECT p.* FROM produit p inner join lignecommandeproduit l on p.id = l.produit inner join commande c on c.id = l.commande where c.date BETWEEN :d1 and :d2", resultClass = Produit.class)
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marque;
    @Column(name = "ref")
    private String reference;
    @Column(name = "desig")
    private String designation;
    @Temporal(TemporalType.DATE)
    private Date dateAchat;
    private double prix;

    public Produit() {
    }

    public Produit(int id, String marque, String reference, String designation, Date dateAchat, double prix) {
        this.id = id;
        this.marque = marque;
        this.reference = reference;
        this.designation = designation;
        this.dateAchat = dateAchat;
        this.prix = prix;
    }

    public Produit(int i, String redmi, String f89DF9AEJZ3R8, String casa, String date, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "les information de produit:"+ "marque=" + marque + ", reference=" + reference + ", designation=" + designation + ", dateAchat=" + dateAchat + ", prix=" + prix + '}';
    }

   

}
