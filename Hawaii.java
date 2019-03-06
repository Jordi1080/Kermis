
public class Hawaii extends RisicoRijkeAttractie {
	public Hawaii(){
		this.naam = "Hawaii";
		this.prijs = 290;
		this.draaiLimiet = 5;
	}

	void draaien(){
		wordtBezocht();
			
			System.out.println("Je voelt je alsof je op vakantie bent:");
			System.out.println("Overal om je heen zeurende kinderen en wanhopige ouders");
			System.out.println("Je geeft de ouders jouw perfecte opvoedkundige tips");
			System.out.println("Ze kunnen het niet waarderen en je gaat weg uit Hawaii");
			System.out.println("");
	}
	
	boolean opstellingsKeuring(){
		System.out.println("Hawaii is goedgekeurd voor gebruik.");
		return true;
	}
}
