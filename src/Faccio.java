import java.util.ArrayList;

public abstract class Faccio {

	private String nom;
	private String color;
	private String enemic;
	private String territori;
	
	private ArrayList<Avatar>llistaAvatars;
	
	public Faccio(String nom,String color,String enemic, String territori) {
		this.nom = nom;
		this.color = color;
		this.enemic = enemic;
		this.territori = territori;
		this.llistaAvatars= new ArrayList<>();
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

