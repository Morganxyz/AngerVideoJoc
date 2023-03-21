
public abstract class Classe extends Rasa{
	
	private String nomClasse;


	
	public Classe(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
			,float resisMag,String nomRasa,String nomClasse) {
		
		super(nom,alsada,pes, forsa,intel,agil,resisFis,resisMag,nomRasa);
		this.nomClasse = nomClasse;
	
	}
	
	public String getNomClasse() {
		return this.nomClasse;
	}
	
	public abstract void beneficiClasse();
}
