
public abstract class Classe {
	
	private String nomClasse;

	public Classe(String nomClasse) {
		this.nomClasse = nomClasse;
	
	}
	
	public String getNomClasse() {
		return this.nomClasse;
	}
	
	public abstract void beneficiClasse();
}
