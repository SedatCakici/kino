package deHsMannheimSS17Tpe;

public interface SimpleInstructions {
	/**
	* Gibt ein Array von Zahlen als String zur ̈uck. Die Zahlen werden
	* <b>nicht</b> sortiert.
	*
	* @param zahlen Zahlen, die ausgegeben werden sollen.
	* @return Zahlen als String
	* @throws IllegalStateException wenn das Ger ̈at in einem ung ̈ultigen Zustand ist
	* @throws Exception wenn das Array nicht seinen Vorstellungen entspricht
	*/
	public String speak(int[] zahlen) throws IllegalStateException, MachineException, RobotMacigValueException;
	/**
	* Sortiert ein Array von Zahlen. Die Reihenfolge h ̈angt von dem Typ des
	* Ger ̈ats ab.
	*
	* @param zahlen Zahlen, die sortiert werden sollen.
	* @return Sortierte Zahlen
	* @throws IllegalStateException wenn das Ger ̈at in einem ung ̈ultigen Zustand ist,
	* @throws Exception wenn das Array nicht seinen Vorstellungen entspricht
	*/
	public int[] think(int[] zahlen) throws IllegalStateException, MachineException;
}
