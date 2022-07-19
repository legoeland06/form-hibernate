package projetfilrouge;

//@Entity
//@Table(name="niveau")
public class Niveau {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
//    @SequenceGenerator(name = "id_Sequence", sequenceName = "NIVEAU_ID_FK")
	private Long id;
	private String intitule;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public Niveau(){
		super();
	}
	public Niveau(Long id, String intitule) {
		super();
		this.id = id;
		this.intitule = intitule;
	}
	@Override
	public String toString() {
		return "Niveau [id=" + id + ", intitule=" + intitule + "]";
	}
	
}