package DeHsMannheimSS17TPEGrp01Übung2;
/**
 * 
 * @author sedat
 *
 */
public class PutOption extends Option implements Handelbar {
	public long gewinnVerlust2 = (kaufpreis + ausübungspreis) - aktuellerPreis;
/**
 * 
 * @param name : name des Wert stücks
 * @param kaufpreis : wie viel es kostet
 * @param kaufdatum : wann es erstellt wurde
 * @param anzahl : wie viel es davon gibt
 * @param ausübungspreis : was man davon profitieren kann
 */
	public PutOption(String name, long kaufpreis, String kaufdatum, long anzahl, long ausübungspreis) {
		super(name, kaufpreis, kaufdatum, anzahl, ausübungspreis);

	}

	public void setKurs(long kurs) {
		aktuellerPreis = kurs;

	}

}
