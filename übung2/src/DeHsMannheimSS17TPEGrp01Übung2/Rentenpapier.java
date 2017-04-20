package DeHsMannheimSS17TPEGrp01Übung2;
/**
 * 
 * @author sedat
 *
 */
public class Rentenpapier extends Festgeld implements Handelbar {
	protected final long laufzeit = 10;
	protected final float zinssatz = (float) 1.5;
	protected double kurs;
	/**
	 * 
	 * @param name : name des Wert stücks
	 * @param kaufpreis : gibt den Wert an
	 * @param kaufdatum : wann es erstellt wurde
	 * @param anzahl : wie viel es davon gibt
	 */
	public Rentenpapier(String name, long kaufpreis, String kaufdatum, long anzahl) {
		super(name, kaufpreis, kaufdatum);
		this.anzahl = anzahl;
	}
	
	public long zins() {
		return ((long) (kaufpreis * (Math.pow(laufzeit, (1 + (zinssatz / 100))))));
	}

	public void auskunft() {
		System.out.println(zins());
	}

	public void setKurs(long kurs) {
		this.kurs = kurs;
	}
}
