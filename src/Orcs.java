
public class Orcs extends Rasa {

	
	private String afiniProf;
	private String tempe;
	
	public Orcs(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
			,float resisMag,String nomRasa,String afiniProf,String tempe) {
		
		super(nom, alsada,pes, forsa, intel,agil,resisFis, resisMag,nomRasa);
	
		this.afiniProf = "Minería";
		this.tempe = "Rudos";
	}
	

	public String getAfiniProf() {
		return this.afiniProf;
	}
	public String getTempe() {
		return this.tempe;
	}

	public void beneficiRacial() {
		// fuerza menor = + 5 fuerza durante 5 segundos
		
	}
	
}
