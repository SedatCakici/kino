package erstePflicht;

/**
 * @author Damla 
 * @author Deyis
 * @author Sedat
 */
public class Weahrung {
	private String name = "";
	private String kuerzel = "";
	private String kurs = "";
	Betrag betrag;

	/**
	 * 
	 * @param name
	 * @param kuerzel
	 * @param kurs
	 */
	public Weahrung(String name, String kuerzel, String kurs) {
		super();
		this.name = name;
		this.kuerzel = kuerzel;
		this.kurs = kurs;
	}

	/**
	 * 
	 * @return Name der Währung
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return Kürzel der Währung zb: $,€,TL
	 */
	public String getKuerzel() {
		return kuerzel;
	}

	/**
	 * 
	 * @return
	 */
	public String getKurs() {
		return kurs;
	}

	/**
	 * 
	 * @param betrag
	 * @param zielWeahrung
	 * @return
	 */
	public long umrechnen(long betrag, String zielWeahrung) {
		if (zielWeahrung.equals("$")) {
			return betrag;
		}

		if (zielWeahrung.equals("€")) {
			betrag = betrag * 12690; // stimmt was nicht
			return betrag;
		}
		if (zielWeahrung.equals("YEN")) {
			betrag = betrag * 91; // stimmt was nicht
			return betrag;
		}
		if (zielWeahrung.equals("RUB")) {
			betrag = betrag * 255; // stimmt was nicht
			return betrag;
		}
		if (zielWeahrung.equals("CHF")) {
			betrag = betrag * 10509; // stimmt was nicht
			return betrag;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Weahrung [name=" + name + ", kuerzel=" + kuerzel + ", kurs=" + kurs + ", betrag=" + betrag + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((betrag == null) ? 0 : betrag.hashCode());
		result = prime * result + ((kuerzel == null) ? 0 : kuerzel.hashCode());
		result = prime * result + ((kurs == null) ? 0 : kurs.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weahrung other = (Weahrung) obj;
		if (betrag == null) {
			if (other.betrag != null)
				return false;
		} else if (!betrag.equals(other.betrag))
			return false;
		if (kuerzel == null) {
			if (other.kuerzel != null)
				return false;
		} else if (!kuerzel.equals(other.kuerzel))
			return false;
		if (kurs == null) {
			if (other.kurs != null)
				return false;
		} else if (!kurs.equals(other.kurs))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// public void USDoller() {
	// String name = "US-Doller";
	// String zeichen = "$";
	// long kursZum$ = 1l;
	// }
	//
	// public void Euro() {
	// String name = "Euro";
	// String zeichen = "€";
	// long kursZum$ = 12690l;
	// }
	//
	// public void Yen() {
	// String name = "Yen";
	// String zeichen = "¥";
	// long kursZum$ = 91l; // wirklich 0.0091
	// }
	//
	// public void Rubel() {
	// String name = "Rubel";
	// String zeichen = "RUB";
	// long kursZum$ = 255l; // wirklich 0.0255
	// }
	//
	// public void SchweizerFranken() {
	// String name = "Schweizer Franken";
	// String zeichen = "CHF";
	// long kursZum$ = 10509l;
	// }

}
