
public class Warrior extends Classe{

	
	private String estilCombat;
	private String tipoEnergy;
	
	public Warrior(String nomClasse,String estilCombat,String tipoEnergy) {
		
		super(nomClasse);
	
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
