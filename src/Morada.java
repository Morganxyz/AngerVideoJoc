
public class Morada extends Faccio {

	private String nom;
	private String color;
	private String enemic;
	private String territori;
	
	public Morada(String nom, String color,String enemic,String territori) {
		super(nom,color,enemic,territori);
		this.color = "Morat";	
		this.enemic = "Groga";
		this.territori = "Sud";
	}


	public void beneficiFaccio() {
		
	}

	public void enemicFaccio() {
		
	}
}
