package projetfilrouge;

import java.util.Date;

public class Produit {
	private Long id;
	private Categorie categorie;
	private Formateur formateur;
	private int duree;
	private Date dateDebut;
	private double prix;
	private Adresse lieux;
	private String descriptif;
	private String lienTest;
	private Niveau niveau;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Categorie getCategorie() {
		return this.categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Formateur getFormateur() {
		return this.formateur;
	}

	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Adresse getLieux() {
		return lieux;
	}

	public void setLieux(Adresse lieux) {
		this.lieux = lieux;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}

	public String getLienTest() {
		return lienTest;
	}

	public void setLienTest(String lienTest) {
		this.lienTest = lienTest;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	
	public Produit() {
		super();
	}

	public Produit(Long id, Categorie categorie, Formateur formateur, int duree, Date dateDebut, double prix,
			Adresse lieux, String descriptif, String lienTest, Niveau niveau) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.formateur = formateur;
		this.duree = duree;
		this.dateDebut = dateDebut;
		this.prix = prix;
		this.lieux = lieux;
		this.descriptif = descriptif;
		this.lienTest = lienTest;
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", categorie=" + categorie + ", formateur=" + formateur + ", duree=" + duree
				+ ", dateDebut=" + dateDebut + ", prix=" + prix + ", lieux=" + lieux + ", descriptif=" + descriptif
				+ ", lienTest=" + lienTest + ", niveau=" + niveau + "]";
	}
	
}