
public class Spin extends Attractie{

	public Spin(){
		this.naam = "Spin";
		this.prijs = 2.25;
	}
	
	void draaien(){
		wordtBezocht();
		
		System.out.println("Je gaat naast een kind en zijn moeder zitten en maakt je beugel vast");
		System.out.println("De attractie stopt vroegtijdig omdat je zowel kind als moeder onder hebt gekotst");
		System.out.println("Er komt een schoonmaker en je wordt weggestuurd");
		System.out.println("");
	}
}
