import java.util.ArrayList;
import java.util.Scanner;


public class Kermis {
	
	String naam;
	ArrayList<Attractie> attracties = new ArrayList<>();
	Kassa kassa;
	
	Scanner sc = new Scanner(System.in);
	String input = "";
	
	public Kermis(){
		kassa = new Kassa();
		
		attracties.add(new BotsAutos());
		attracties.add(new Spin());
		attracties.add(new SpiegelPaleis());
		attracties.add(new SpookHuis());
		attracties.add(new Hawaii());
		attracties.add(new LadderKlimmen());
		
	}
	
	void attractieKeuze(){
		try{
			if (sc.hasNextLine()){
				input = sc.nextLine().trim();
				
				switch(input){
				case "1": 
					System.out.println("Je gaat naar de Botsauto's\n");
					attracties.get(0).draaien();
					// verdienGeld moet alleen gebeuren als de attractie niet kapot is
					// miss in andere klasse zetten?
					kassa.verdienGeld(attracties.get(0));
					break;
				case "2": 
					System.out.println("Je gaat naar de Spin\n");
					attracties.get(1).draaien();
					kassa.verdienGeld(attracties.get(1));
					break;
				case "3": 
					System.out.println("Je gaat naar het Spiegelpaleis\n");
					attracties.get(2).draaien();
					kassa.verdienGeld(attracties.get(2));
					break;
				case "4": 
					System.out.println("Je gaat naar het Spookhuis\n");
					attracties.get(3).draaien();
					kassa.verdienGeld(attracties.get(3));
					break;
				case "5": 
					System.out.println("Je gaat naar Hawaii\n");
					attracties.get(4).draaien();
					kassa.verdienGeld(attracties.get(4));
					break;
				case "6": 
					System.out.println("Je gaat naar het Ladderklimmen\n");
					attracties.get(5).draaien();
					kassa.verdienGeld(attracties.get(5));
					break;
					
				case "o":
					kassa.toonOmzet(this);
					System.out.println("Omzet per attractie: ");
					toonOmzet();
					break;
				case "k":
					toonAantalKeerBezocht();
					break;
				case "u":
					onderhoudOveral();
					break;
				case "b":
					new BelastingInspecteur().komtLangs(this);
					kassa.belastingBezoeken++;
					break;
				default:
						System.out.println("nee");
				}
			}
		}
		catch (AttractieNietOnderhoudenException e){
		}
	}
	
	void onderhoudOveral(){
		for (Attractie a : attracties){
			if (a instanceof RisicoRijkeAttractie){
				((RisicoRijkeAttractie) a).onderhoudUitvoeren();
			}
		}
	}
	
	void doeGokBelastingInKassa(BelastingInspecteur bi){
		for (Attractie a : attracties){
			if (a instanceof GokAttractie){
				bi.geldGeind += a.opzijGezetteOmzet;
				a.opzijGezetteOmzet = 0;
				
			}
		}

	}
	
	void toonAttracties(){
		System.out.println("De kermis bevat de volgende attracties:");
		for (int i = 0; i < attracties.size(); i++){
			System.out.println(attracties.get(i).naam + " (" + (i+1) +")");
		}
		System.out.println("");
		System.out.println("Waar wil je naartoe?");
		System.out.println("");
	}
	
	void toonAantalKeerBezocht(){
		System.out.println("Dit is hoe vaak elke attractie tot nu toe bezocht is:");
		for (Attractie a : attracties){
			System.out.println(a.naam + ": " + a.aantalKeerBezocht);
		}
		System.out.println("");
	}
	
	void toonOmzet(){
		for (Attractie a : attracties){
			kassa.toonOmzet(a);
		}
		System.out.println("");
	}
	
	void toonWelkom(){
		System.out.println("Welkom bij ons mooie attractiepark " + naam);
		System.out.println("Ons park is heel veilig en zeker niet dodelijk zoals in de krant stond");
		System.out.println("Niet naar de media luisteren, ze liegen over ons park!");
		System.out.println("Ehm, hoe dan ook:");
		System.out.println("");
	}
}
