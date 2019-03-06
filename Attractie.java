
public abstract class Attractie{
	String naam;
	int aantalKeerBezocht;
	int prijs;
	int omzet;
	int geldBinnenGehaald;
	int oppervlakte;
	
	void wordtBezocht(){
		aantalKeerBezocht++;
		omzet += prijs;
	}
	
	abstract void draaien();
}
