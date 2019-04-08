package gebaeudeVerwaltung;

public class Moebel {

	int gewicht;
	int laenge; 
	int breite; 
	int hoehe;
	
	int getGewicht() { 
		return gewicht; 
	}

	int getVolumen() {
		return this.laenge * this.breite * this.hoehe;
	}
	
	public int getLaenge() {
		return laenge;
	}

	public int getBreite() {
		return breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	public Moebel(int gewicht, int laenge, int breite, int hoehe) {
		
		this.gewicht = gewicht;
		this.laenge = laenge; 
		this.breite = breite; 
		this.hoehe = hoehe; 
	}
}
