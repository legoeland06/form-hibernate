package projetfilrouge;

import java.util.Date;
import java.util.List;

public class Commande implements Achat{

	private int id;
	private Produit produit;
	private User user;
	private Date dateValidation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDateValidation() {
		return dateValidation;
	}

	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
		
	}
	
	public Long getUserId() {
		return 0L;
	}

	public void validerCommande() {
		
	}

	public double getSolde() {
		return this.produit.getPrix();
	}

	public List<Achat> getList(){
		return null;
	}

	public void annule() {};
}
