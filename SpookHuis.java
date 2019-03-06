import java.util.Random;

public class SpookHuis extends Attractie{
	public SpookHuis(){
		this.naam = "Spookhuis";
		this.prijs = 3.20;
	}
	
	void draaien(){
		wordtBezocht();
		
		Random rng = new Random();
		int randomWaarde = rng.nextInt(10)+1;
		
		System.out.println("Nadat iemand in een Draculakostuum je laat schrikken plas je in je broek");
		System.out.println("Uit frustratie verstop je je zelf in het Spookhuis en laat je kinderen schrikken");
		System.out.println("Je moet het Spookhuis verlaten omdat je " + randomWaarde + " kinderen aan het huilen hebt gemaakt");
		System.out.println("");
	}
}
