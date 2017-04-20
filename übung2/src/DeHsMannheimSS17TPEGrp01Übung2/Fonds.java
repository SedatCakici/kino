package DeHsMannheimSS17TPEGrp01Übung2;

/**
 * 
 * @author sedat
 *
 */
public abstract class Fonds implements Handelbar {

	protected final String name;
	protected final long kaufpreis;
	protected final String kaufdatum;
	protected long aktuellerPreis;
	protected long anzahl;

	/**
	 * 
	 * @param name : name der Wert Stücks
	 * @param kaufpreis : wie viel es kostet
	 * @param kaufdatum : wann es erstellt wurde
	 * @param anzahl : wie viel es davon gibt
	 */
	public Fonds(String name, long kaufpreis, String kaufdatum, long anzahl) {
		super();
		this.name = name;
		this.kaufpreis = kaufpreis;
		this.kaufdatum = kaufdatum;
		this.aktuellerPreis = kaufpreis;
		this.anzahl = anzahl;
	}
}
