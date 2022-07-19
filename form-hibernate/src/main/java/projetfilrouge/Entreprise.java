package projetfilrouge;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="ENTRP")
public class Entreprise extends Client {
    
    private String raisonSociale;
    private String telephone;
    private Adresse adresse;

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Adresse getAddresse() {
        return adresse;
    }

    public void setAddresse(Adresse adresse) {
        this.adresse = adresse;
    }
    
    public Entreprise() {
    	super();
    }

	public Entreprise(String raisonSociale, String telephone, Adresse adresse) {
		super();
		this.raisonSociale = raisonSociale;
		this.telephone = telephone;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return  super.toString()+ ", Entreprise [raisonSociale=" + raisonSociale + ", telephone=" + telephone + ", adresse=" + adresse
				 + "]";
	}
    
    

}