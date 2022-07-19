package com.exemple.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ETU")
public class Etudiant extends Personne{

	private String niveau;

	public Etudiant() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	public Etudiant( String nom, String prenon, int age,String niveau,Voiture voiture) {
		super(nom, prenon, age,voiture);
		//TODO Auto-generated constructor stub
		this.niveau=niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant "+super.toString() + "[niveau=" + niveau + " ]";
	}

	
}
