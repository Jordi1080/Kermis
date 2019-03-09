
public class Spin extends RisicoRijkeAttractie implements GokAttractie{
	
	public Spin(){
		this.naam = "Spin";
		this.prijs = 225;
		this.draaiLimiet = 5;
	}
	

	
	void draaien() throws AttractieNietOnderhoudenException{
//		System.out.println("kandraaien: " + kanDraaien); test
//		System.out.println("isOnderhouden: " + isOnderhouden); test

		if (kanDraaien){
				
			// voor eerste keer moet hij de keuring door
			if (aantalKeerBezocht == 0){
				opstellingsKeuring();
			}
			
			wordtBezocht();
			kansSpelBelastingBetalen(prijs);
			checkAttractieStatus();
			
			//System.out.println("aantal keer bezocht: " + aantalKeerBezocht); // test
			
			beschrijfAvontuur();
			

		} else{
			throw new AttractieNietOnderhoudenException("O jee, de Spin is niet onderhouden\n"
					+ "Ga maar wat anders doen\n"
					+ "Er zijn zat andere attracties in dit park\n"
					+ "We sturen nog wel een monteur\n"
					+ "Misschien morgen of zo\n"
					+ "Of een andere keer\n"
					+ "Zzz...\n");
		}

	}
	
	public int kansSpelBelastingBetalen(int omzet){
		opzijGezetteOmzet += kansSpelBelasting * omzet;
		//System.out.println("De Spin zet geld opzij voor de belastinginspecteur\n");
		omzet -= kansSpelBelasting * omzet;
		
		return omzet;
	}
	
	boolean opstellingsKeuring(){
		System.out.println("De Spin is goedgekeurd voor gebruik.\n");
		return true;
	}
	
	void beschrijfAvontuur(){
		System.out.println("Je gaat naast een kind en zijn moeder zitten en maakt je beugel vast");
		System.out.println("De attractie stopt vroegtijdig omdat je zowel kind als moeder onder hebt gekotst");
		System.out.println("Er komt een schoonmaker en je wordt weggestuurd");
		System.out.println("");
	}
}
