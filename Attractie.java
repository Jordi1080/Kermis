
public abstract class Attractie{
	String naam;
	int aantalKeerBezocht;
	double prijs;
	int geldBinnenGehaald;
	int oppervlakte;
	
	void wordtBezocht(){
		aantalKeerBezocht++;
	}
	
	abstract void draaien();
}
