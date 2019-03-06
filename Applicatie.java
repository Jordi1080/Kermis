import java.util.Scanner;

public class Applicatie {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Applicatie().spelen();
	}
	
	void spelen(){
		Kermis kermis = new Kermis();
		kermis.naam = "Disney Zobest";
		kermis.toonWelkom();
		
		while (true){
			//kermis.toonAantalKeerBezocht();
			kermis.toonAttracties();
			kermis.attractieKeuze();
			
			
		}	
	}

}
