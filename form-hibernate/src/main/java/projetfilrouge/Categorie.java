package projetfilrouge;

public class Categorie {
	private int id;
	private Categorie catMere;
	private String intitule;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Categorie getCatMere() {
		return catMere;
	}
	public void setCatMere(Categorie catMere) {
		this.catMere = catMere;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	
	
	
}