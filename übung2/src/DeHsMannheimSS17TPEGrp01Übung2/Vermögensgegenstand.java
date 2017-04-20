package DeHsMannheimSS17TPEGrp01Übung2;
/**
 * 
 * @author sedat
 *
 */
public abstract class Vermögensgegenstand {
	protected final String typ;
	protected final String name;
	protected final long kaufpreis;
	protected final String kaufdatum;
	protected long aktuellerPreis;
	protected long anzahl;
/**
 * @param typ: gibt den typ des vermögensgestandes an.
 * @param name : name des Wertes
 * @param kaufpreis : wie viel es kostet
 * @param kaufdatum : wann es angelegt wurde
 * @param anzahl : wie viel es davon angelegt wurde
 */
	public Vermögensgegenstand(String typ,String name, long kaufpreis, String kaufdatum,long anzahl) {
		super();
		this.typ=typ;
		this.name = name;
		this.kaufpreis = kaufpreis;
		this.kaufdatum = kaufdatum;
		this.aktuellerPreis = kaufpreis;
		this.anzahl = anzahl;
	}
}
