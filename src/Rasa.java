
public abstract class Rasa{
	
	private String nomRasa;

	
	public Rasa(String nomRasa) {
		this.nomRasa = nomRasa;
	
	}
	
	public String getNomRasa() {
		return this.nomRasa;
	}
	

	public String ToString() {
		return "La raça d´aquest avatar es " + this.nomRasa;
	}
	
	public abstract void beneficiRacial();

}
