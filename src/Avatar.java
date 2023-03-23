import java.util.ArrayList;

public class Avatar{
	
	private String nom;
	private float alsada;
	private float pes;
	private float forsa;
	private float intel;
	private float agil;
	private float resisFis;
	private float resisMag;
	boolean moviment = false;
	private int velocitat;
	Arma arma0;
	Armadura armad0;
	Arquero arc0;
	Warrior war0;
	Elfs elf0;
	Enanos ena0;
	Orcs orc0;
	Trolls trol0;
	
	
	
	public Avatar(String nom, float alsada,float pes, float forsa,float intel,float agil,float resisFis
			,float resisMag) {
		
		this.nom = nom;
		this.alsada = alsada;
		this.pes = pes;
		this.forsa = forsa;
		this.intel = intel;
		this.agil = agil;
		this.resisFis = resisFis;
		this.resisMag = resisMag;
		this.arma0 = new Arma("Arma de novato",1,1,1,1,1);
		this.armad0 = new Armadura("Armadura de novato",1,1,1,1,1);
		this.arc0 = new Arquero("Arquero","Distancia","PetFilia");
		this.war0 = new Warrior("Warrior","Melé","Ira");
		this.elf0 = new Elfs("Elfo","Herboristeria","Calmado");
		this.ena0 = new Enanos("Enano","Minería","Fuerte");
		this.orc0 = new Orcs("Orco","Minería","Rudo");
		this.trol0 = new Trolls("Troll","Herboristeria","Calmado");

	
	}

	public String getNom() {
		return this.nom;
	}
	public float getAlsada() {
		return this.alsada;
	}
	public float getPes() {
		return this.pes;
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
	
	public boolean getMoviment() {
		return this.moviment;
	}
	
	public int getVelocitat() {
		return this.velocitat;
	}
	
	public void setVelocitat(String velocitat ) {
		if(velocitat.equalsIgnoreCase("c")){
			this.velocitat = 5;
		}else if(velocitat.equalsIgnoreCase("r")){
			this.velocitat = 10;
		}
	}
	
	public void setMoviment(String moures) {
	
		if(moures.equalsIgnoreCase("s")) {
			this.moviment = true;
		
			if(this.moviment == true && velocitat == 5) {
				System.out.println("Vaig caminant");
	
			}else if(this.moviment == true && (velocitat > 5 && velocitat < 10)) {
				System.out.println("Estic corrent!");
			}else if(this.moviment == true && (velocitat > 10 && velocitat < 15)) {
				System.out.println("M´espinyaré!!!");
			}else if(this.moviment == true && velocitat > 15) {
				System.out.println("Em mataré! prou!");
				this.moviment = false;
				this.velocitat = 0;
					}
			}
		}
}
