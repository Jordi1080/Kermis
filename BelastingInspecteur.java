
public class BelastingInspecteur {
	int geldGeind = 0;

	void komtLangs(Kermis k){
		k.doeGokBelastingInKassa(this);
		System.out.println("De belastinginspecteur heeft " + geldGeind + " opgehaald");
	}
}
