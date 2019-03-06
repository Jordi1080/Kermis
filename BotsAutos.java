
public class BotsAutos extends Attractie{
	public BotsAutos(){
		this.naam = "Botsauto's";
		this.prijs = 2.50;
	}
	
	void draaien(){
		wordtBezocht();
		
		System.out.println("Je botst tegen een hoop andere auto's");
		System.out.println("Helaas word je weggestuurd omdat je 3 kinderen buiten de attractie hebt geramd");
		System.out.println("");
	}

}
