
public abstract class RisicoRijkeAttractie extends Attractie {

	int draaiLimiet; 
	boolean kanDraaien;
	
	abstract boolean opstellingsKeuring();
	
	boolean onderhoudUitvoeren(){
		System.out.println("Zo, deze attractie is weer klaar om te draaien");
		kanDraaien = true;
		return true;
	}
	
	boolean isOnderhouden(){
		if (aantalKeerBezocht >= draaiLimiet){
			kanDraaien = false;
			System.out.println("Deze attractie moet eerst onderhouden worden");
			onderhoudUitvoeren();
			return false;
		}
		else{
			return true; 
		}
	}
	
}
