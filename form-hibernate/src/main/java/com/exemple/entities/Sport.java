package com.exemple.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private String description;
	
	// fait reference à l'attribut sport
	@ManyToMany(mappedBy = "sports")
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Sport() {
		super();
	}
	public Sport(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Sport [id=" + id + ", libelle=" + libelle + ", description=" + description + "]";
	}
	
	
}
