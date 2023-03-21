
public class Warrior extends Classe{

	
	private String estilCombat;
	private String tipoEnergy;
	
	public Warrior(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
	,float resisMag,String nomRasa,String nomClasse,String estilCombat,String tipoEnergy) {
		
		super(nom, alsada,pes, forsa, intel,agil, resisFis,resisMag, nomRasa,nomClasse);
	
		this.estilCombat = "Cuerpo a Cuerpo";
		this.tipoEnergy = "Ira";
	}
	

	public String getEstilCombat() {
		return this.estilCombat;
	}
	public String getTipoEnergy() {
		return this.tipoEnergy;
	}
	

	public void beneficiClasse() {
		float velultima = 0f;
		velultima = 5;
	}

}
