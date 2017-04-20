package DeHsMannheimSS17TPEGrp01Übung2;
/**
 * 
 * @author sedat
 *
 */
public abstract class Option extends Vermögensgegenstand {
public long ausübungspreis;
/**
 * 
 * @param name : name der Wert stücks
 * @param kaufpreis : wie vie es kostet
 * @param kaufdatum : wann es erstellt wurde
 * @param anzahl : wie viel es davon gibt
 * @param ausübungspreis : was man dafür einsetzt
 */
public Option(String name, long kaufpreis, String kaufdatum, long anzahl, long ausübungspreis) {
    super(name, kaufpreis, kaufdatum,anzahl);
    this.ausübungspreis = ausübungspreis;
}


}