package com.exemple.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSONNE")
@DiscriminatorValue(value = "PERS")
// Definit des contraintes d'unicite sur nom et prenom
@Table(name = "personne", uniqueConstraints = {
		@UniqueConstraint(name = "nom_prenom",columnNames = {"nom","prenom"})
})
public abstract class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private int age;

	// une personnene peut avoir qu'une seule voiture
	//@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE }) //
	
	// plusieurs personnes peuvent avoir la mm voiture
	//	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
	//	@JoinColumn(name="voiture_id", referencedColumnName = "id",nullable = true)

	// une personne peut avoir plusieurs voiture
	@OneToMany(cascade = {CascadeType.PERSIST,CascadeType.ALL})
	private List<Voiture> voitures= new ArrayList<Voiture>();
	
	//public Voiture voiture;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.ALL})
	private List<Sport> sports  =  new ArrayList<Sport>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	public Voiture getVoiture() {
//		return this.voiture;
//	}
//
//	public void setVoiture(Voiture voiture) {
//		this.voiture = voiture;
//	}
	
	public List<Voiture> getVoitures(){
		return this.voitures;
	}
	
	public void setVoitures(List<Voiture> voitures) {
		this.voitures = voitures;
	}
	
	public boolean addVoiture(Voiture e) {
		return voitures.add(e);
	}

	public boolean removeVoiture(Object o) {
		return voitures.remove(o);
	}
	
	public boolean addSport(Sport e) {
		return sports.add(e);
	}

	public boolean removeSport(Object o) {
		return sports.remove(o);
	}

	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, int age, List<Voiture> voitures,List<Sport> sports) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.voitures=voitures;
		this.sports=sports;
	}
	public Personne(String nom, String prenom, int age, List<Voiture> voitures) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.voitures=voitures;
	}
	
	public Personne(String nom, String prenom, int age, Voiture voiture) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	

//	@Override
//	public String toString() {
//		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "voiture="
//				+ voiture.toString() + "]";
//	}
	
	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	
	
	

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "voiture="
				+ voitures.toString() + sports.toString()+ "]";
	}

}
