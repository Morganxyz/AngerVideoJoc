import java.util.ArrayList;

public abstract class Faccio {

	private String nom;

	Vermella verm0;
	Groga grog0;
	Morada mora0;
	Verda verd0;
	private ArrayList<Avatar>llistaAvatars;
	
	public Faccio(String nom) {
		this.nom = nom;
		this.llistaAvatars= new ArrayList<>();
		this. grog0 = new Groga("Ketep", "Grog", "Morat", "Nord");
		this. verm0 = new Vermella("Sangui", "Vermell", "Verd", "Est");
		this. mora0 = new Morada("Morau", "Morat", "Grog", "Sud");
		this. verd0 = new Verda("Esper", "Verd", "Vermell", "Oest");

		}
	
	public String getNom() {
		return this.nom;
	}
	public String getColor() {
		return this.nom;
	}
	public String getEnemic() {
		return this.nom;
	}
	public String getTerritori() {
		return this.nom;
	}
	
	public ArrayList<Avatar> getLlistaAvatars(){
		return this.llistaAvatars;
	}
	
	public void setLlistaAvatars(Avatar llistaAvatars) {
		this.llistaAvatars.add(llistaAvatars);
	}
	
	public abstract void beneficiFaccio();
	

	public abstract void enemicFaccio();

	}

