
public class Morada extends Faccio {

	private String nom;
	private String color;
	private String enemic;
	private String territori;
	
	public Morada(String nom, String color,String enemic,String territori) {
		super(nom);
		this.color = "Morat";	
		this.enemic = "Groga";
		this.territori = "Sud";
	}
	
	
	public String getColor(){
		return this.color;
	}
	public String getEnemic(){
		return this.enemic;
	}
	public String getTerritori(){
		return this.territori;
	}

	public void beneficiFaccio() {
		
	}

	public void enemicFaccio() {
		
	}
}
