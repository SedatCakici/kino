package uebung4;

/**
 * @author Sedat Cakici
 */
public class Zeit {
	private int hour;
	private int minute;
	private String hhmm;

	/**
	 * Gibt der Zeit ein einheitliches Format (00:00 Uhr bis 23:59 Uhr)
	 * 
	 * @param zeit
	 *            = Eingegebene Startzeit
	 * @throws illegalTimeException
	 *             = Fehlermeldung falls eine ungueltige Startzeit eingegeben
	 *             wird
	 */
	public Zeit(String zeit) throws IllegalTimeException {
		if (zeit.length() > 5) {
			throw new IllegalTimeException("Keine korrekte Zeiteingabe, Text zu lang");
		} else if (!zeit.contains(":")) {
			throw new IllegalTimeException("Kein korrektes Datumsformat angegeben");
		} else {
			int temphour = Integer.parseInt(zeit.substring(0, 2));
			int tempmin = Integer.parseInt(zeit.substring(3));
			if (checkDate(temphour, tempmin)) {
				this.hour = temphour;
				this.minute = tempmin;
			}
		}
	}

	/**
	 * Konstruktor für die Zeit
	 * 
	 * @param hour
	 *            = Stunde
	 * @param minute
	 *            = Minute
	 */
	public Zeit(int hour, int minute) {
		if (checkDate(hour, minute)) {
			this.hour = hour;
			this.minute = minute;
		}
	}

	/**
	 * Ueberpruefungs-Methode ob die Zeit im vorgegebenen Rahmen liegt
	 * (00:00-23:59 Uhr)
	 * 
	 * @param hour
	 *            = Stunde
	 * @param minute
	 *            = Minute
	 * @return false
	 * @return true
	 */
	private boolean checkDate(int hour, int minute) {
		if (hour > 24) {
			return false;
		} else if (minute > 59) {
			return false;
		}
		return true;
	}

	/**
	 * toString-Methode um die gewünschte Zeit in einen String zu casten
	 */
	public String toString() {

		if (minute < 10) {
			this.hhmm = hour + ":" + "0" + minute;
		} else {
			this.hhmm = hour + ":" + minute;
		}
		return hhmm;

	}

}