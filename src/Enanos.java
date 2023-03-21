
public class Enanos extends Rasa{

	private String afiniProf;
	private String tempe;
	
	public Enanos(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
			,float resisMag,String nomRasa,String afiniProf,String tempe) {
		
		super(nom, alsada,pes, forsa, intel,agil,resisFis, resisMag,nomRasa);
		
		this.afiniProf = "Minería";
		this.tempe = "Fuerte";
	}

	public String getAfiniProf() {
		return this.afiniProf;
	}
	public String getTempe() {
		return this.tempe;
	}

	public void beneficiRacial() {
		// piel dura = -5 daño durante 5 seg.
		
	}
	
	
	
}
