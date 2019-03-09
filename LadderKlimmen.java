
public class LadderKlimmen extends Attractie implements GokAttractie{
	
	public LadderKlimmen(){
		this.naam = "Ladder Klimmen";
		this.prijs = 500;
	}
	
	void draaien(){
		wordtBezocht();
		kansSpelBelastingBetalen(prijs);
		
		System.out.println("Je bent halverwege met klimmen, wanneer een kind je inhaalt");
		System.out.println("Je pikt het niet en maakt er een race van");
		System.out.println("Je wordt weggestuurd omdat je een kind van de ladder hebt geduwd");
		System.out.println("");
	}
	
	public int kansSpelBelastingBetalen(int omzet){
		opzijGezetteOmzet += kansSpelBelasting * omzet;
		System.out.println("Ladderklimmen zet geld opzij voor de belastinginspecteur");
		omzet -= kansSpelBelasting * omzet;
	return omzet;
	}
}
