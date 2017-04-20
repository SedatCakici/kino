package DeHsMannheimSS17TPEGrp01Übung2;

/**
 * 
 * @author sedat
 *
 */
public abstract class Fonds extends Vermögensgegenstand implements Handelbar {

	/**
	 * 
	 * @param name : name der Wert Stücks
	 * @param kaufpreis : wie viel es kostet
	 * @param kaufdatum : wann es erstellt wurde
	 * @param anzahl : wie viel es davon gibt
	 */
	public Fonds(String typ,String name, long kaufpreis, String kaufdatum, long anzahl) {
		super(typ, name, kaufpreis, kaufdatum, anzahl);
	}
}
