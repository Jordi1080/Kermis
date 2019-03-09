
public abstract class RisicoRijkeAttractie extends Attractie {

	int draaiLimiet; 
	boolean kanDraaien = true;
	boolean isOnderhouden = true;	
	
	abstract boolean opstellingsKeuring();
 
	void checkAttractieStatus(){
		if (checkOnderhoudNodig()){
			isOnderhouden = false;
			kanDraaien = false;
			System.out.println("Deze attractie moet voor de volgende keer onderhouden worden\n");
		}
	}
	
	boolean checkOnderhoudNodig(){
		if (aantalKeerBezocht % draaiLimiet == 0
			&& aantalKeerBezocht > 0){
			return true;
		}
		return false;
			
	}
	
	void onderhoudUitvoeren(){
		if (!isOnderhouden){
			kanDraaien = true;
			isOnderhouden = true;
			System.out.println("Zo, " + naam + " is weer klaar om te draaien");
		}
		/*
		 * Niet meer relevant omdat ik alle attracties tegelijk laat onderhouden
		else{
			System.out.println("Deze attractie is al onderhouden");
		}
		*/
	}
	
}
