package DeHsMannheimSS17TPEGrp01Übung2;

import java.util.ArrayList;

/**
 * 
 * @author sedat
 *
 */
public class Aktiefonds extends Fonds {
	public Aktiefonds(String name, long kaufpreis, String kaufdatum, long anzahl) {
		super("A.fonds", name, kaufpreis, kaufdatum, anzahl);
	}

	public ArrayList<Aktie> anSammlungVonAktien = new ArrayList<Aktie>();

	/**
	 * 
	 * @param e : e ist Aktie die in den array reingelegt werden soll
	 */
	public void einenDraufLegen(Aktie e) {
		anSammlungVonAktien.add(e);
	}

	/**
	 * 
	 * @param kurs  : setzt den kurs an.
	 */
	public void setKurs(long kurs) {
		aktuellerPreis = kurs;
	}
}
