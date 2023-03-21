
public class Armadura {
	
	private String nom;
	private float forsa;
	private float intel;
	private float agil;
	private float resisFis;
	private float resisMag;
	
	public Armadura(String nom,float forsa,float intel,float agil,float resisFis,float resisMag) {
		this.nom = nom;
		this.forsa = forsa;
		this.intel = intel;
		this.agil = agil;
		this.resisFis = resisFis;
		this.resisMag = resisMag;
	
}
	public String getNom() {
		return this.nom;
	}
	public float getForsa() {
		return this.forsa;
	}
	public float getIntel() {
		return this.intel;
	}
	public float getAgil() {
		return this.agil;
	}
	public float getResisFis() {
		return this.resisFis;
	}
	public float getResisMag() {
		return this.resisMag;
	}
}
