import java.util.Scanner;
import java.util.ArrayList;

public class Anger_Main {

	static Scanner entrada = new Scanner(System.in);
	static ArrayList <Faccio> llistaFaccions = new ArrayList<>();


	public static void main(String[] args) {
		
	Vermella verm0 = new Vermella("Sangui", "Vermell", "Verd", "Est");
	Groga grog0 = new Groga("Ketep", "Grog", "Morat", "Nord");
	Morada mora0 = new Morada("Morau", "Morat", "Grog", "Sud");
	Verda verd0 = new Verda("Esper", "Verd", "Vermell", "Oest");
	llistaFaccions.add(verm0);
	llistaFaccions.add(grog0);
	llistaFaccions.add(mora0);
	llistaFaccions.add(verd0);
	
	int opcio;

	do{
		System.out.println("Introduce la facción en la que quieres jugar: \n1. Sangui\n2. Ketep\n3. Morau\n4. Esper\n0. Salir");
		opcio = entrada.nextInt();

			switch(opcio){

				case 1: crearAvSangui();
					break;
				case 2:	crearAvKetep();
					break;
				case 3: crearAvMorau();
					break;
				case 4: crearAvEsper();
					break;
				case 0:
					System.out.println("Saliendo!");
					System.out.println("");
					break;
				default:
					System.out.println("La opción escogida no és válida");
					System.out.println("");

			}

	}while(opcio !=0);
	}

			public static void crearAvSangui(){

				String nom;System.out.println("Introduce el nombre de tu avatar: ");
				nom = entrada.nextLine();
				int alsada;
				float pes;
				int opcio;

				System.out.println("Introduce el nombre de tu avatar: ");
				nom = entrada.nextLine();
				System.out.println("Introduce el nombre de tu avatar: ");
				alsada = entrada.nextInt();
				System.out.println("Introduce el nombre de tu avatar: ");
				pes = entrada.nextFloat();

				Avatar av0 = new Avatar(nom, alsada, pes, 1, 1, 1, 5, 5);
				llistaFaccions.get(0).setLlistaAvatars(av0);

				do{
					System.out.println("Introduce la classe de tu avatar: \n1. Arquero\n2. Guerrero\n0. Salir");
					opcio = entrada.nextInt();

					switch(opcio){

						case 1:
							break;
						case 2:
							break;
						case 0:
							System.out.println("Saliendo!");
							System.out.println("");
							break;
						default:
							System.out.println("La opción escogida no és válida");
							System.out.println("");


					}



				}while(opcio != 0);

			}	
			public static void crearAvKetep(){

			}
			public static void crearAvMorau(){

			}
			public static void crearAvEsper(){

			}
}
