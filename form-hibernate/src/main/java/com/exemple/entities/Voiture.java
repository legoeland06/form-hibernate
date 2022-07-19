package com.exemple.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Declare la class Voiture comme une entite à mapper sur le db
@Table(name="voiture")
public class Voiture {

	@Id // déclare ce champs comme une clé primaire
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private String modele;
	private String couleur;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Voiture() {
		super();
	}
	public Voiture(String marque, String modele, String couleur) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
	}
	@Override
	public String toString() {
		return "Voiture [id=" + id + ", marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + "]";
	}
	
	
}
