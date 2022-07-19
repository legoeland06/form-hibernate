package projetfilrouge;

public class Adresse {
    private String rue;
    private String cp;
    private String ville;
    private String pays;

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getRue() {
        return this.rue;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCp() {
        return this.cp;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return this.ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPays() {
        return this.pays;
    }

    public Adresse() {
        super();
    }

    public Adresse(String rue, String cp, String ville, String pays) {
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
    }
}