
import java.util.ArrayList;

public class Avatar{
	
	private String nom;
	private int alsada;
	private float pes;
	private float forsa;
	private float intel;
	private float agil;
	private float resisFis;
	private float resisMag;
	boolean moviment = false;
	private int velocitat;

	ArrayList<Arma> llistaArmas = new ArrayList<>();
	Arma arma0 = new Arma("Arma de novato",1,1,1,1,1);
	ArrayList<Armadura> llistaArmaduras = new ArrayList<>();
	Armadura armad0 = new Armadura("Armadura de novato",1,1,1,1,1);
	ArrayList<Classe> llistaClasses = new ArrayList<>();
	Arquero arc0 = new Arquero("Arquero","Distancia","PetFilia");
	Warrior war0 = new Warrior("Warrior","Melé","Ira");
	ArrayList<Rasa> llistaRasses = new ArrayList<>();
	Elfs elf0 = new Elfs("Elfo","Herboristeria","Calmado");
	Enanos ena0 = new Enanos("Enano","Minería","Fuerte");
	Orcs orc0 = new Orcs("Orco","Minería","Rudo");
	Trolls trol0 = new Trolls("Troll","Herboristeria","Calmado");
	
	
	public Avatar(String nom, int alsada,float pes, float forsa,float intel,float agil,float resisFis
			,float resisMag) {
		
		this.nom = nom;
		this.alsada = alsada;
		this.pes = pes;
		this.forsa = 1;
		this.intel = 1;
		this.agil = 1;
		this.resisFis = 5;
		this.resisMag = 5;
		this.llistaClasses.add(arc0);
		this.llistaClasses.add(war0);
		this.llistaRasses.add(elf0);
		this.llistaRasses.add(ena0);
		this.llistaRasses.add(orc0);
		this.llistaRasses.add(trol0);
		this.llistaArmas.add(arma0);
		this.llistaArmaduras.add(armad0);
	
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

	public void setNom(String nom){
			this.nom = nom;
	}

	public void setAlsada(int alsada){
			this.alsada = alsada;
	}
	public void setPes(float pes){
			this.pes = pes;
	}
	
	public boolean getMoviment() {
		return this.moviment;
	}
	
	public int getVelocitat() {
		return this.velocitat;
	}

	public ArrayList<Arma> getLlistaArmas(){
		return this.llistaArmas;
	}
	public ArrayList<Armadura> getLlistaArmaduras(){
		return this.llistaArmaduras;
	}
	public ArrayList<Classe> getLlistaClasses(){
		return this.llistaClasses;
	}	
	public ArrayList<Rasa> getLlistaRasses(){
		return this.llistaRasses;
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
