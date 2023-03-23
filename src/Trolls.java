
public class Trolls extends Rasa{
	
	
	private String afiniProf;
	private String tempe;
	
	public Trolls(String nomRasa,String afiniProf,String tempe) {
		
		super(nomRasa);
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
		// agilidad menor = + 5 prob. crítico durante 5 segs.
	}
	
}
