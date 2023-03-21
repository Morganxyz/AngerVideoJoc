
public class Arquero extends Classe{

	
	private String estilCombat;
	private String tipoEnergy;
	
	public Arquero(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
	,float resisMag,String nomRasa,String nomClasse,String estilCombat,String tipoEnergy) {
		
		super(nom, alsada,pes, forsa, intel,agil, resisFis,resisMag, nomRasa,nomClasse);
		this.estilCombat = "Distancia";
		this.tipoEnergy = "Entusiasmo";
	}
	

	public String getEstilCombat() {
		return this.estilCombat;
	}
	public String getTipoEnergy() {
		return this.tipoEnergy;
	}
	
	public void beneficiClasse() {
		//Anti segación durante 5 seg.
	}
	
	
}
