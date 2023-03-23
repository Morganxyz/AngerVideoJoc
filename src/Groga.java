
public class Groga extends Faccio{

	private String nom;
	private String color;
	private String enemic;
	private String territori;
	
	public Groga(String nom, String color,String enemic,String territori) {
		super(nom);
		this.color = "Grog";	
		this.enemic = "Morada";
		this.territori = "Nord";
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
