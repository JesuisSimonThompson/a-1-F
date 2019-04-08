package gebaeudeVerwaltung;

public class Gebaeude {

	String gebaeudeName;
	String verantwortlicherProgrammierer;
	String strasse;
	String hausnummer;
	int plz;
	int anzahlRaeume;
	int anzahlStockwerke;
	int anzahlEingaenge;
	String telNummer;			// 089 14332910
	String kontakt;				// Herr Müller
	
	// Konstruktor dient dazu, ein Objekt zu erzeugen
	
	public Gebaeude(String _gebaeudeName, String _verantwortlicherProgrammierer, String _strasse, String _hausnummer, int _plz)
	{
		gebaeudeName = _gebaeudeName;
		verantwortlicherProgrammierer = _verantwortlicherProgrammierer;
		strasse = _strasse;
		hausnummer = _hausnummer;
		plz = _plz;
	}
	
	public String toString() {
		return ("\nName: "+gebaeudeName+"\t Verantwortlicher: "+verantwortlicherProgrammierer+"\nStraße: "+strasse+"\tHausnummer: "+hausnummer+"\tPLZ:"+plz+"\nStockwerke: "+anzahlStockwerke+"\tEingänge: "+anzahlEingaenge+"\tRäume: "+anzahlRaeume+"\nKontakt: "+kontakt+"\tTelefonnummer: "+telNummer);
	}
	
	public String getBesonderheiten() {
		return "";
	}
	
	public double getGesamtFlaeche() {
		return 0;
	}
	
	public double getVolumen() {
		return 0;
	}

	public double getGewicht() {
		return 0;
	}
	
}
