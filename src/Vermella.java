
public class Vermella extends Faccio{

	private String nom;
	private String color;
	private String enemic;
	private String territori;
	
	public Vermella(String nom, String color,String enemic,String territori) {
		super(nom,color, enemic,territori);
		this.color = "Vermell";	
		this.enemic = "Verda";
		this.territori = "Est";
	}


	public void beneficiFaccio() {
		
	}

	public void enemicFaccio() {
		
	}
}