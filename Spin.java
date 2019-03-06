
public class Spin extends RisicoRijkeAttractie {

	public Spin(){
		this.naam = "Spin";
		this.prijs = 225;
		this.draaiLimiet = 5;
	}
	
	void draaien(){
		if (aantalKeerBezocht <= draaiLimiet){
		
			wordtBezocht();
			
			System.out.println("Je gaat naast een kind en zijn moeder zitten en maakt je beugel vast");
			System.out.println("De attractie stopt vroegtijdig omdat je zowel kind als moeder onder hebt gekotst");
			System.out.println("Er komt een schoonmaker en je wordt weggestuurd");
			System.out.println("");
		}
		else{
			System.out.println("Deze attractie moet eerst onderhouden worden");
			onderhoudUitvoeren();
		}
	}
	
	boolean opstellingsKeuring(){
		System.out.println("De Spin is goedgekeurd voor gebruik.");
		return true;
	}
}
