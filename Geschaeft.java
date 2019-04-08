package gebaeudeVerwaltung;

public class Geschaeft extends Raum implements Reinigungskosten {

	String besitzer;
	String name; 
	int anzahlRaeume;
	Raum hauptraum;
	Raum nebenraum;
	Raum nebenraum2;
	

	public Geschaeft(String _raumName, String _nutzungsZweck, double _grundFlaeche, int _anzahlFenster , String _name,String _besitzer) {

		hauptraum = new Raum(_raumName, _nutzungsZweck, _grundFlaeche, _anzahlFenster);
		name = _name;
		besitzer = _besitzer;
		anzahlRaeume = 1;
		gesamtflaeche = _grundFlaeche;
	}

	public Geschaeft(String _raumName, String _nutzungsZweck, double _grundFlaeche, int _anzahlFenster , String _name,String _besitzer, String _raumname2, double _grundFlaeche2, int _anzahlfenster2) {

		hauptraum = new Raum(_raumName, _nutzungsZweck, _grundFlaeche, _anzahlFenster);
		nebenraum = new Raum(_raumname2, _nutzungsZweck, _grundFlaeche2, _anzahlfenster2);
		name = _name;
		besitzer = _besitzer;
		anzahlRaeume = 2;
		gesamtflaeche = _grundFlaeche + _grundFlaeche2;
	}

	public Geschaeft(String _raumName, String _nutzungsZweck, double _grundFlaeche, int _anzahlFenster , String _name,String _besitzer, String _raumname2, double _grundFlaeche2, int _anzahlfenster2, String _raumname3, double _grundFlaeche3, int _anzahlfenster3) {

		hauptraum = new Raum(_raumName, _nutzungsZweck, _grundFlaeche, _anzahlFenster);
		nebenraum = new Raum(_raumname2, _nutzungsZweck, _grundFlaeche2, _anzahlfenster2);
		nebenraum2 = new Raum(_raumname3, _nutzungsZweck, _grundFlaeche3, _anzahlfenster3);
		name = _name;
		besitzer = _besitzer;
		anzahlRaeume = 3;
		gesamtflaeche = _grundFlaeche + _grundFlaeche2 + _grundFlaeche3;
	}
	
	public String toString() {
		if (anzahlRaeume == 1)
			return ""+hauptraum.toString()+"\tName: "+name+"\tBesitzer: "+besitzer;
		else if (anzahlRaeume == 2)
			return ""+hauptraum.toString()+"\tName: "+name+"\tBesitzer: "+besitzer+"\n"+nebenraum.toString()+"\tName: "+name+"\tBesitzer: "+besitzer;
		else if (anzahlRaeume == 3)
			return ""+hauptraum.toString()+"\tName: "+name+"\tBesitzer: "+besitzer+"\n"+nebenraum.toString()+"\tName: "+name+"\tBesitzer: "+besitzer+"\n"+nebenraum2.toString()+"\tName: "+name+"\tBesitzer: "+besitzer;
		else
			return "";
	}
	
	public double getKosten() {
		return 0;
	}
}
