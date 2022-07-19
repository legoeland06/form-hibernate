package projetfilrouge;

public class Formateur {
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private DetailsUser detailsUser;
	
	public Long getId(){
		return this.id;
	}
	
	public void setId(Long id){
		this.id=id;
	}

	public String getNom(){
		return this.nom;
	}

	public void setNom(String nom){
		this.nom=nom;
	}

	public String getPrenom(){
		return this.prenom;
	}

	public void setPrenom(String prenom){
		this.prenom=prenom;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public DetailsUser gDetailsUser(){
		return this.detailsUser;
	}

	public void setDetailsUser(DetailsUser detailsUser){
		this.detailsUser=detailsUser;
	}

}