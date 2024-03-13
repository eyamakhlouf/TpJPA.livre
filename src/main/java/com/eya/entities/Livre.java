package com.eya.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Livre implements Serializable{
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY)
//pour autoincrement
private int id_livre;
private String titre_livre;
private String auteur;
private double prix;
private String genre;
private int nb_pages;
public int getIdLivre() {
return id_livre;
}
public void setIdLivre(int id_livre) {
this.id_livre = id_livre;
}
public String getTitre_livre() {
	return titre_livre;
}
public void setTitre_livre(String titre_livre) {
	this.titre_livre = titre_livre;
}
public String getAuteur() {
	return auteur;
}
public void setAuteur(String auteur) {
	this.auteur = auteur;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getNb_pages() {
	return nb_pages;
}
public void setNb_pages(int nb_pages) {
	this.nb_pages = nb_pages;
}

}
