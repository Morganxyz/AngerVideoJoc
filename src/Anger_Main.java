import java.util.Scanner;
import java.util.ArrayList;

public class Anger_Main {

	static Scanner entrada = new Scanner(System.in);
	static ArrayList <Faccio> llistaFaccions = new ArrayList<>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Vermella verm0 = new Vermella("Sangui", "Vermell", "Verd", "Est");
	Groga grog0 = new Groga("Ketep", "Grog", "Morat", "Nord");
	Morada mora0 = new Morada("Morau", "Morat", "Grog", "Sud");
	Verda verd0 = new Verda("Esper", "Verd", "Vermell", "Oest");
	llistaFaccions.add(verm0);
	llistaFaccions.add(grog0);
	llistaFaccions.add(mora0);
	llistaFaccions.add(verd0);
	
	}

}
