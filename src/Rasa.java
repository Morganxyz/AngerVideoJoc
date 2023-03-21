import java.util.ArrayList;

public abstract class Rasa extends Avatar{
	
	private String nomRasa;

	
	public Rasa(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
			,float resisMag,String nomRasa) {
		super(nom, alsada,pes, forsa, intel,agil,resisFis, resisMag);
		this.nomRasa = nomRasa;
	
	}
	
	public String getNomRasa() {
		return this.nomRasa;
	}
	

	public String ToString() {
		return "La raça d´aquest avatar es " + this.nomRasa;
	}
	
	public abstract void beneficiRacial();

}
