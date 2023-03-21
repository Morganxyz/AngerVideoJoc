
public class Groga extends Faccio{

	private String nom;
	private String color;
	private String enemic;
	private String territori;
	
	public Groga(String nom, String color,String enemic,String territori) {
		super(nom,color, enemic,territori);
		this.color = "Grog";	
		this.enemic = "Morada";
		this.territori = "Nord";
	}


	public void beneficiFaccio() {
		
	}

	public void enemicFaccio() {
		
	}
}
