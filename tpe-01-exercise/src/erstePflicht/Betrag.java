package erstePflicht;
/**
 * @author Damla
 * @author Deyis
 * @author sedat
 *
 */
public class Betrag {
	long betrag = 0;
	Weahrung weahrung;

	public byte getVorzeichen(int betrag) { // muss private sein
		if (betrag >= 0) {
			return 1;
		}
		return 0;
	}

	public long Addiere(long zahl1, long zahl2) { // muss private sein
		return zahl1 + zahl2;
	}

	public long Subtrahiere(long zahl1, long zahl2) { // muss private sein
		return zahl1 - zahl2;
	}

	public long Multipliziere(double zahl1, long zahl2) { // muss private sein
		return (long) zahl1 * zahl2;
	}

	public long Multipliziere(int zahl1, long zahl2) { // muss private sein
		return (long) zahl1 * zahl2;
	}

	public long Potenz(long zahl1, long zahl2) { // muss private sein
		long erg = 1;
		for (int i = 0; i < zahl1; i++) {
			erg = erg * zahl2;
		}
		return erg;
	}

	public long Promille(long zahl1) { // nicht sicher nachfragen // muss private sein
		long erg = zahl1 / 1000;
		return erg;
	}

	public long getVorkomma(long zahl1) { // muss private sein
		return zahl1; // muss noch geschitten werden
	}

	public long getVorkomma1(long zahl1) { // muss private sein
		return zahl1 % (int) zahl1; // muss noch geschitten werden
	}

}
