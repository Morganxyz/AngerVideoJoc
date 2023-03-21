
public class Verda extends Faccio{

	private String nom;
	private String color;
	private String enemic;
	private String territori;
	
	public Verda(String nom, String color,String enemic,String territori) {
		super(nom,color, enemic,territori);
		this.color = "Verda";	
		this.enemic = "Vermella";
		this.territori = "Oest";
	}


	public void beneficiFaccio() {
		
	}

	public void enemicFaccio() {
		
	}
	
	
}
