
public class Verda extends Faccio{

	private String color;
	private String enemic;
	private String territori;
	
	public Verda(String nom, String color,String enemic,String territori) {
		super(nom);
		this.color = "Verda";	
		this.enemic = "Vermella";
		this.territori = "Oest";
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
