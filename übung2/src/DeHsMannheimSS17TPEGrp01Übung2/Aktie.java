package DeHsMannheimSS17TPEGrp01Übung2;

/**
 * 
 * @author sedat
 *
 */
public class Aktie extends Vermögensgegenstand implements Handelbar {
	protected long anzahl;

	/**
	 * 
	 * @param name : name des Wertes
	 * @param kaufpreis : wie viel es kostet
	 * @param kaufdatum : wann es angelegt wurde
	 * @param anzahl : wie viel es davon angelegt wurde
	 */
	public Aktie(String name, long kaufpreis, String kaufdatum, long anzahl) {
		super("Aktie", name, kaufpreis, kaufdatum, anzahl);
	}

	/**
	 * @see setzt den kurs auf den aktuellen kaufpreis
	 */
	public void setKurs(long kurs) {
		this.aktuellerPreis = kurs;
	}

}
