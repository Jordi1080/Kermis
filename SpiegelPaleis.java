
public class SpiegelPaleis extends Attractie{
	public SpiegelPaleis(){
		this.naam = "Spiegelpaleis";
		this.prijs = 275;
	}
	
	void draaien(){
		wordtBezocht();
		
		System.out.println("Je bekijkt jezelf in de spiegel, je bent minder lelijk dan normaal!");
		System.out.println("De andere mensen zien er wel lelijk uit in de spiegel, en je laat het ze allemaal weten");
		System.out.println("De toezichthouder stuurt je weg");
		System.out.println("");
	}
}
