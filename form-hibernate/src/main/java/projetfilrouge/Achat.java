package projetfilrouge;

import java.util.List;

public interface Achat {

	public Long getUserId();

	public void validerCommande();

	public double getSolde();

	public List<Achat> getList();

	public void annule();
}