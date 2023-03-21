
public class Elfs extends Rasa{
	
	private String afiniProf;
	private String tempe;

	public Elfs(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
			,float resisMag,String nomRasa,String afiniProf,String tempe) {
		
		super(nom, alsada,pes, forsa, intel,agil,resisFis, resisMag,nomRasa);
		this.afiniProf = "Herboristeria";
		this.tempe = "Calmats";
	}

	public String getAfiniProf() {
		return this.afiniProf;
	}
	public String getTempe() {
		return this.tempe;
	}

	public void beneficiRacial() {
		// regeneración menor = + 5 vida/s durante 5 seg
	}
	
}
