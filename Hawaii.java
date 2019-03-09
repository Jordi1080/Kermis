
public class Hawaii extends RisicoRijkeAttractie {
	public Hawaii(){
		this.naam = "Hawaii";
		this.prijs = 290;
		this.draaiLimiet = 10;
	}

	void draaien() throws AttractieNietOnderhoudenException{// throws Exception{
		if (kanDraaien){
			
			if (aantalKeerBezocht == 0){
				opstellingsKeuring();
			}
			
			wordtBezocht();
			beschrijfAvontuur();
			checkAttractieStatus();
		} else{
			throw new AttractieNietOnderhoudenException("O jee, Hawaii is niet onderhouden\n"
					+ "Nou ja, dat is pech dan\n"
					+ "...\n"
					+ "...\n"
					+ "Waarom sta je hier nog? Je mag er niet in\n"
					+ "...\n"
					+ "Ga weg of ik haal de beveiliging erbij\n");
		}

}
	
	boolean opstellingsKeuring(){
		System.out.println("Hawaii is goedgekeurd voor gebruik.\n");
		return true;
	}
	
	void beschrijfAvontuur(){
		System.out.println("Je voelt je alsof je op vakantie bent:");
		System.out.println("Overal om je heen zeurende kinderen en wanhopige ouders");
		System.out.println("Je geeft de ouders jouw perfecte opvoedkundige tips");
		System.out.println("Ze kunnen het niet waarderen en je gaat weg uit Hawaii");
		System.out.println("");
	}
}
