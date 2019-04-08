package gebaeudeVerwaltung;

public class OEZ extends Gebaeude implements Reinigungskosten {
	
	Raum r1 = new Raum("1","Halle  ",2000,100);
	
	Geschaeft r2 = new Geschaeft("2","Geschäft",150,10,"DM","Herr Maier");				// Name des Raumes, Art, m², Fenster, Name des Geschaefts, Besitzer, Gewicht, Laenge, Breite, Hoehe
	
	Geschaeft r3 = new Geschaeft("3","Geschäft",250,10,"DEICHMANN","Frau Deich", "103", 250, 20);		//zwei Raeume
													// Raumname, Art, m², Fenster, Name des Geschaefts, Besitzer, Gewicht, Raumname2, m², Fenster2
	Geschaeft r4 = new Geschaeft("4","Geschäft",30,0,"RICHARD","Frau Reich");

	Geschaeft r5 = new Geschaeft("5","Geschäft",100,6,"Apotheke","Herr Hahn");

	Raum r6 = new Raum("6","Abstellkammer",10,0);

	Geschaeft r7 = new Geschaeft("7","Geschäft",160,4,"Fielmann","Herr Mann");

	Geschaeft r8 = new Geschaeft("8","Geschäft",180,0,"Apple Store","Frau Apfel");

	Geschaeft r9 = new Geschaeft("9","Geschäft",150,10,"C&A","Frau Weiss", "109", 150, 10, "209", 150, 10);	//drei Raeume
	// Raumname, Art, m², Fenster, Name des Geschaefts, Besitzer, Raumname2, m², Fenster2, Raumname3, m², Fenster3
	
	Geschaeft r10 = new Geschaeft("10","Geschäft",70,0,"Sushi Tokyo","Frau Tokaido");

	Geschaeft r101 = new Geschaeft("101","Geschäft",50,4,"Dunkin` Donuts","Herr Wasweissichwas");

	Geschaeft r204 = new Geschaeft("204","Geschäft",25,2,"?     ","?");
	
	Raum[] alleR = {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r101,r204};  

	public OEZ()
	{
		super("OEZ", "Filip", "Hanauerstrasse", "68", 80993);
		anzahlStockwerke = 3;
		anzahlRaeume = alleR.length;
		telNummer = "089 14332910";
		kontakt = "Herr Sonstwas";
		r2.newMoebel(12,8,1,1);		//Gewicht, Länge, Breite, Höhe		// würde ich gerne in Raum oder Gebaeude packen, aber dann müssen die Raeume auch da deklariert werden
		r2.newMoebel(4,2,2,1);
		r2.newMoebel(10,10,1,1);
		r2.newMoebel(8,8,1,1);
		r2.newMoebel(4,4,1,1);
		r3.newMoebel(1,5,1,1);
		r3.newMoebel(8,4,1,1);
		r3.nebenraum.newMoebel(7,7,1,1);
		r3.nebenraum.newMoebel(1,1,1,1);
		r4.newMoebel(1,1,1,1);
		r4.newMoebel(4,4,1,1);
		r5.newMoebel(1,1,1,1);
		r5.newMoebel(4,4,1,1);
		r6.newMoebel(4,4,1,1);
		r7.newMoebel(1,1,1,1);
		r7.newMoebel(4,4,1,1);
		r8.newMoebel(1,1,1,1);
		r8.newMoebel(4,4,1,1);
		r9.newMoebel(1,1,1,1);
		r9.newMoebel(4,4,1,1);
		r9.nebenraum.newMoebel(1,1,1,1);
		r9.nebenraum.newMoebel(4,4,1,1);
		r9.nebenraum2.newMoebel(1,1,1,1);
		r9.nebenraum2.newMoebel(4,4,1,1);
		r10.newMoebel(1,1,1,1);
		r10.newMoebel(4,4,1,1);
		r204.newMoebel(1,1,1,1);
		r101.newMoebel(4,4,1,1);
		r101.newMoebel(1,1,1,1);
		r204.newMoebel(40,40,3,1);
	}

	public String toString() {
		
		String langerString = super.toString()+"\n"+this.getBesonderheiten()+"\n";
		double flaeche = 0;
		double volumen = 0;
		double gewicht = 0;
		for (Raum raum : alleR) {
			langerString += raum.toString()+"\n";
			flaeche += raum.gesamtflaeche;
			volumen += raum.getMoebelVolumen();
			gewicht += raum.getMoebelGewicht();
		}
		volumen += r3.nebenraum.getMoebelVolumen();			// Nebenräume extra aufgeführt
		volumen += r9.nebenraum.getMoebelVolumen();
		volumen += r9.nebenraum2.getMoebelVolumen();
		gewicht += r3.nebenraum.getMoebelGewicht();
		gewicht += r9.nebenraum.getMoebelGewicht();
		gewicht += r9.nebenraum2.getMoebelGewicht();
		langerString += "\nDie Gesamtfläche ist "+flaeche+"m².\n";
		langerString += "\nDas Gesamtvolumen an Möbeln ist "+volumen+"m³, und das Gewicht ist "+gewicht+"kg.";
		langerString += "\nReinigungskosten wäre insgesamt "+getKosten()+"€.";
		return (langerString);
	}

	public String getBesonderheiten() {
		return "\nDas OEZ hat fast 130 Shops und auch eine eigene App, um diese zu finden.";
	}
	
	public double getGesamtFlaeche() {
		double flaeche = 0;
		for (Raum raum : alleR) {
			flaeche += raum.gesamtflaeche;
		}
		return flaeche;
	}
	
	public double getKosten()
	{
		double kosten = 0;
		double flaeche = 0;
		double fenster = 0;
		for (Raum raum : alleR) {
			flaeche += raum.gesamtflaeche;
			fenster += raum.anzahlFenster;
		}
		kosten = (flaeche*2)+(fenster*5);
		return kosten;
	}

}
