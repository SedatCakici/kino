package DeHsMannheimSS17TPEGrp01Übung2;
/**
 * 
 * @author sedat
 *
 */
public class Immobilien extends Vermögensgegenstand {
	private final long konstatanteSenkungDesKaufpreisBisMaxNull= kaufpreis/20;
	protected long zeit = 0;
	protected long aktuellerPreis = 0;
	/**
	 * 
	 * @param name : name der Wert stücks
	 * @param kaufpreis : gibt an wie viel es kostet
	 * @param kaufdatum : wann er erstellt wurde
	 */
	public Immobilien(String name, long kaufpreis, String kaufdatum) {
		super("Immo", name, kaufpreis, kaufdatum,1);
	}
	/**
	 * 
	 * @param zeit legt den zeit an
	 */
	public void setZeit(long zeit) {
		if (zeit <= 0) {
			this.zeit = 0;
		}
		else{
			this.zeit = zeit;			
		}
	}
	/**
	 * 
	 */
	public void setZeitAutomatik() {
		this.zeit++;
	}
	/**
	 * 
	 */
	public void wertSinkung() {
		if (kaufpreis < (konstatanteSenkungDesKaufpreisBisMaxNull * zeit)) {
			aktuellerPreis = 0;
		}
		aktuellerPreis = kaufpreis - (zeit * konstatanteSenkungDesKaufpreisBisMaxNull);
	}
	/**
	 * 
	 * @return gibt den zeit 
	 */
	public long getZeit() {
		return zeit;
	}
	/**
	 * 
	 * @return gubt den aktuellen Preis
	 */
	public long getAktuellerPreis() {
		return aktuellerPreis;
	}

}
