package projetfilrouge;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value="USER")
@Table(name="client")
public class User extends Client {

	private String password;
	private Niveau niveau;
	private Entreprise entreprise;
	
	private DetailsUser details;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getIdNiveau() {
		return this.niveau.getId();
	}

	public Niveau getNiveau() {
		return this.niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	public void setIdNiveau(Long idNiveau) {
		this.niveau.setId(idNiveau);
	}

	public Long getIdEntreprise() {
		return this.entreprise.getId();
	}

	public void setIdEntreprise(Long idEntreprise) {
		this.entreprise.setId(idEntreprise);
	}

	public Entreprise getEntrprise() {
		return this.entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public Long getIdDetails() {
		return this.details.getId();
	}

	public void setIdDetails(Long idDetails) {
		this.details.setId(idDetails);
	}

	public DetailsUser getDetails() {
		return this.details;
	}

	public void setDetails(DetailsUser details) {
		this.details = details;
	}

	public User() {
		super();
	}

	public User(String password, Niveau niveau, Entreprise entreprise, DetailsUser details) {
		super();
		this.password = password;
		this.niveau = niveau;
		this.entreprise = entreprise;
		this.details = details;
	}

	@Override
	public String toString() {
		return super.toString() + ", User [ " + " password=" + password + ", niveau=" + niveau + ", entreprise="
				+ entreprise + ", details=" + details + " ]";
	}

}