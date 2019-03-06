
public class Kassa {
	double omzet = 0;
	
	
	void verdienGeld(Attractie attractie){
		omzet += attractie.prijs;
	}
	
	void toonOmzet(Kermis k){
		System.out.println("De omzet van " + k.naam + " is " + omzet);
	}
}
