import java.text.DecimalFormat;

public class Kassa {
	int omzet = 0;
	int belastingBezoeken = 0;
	
	void verdienGeld(Attractie attractie){
		omzet += attractie.prijs;
	}
	
	void toonOmzet(Kermis k){
//		System.out.println("De omzet van " + k.naam + " is " + centenNaarEuro(omzet));
		int totaleOmzet = 0;
		for (Attractie a : k.attracties){
			totaleOmzet += a.omzet;
		}
		System.out.println("De omzet van " + k.naam + " is " + totaleOmzet);
	}
	
	void toonOmzet(Attractie a){
		System.out.println(a.naam + " heeft " + a.omzet + " binnengehaald");
	}
	
	double centenNaarEuro(int centen){
		double euro = centen/100;
//		euro = centen/100;
//		DecimalFormat formatter = new DecimalFormat("#0.00");
//		formatter.format(euro);
//		euro = Double.parseDouble(String.format("%.2f", (double)euro));
//		System.out.println(Double.valueOf(formatter.format(euro)));
		
		return euro;
	}
}
