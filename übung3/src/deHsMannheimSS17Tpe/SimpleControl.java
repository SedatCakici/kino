package deHsMannheimSS17Tpe;

public interface SimpleControl {
	/**
	 * Gibt die ID (Seriennummer) des Ger ̈ats zur ̈uck.
	 *
	 * @return Eine eindeutige Identifikation in Form einer Zahl.
	 */
	public int getId();

	/**
	 * Gibt den Namen des Ger ̈ate-Exemplars zur ̈uck.
	 *
	 * @return Der Name des Ger ̈ats.
	 */
	public String getName();

	/**
	 * Bet ̈atigen den An-/Ausschaltknopf.
	 */
	public void triggerPowerSwitch();

	/**
	 * Pr ̈uft ob das Ger ̈at eingeschaltet ist.
	 *
	 * @return <code>true</code> bedeutet, dass das Ger ̈at eingeschaltet ist,
	 *         <code>false</code>, dass es nicht eingeschaltet ist.
	 */
	public boolean isPowerOn();

	/**
	* Ruft die zuletzt aufgetretene Ausnahme aus dem Fehlerspeicher ab.
	*
	* @return zuletzt aufgetretene Ausnahme oder <code>null</code> falls noch
	*        keine aufgetreten ist.
	*/
	public Exception getLastException();
}
