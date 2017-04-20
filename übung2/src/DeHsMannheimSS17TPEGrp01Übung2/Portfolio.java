package DeHsMannheimSS17TPEGrp01Übung2;

import java.util.ArrayList;

/**
 * 
 * @author sedat
 *
 */
public class Portfolio {

	ArrayList<Vermögensgegenstand> vmgs = new ArrayList<Vermögensgegenstand>();
	protected long summe[] = new long[5];
	protected byte j = 0;

	/**
	 * 
	 * @param e
	 *            : gibt an was es draufgelegt wird
	 */
	protected void addVmg(Vermögensgegenstand e) {
		vmgs.add(e);
	}

	/**
	 * 
	 * @return : gibt den allen zusammen gezählten wert an
	 */
	protected long berecheWert() {
		j++;
		summe[j] = 0;
		for (int i = 0; i < vmgs.size(); i++) {
			summe[j] = summe[j] + (vmgs.get(i).aktuellerPreis * vmgs.get(i).anzahl);
		}
		return summe[j];
	}
/**
 * @see gibt die Tabelle aus für portfolio 1
 */
	protected void listVGM1() {
		System.out.println("Typ\t\tName\t\tAnzahl\t\tStückpreis");
		for (int i = 0; i < vmgs.size(); i++) {
			System.out.println(vmgs.get(i).typ + "\t\t" + vmgs.get(i).name + "\t\t" + vmgs.get(i).anzahl + "\t\t"
					+ vmgs.get(i).aktuellerPreis);
		}
	}
/**
 * @see gibt die Tabelle aus für portfolio 2 
 */

	/**
	 * 
	 * @return gibt den gewinn oder den verlust an
	 */
	protected long gewinnVerlustAmEnde() {
		long endSumme = summe[j] - summe[1];
		return endSumme;
	}

}