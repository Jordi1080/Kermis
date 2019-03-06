
public class LadderKlimmen extends Attractie{
	public LadderKlimmen(){
		this.naam = "Ladder Klimmen";
		this.prijs = 500;
	}
	
	void draaien(){
		wordtBezocht();
		
		System.out.println("Je bent halverwege met klimmen, wanneer een kind je inhaalt");
		System.out.println("Je pikt het niet en maakt er een race van");
		System.out.println("Je wordt weggestuurd omdat je een kind van de ladder hebt geduwd");
		System.out.println("");
	}
}
