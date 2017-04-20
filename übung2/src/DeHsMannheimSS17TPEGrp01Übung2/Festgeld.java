package DeHsMannheimSS17TPEGrp01Übung2;

/**
 * 
 * @author sedat
 *
 */
public class Festgeld extends Vermögensgegenstand {
	protected final long laufzeit = 3;
	protected final double zinssatz = 2;
	private long betrag;

	/**
	 * 
	 * @param name  : name des Wertes
	 * @param kaufpreis : wie viel es kostet
	 * @param kaufdatum : wann es angelegt wurde
	 */
	public Festgeld(String name, long kaufpreis, String kaufdatum) {
		super("F.geld", name, kaufpreis, kaufdatum, 1);
	}

	/**
	 * 
	 * @return gibt den betrag an
	 */
	public long zins() {
		betrag = (long) (kaufpreis * (Math.pow(1 + (zinssatz / 100), laufzeit)));
		return betrag;
	}

	public void auskunft() {
		System.out.println(zins());
	}
}
