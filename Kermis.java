import java.util.ArrayList;
import java.util.Scanner;


public class Kermis {
	int geld = 1000;
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
		if (sc.hasNextLine()){
			input = sc.nextLine().trim();
			
			switch(input){
			case "1": 
				System.out.println("je gaat naar de Botsauto's");
				attracties.get(0).draaien();
				kassa.verdienGeld(attracties.get(0));
				break;
			case "2": 
				System.out.println("je gaat naar de Spin");
				attracties.get(1).draaien();
				kassa.verdienGeld(attracties.get(1));
				break;
			case "3": 
				System.out.println("je gaat naar het Spiegelpaleis");
				attracties.get(2).draaien();
				kassa.verdienGeld(attracties.get(2));
				break;
			case "4": 
				System.out.println("je gaat naar het Spookhuis");
				attracties.get(3).draaien();
				kassa.verdienGeld(attracties.get(3));
				break;
			case "5": 
				System.out.println("je gaat naar Hawaii");
				attracties.get(4).draaien();
				kassa.verdienGeld(attracties.get(4));
				break;
			case "6": 
				System.out.println("je gaat naar het Ladderklimmen");
				attracties.get(5).draaien();
				kassa.verdienGeld(attracties.get(5));
			break;
				
			default:
					System.out.println("je moet 1-6 typen dombo");
			}
		}
	}
	
	void toonAttracties(){
		System.out.println("De kermis bevat de volgende attracties:");
		for (int i = 0; i < attracties.size(); i++){
			System.out.println(attracties.get(i).naam + " (" + (i+1) +")");
		}
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
	
	void toonWelkom(){
		System.out.println("Welkom bij ons mooie attractiepark " + naam);
		System.out.println("Ons park is heel veilig en zeker niet dodelijk zoals in de krant stond");
		System.out.println("Niet naar de media luisteren, ze liegen over ons park!");
		System.out.println("Ehm, hoe dan ook:");
		System.out.println("");
	}
}
