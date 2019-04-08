package gebaeudeVerwaltung;

public class Raum {

	String raumName;
	String nutzungsZweck;
	double grundFlaeche;
	double gesamtflaeche;
	int anzahlFenster;
	int stockwerk;
	Moebel[] liste = new Moebel[20];
	int index = -1;

	public Raum() {

	}

	public Raum(String _raumName) {
		raumName = _raumName;
	}

	public Raum(String _raumName, String _nutzungsZweck) {
		raumName = _raumName;
		nutzungsZweck = _nutzungsZweck;
	}

	public Raum(String _raumName, String _nutzungsZweck, double _grundFlaeche, int _anzahlFenster) {
		raumName = _raumName;
		nutzungsZweck = _nutzungsZweck;
		grundFlaeche = _grundFlaeche;
		gesamtflaeche = _grundFlaeche;
		anzahlFenster = _anzahlFenster;
		stockwerk = Integer.parseInt(_raumName)/100;
	}

	public void newMoebel (int gewicht, int laenge, int breite, int hoehe)
	{
		index++;
		liste[index] = new Moebel(gewicht, laenge,breite,hoehe);
	}

	public String toString() {
		return "\nName:  "+ raumName +"\tStock: "+stockwerk+ "\tZweck: "+nutzungsZweck+"\tFläche:  "+grundFlaeche+" m²\tFenster: "+anzahlFenster;
	}

	public double getMoebelVolumen() {
		double rueckgabe = 0;
		if (liste[0]==null)
			return 0;
		else
			for (int hilfs=index; hilfs >= 0; hilfs--)
			{
				rueckgabe+= liste[hilfs].getVolumen();
			}
		return rueckgabe;
	}

	public double getMoebelGewicht() {
		double rueckgabe = 0;
		if (liste[0]==null)
			return 0;
		else
			for (int hilfs=index; hilfs >= 0; hilfs--)
			{
				rueckgabe+= liste[hilfs].getGewicht();
			}
		return rueckgabe;
	}
	
	public void init() {

	}
}
