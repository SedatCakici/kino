package DeHsMannheimSS17TPEGrp01Übung2;

/**
 * 
 * @author sedat
 *
 */
public class CallOption extends Option implements Handelbar {
	public long gewinn = aktuellerPreis - (kaufpreis + ausübungspreis);

	/**
	 * 
	 * @param name : name des Wertes
	 * @param kaufpreis  : wie viel es kostet
	 * @param kaufdatum : wann es angelegt wurde
	 * @param anzahl : wie viel es davon angelegt wurde
	 * @param ausübungspreis   : gibt den ausgeübte preis an
	 */
	public CallOption(String name, long kaufpreis, String kaufdatum, long anzahl, long ausübungspreis) {
		super(name, kaufpreis, kaufdatum, anzahl, ausübungspreis);

	}

	/**
	 * @see setzt den kurs auf den aktuellen kaufpreis
	 */
	public void setKurs(long kurs) {
		aktuellerPreis = kurs;
	}

}
