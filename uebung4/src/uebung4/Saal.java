package uebung4;

/**
 * @author Sedat Cakici
 */

public class Saal {

	private String name;
	private int anzahlPlaetze;

	/**
	 * Konstruktor für den Kinosaal
	 * 
	 * @param name
	 *            = Name des Kinosaals
	 * 
	 * @param anzahlPlaetze
	 *            = Anzahl der Sitze im Kinosaal
	 */
	public Saal(String name, int anzahlPlaetze) {
		this.name = name;
		this.anzahlPlaetze = anzahlPlaetze;
	}

	/**
	 * Getter-Methode fuer den Namen des Kinosaals
	 * 
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter-Methode fuer die Anzahl der Sitze
	 * 
	 * @return Anzahl der Sitze
	 */
	public int getAnzahlPlaetze() {
		return anzahlPlaetze;
	}

	/**
	 * toString-Methode um Attribute des Saals in String zu casten
	 */
	public String toString() {
		return ("Saal" + "" + this.getName() + "" + "(" + this.getAnzahlPlaetze() + "Plaetze");
	}

}
