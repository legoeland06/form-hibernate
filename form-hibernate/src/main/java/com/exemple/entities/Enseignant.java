package com.exemple.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ENS")
public class Enseignant extends Personne{

	private double salaire;

	public Enseignant() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Enseignant(String nom, String prenon, int age, double salaire,Voiture voiture) {
		super( nom, prenon, age,voiture);
		this.salaire=salaire;
		//TODO Auto-generated constructor stub
	}
	
	public Enseignant(String nom, String prenon, int age, double salaire,Voiture voiture,Sport sport) {
		super( nom, prenon, age,voiture);
		this.salaire=salaire;
		//TODO Auto-generated constructor stub
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Enseignant "+super.toString() +" [salaire=" + salaire + " ]";
	}
	
}
