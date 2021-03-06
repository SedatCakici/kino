package uebung4;

import java.util.Comparator;

/**
 * 
 * @author Sedat Cakici
 */

public class Film {

	private String titel;
	private String laufzeit;
	private Alterbeschrankung altersfreigabe;
	private Zeit startzeit;
	private Saal saal;

	/**
	 * Konstruktor für einen Film
	 * 
	 * @param name
	 *            = Name des Films
	 * @param laufzeit
	 *            = Laufzeit des Films
	 * @param altersfreigabe
	 *            = Altersfreigabe des Films
	 * @param startzeit
	 *            = Startzeit des Films
	 * @param saal
	 *            = Saal in dem der Film laeuft
	 */
	public Film(String name, String laufzeit, Alterbeschrankung altersfreigabe, Zeit startzeit, Saal saal) {
		this.titel = name;
		this.laufzeit = laufzeit;
		this.altersfreigabe = altersfreigabe;
		this.startzeit = startzeit;
		this.saal = saal;
	}

	static class FilmName implements Comparator<Film> {
		/**
		 * Vergleicht zwei Filme miteinander in Bezug auf den Namen
		 */
		@Override
		public int compare(Film film1, Film film2) {
			if (film1.getName() == null && film2.getName() == null) {
				return 0;
			}
			if (film1.getName() == null) {
				return 1;
			}
			if (film2.getName() == null) {
				return -1;
			}
			return film1.getName().compareTo(film2.getName());
		}

	}

	static class FilmRating implements Comparator<Film> {
		/**
		 * Vergleicht zwei Filme miteinander in Bezug auf die Altersfreigabe
		 */
		@Override
		public int compare(Film film1, Film film2) {
			if (film1.getAltersfreigabe() == null && film2.getAltersfreigabe() == null) {
				return 0;
			}
			if (film1.getAltersfreigabe() == null) {
				return 1;
			}
			if (film2.getAltersfreigabe() == null) {
				return -1;
			}
			return film1.getAltersfreigabe().compareTo(film2.getAltersfreigabe());
		}
	}

	static class FilmStartzeit implements Comparator<Film> {
		/**
		 * Vergleicht zwei Filme miteinander in Bezug auf die Startzeit
		 */
		@Override
		public int compare(Film film1, Film film2) {
			if (film1.getStartzeit().toString() == null && film2.getStartzeit().toString() == null) {
				return 0;
			}
			if (film1.getStartzeit().toString() == null) {
				return 1;
			}
			if (film2.getStartzeit().toString() == null) {
				return -1;
			}
			return film1.getStartzeit().toString().compareTo(film2.getStartzeit().toString());
		}
	}

	static class FilmLaufzeit implements Comparator<Film> {
		/**
		 * Vergleicht zwei Filme miteinander in Bezug auf die Laufzeit
		 */
		@Override
		public int compare(Film film1, Film film2) {
			if (film1.getLaufzeit() == null && film2.getLaufzeit() == null) {
				return 0;
			}
			if (film1.getLaufzeit() == null) {
				return 1;
			}
			if (film2.getLaufzeit() == null) {
				return -1;
			}
			Integer filmNr1 = Integer.parseInt(film1.getLaufzeit());
			Integer filmNr2 = Integer.parseInt(film2.getLaufzeit());
			return filmNr1.compareTo(filmNr2);
		}
	}

	/**
	 * Getter-Methode fuer die Startzeit
	 * 
	 * @return Startzeit
	 */
	public Zeit getStartzeit() {
		return startzeit;
	}

	/**
	 * Getter-Methode fuer den Saal
	 * 
	 * @return Saal
	 */
	public String getSaal() {
		return this.saal.getName();
	}

	/**
	 * Getter-Methode fuer den Namen
	 * 
	 * @return Name
	 */
	public String getName() {
		return titel;
	}

	/**
	 * Getter-Methode fuer die Laufzeit
	 * 
	 * @return Laufzeit
	 */
	public String getLaufzeit() {
		return laufzeit;
	}

	/**
	 * Getter-Methode fuer die Altersfreigabe
	 * 
	 * @return Altersfreigabe
	 */
	public Alterbeschrankung getAltersfreigabe() {
		return altersfreigabe;
	}

	/**
	 * toString-Methode um die Ausgabe der Attribute eines Films in einen String
	 * zu casten
	 */
	public String toString() {
		String ausgabe = this.startzeit + "--" + this.titel +" "+ this.altersfreigabe +" "+ this.laufzeit+"min";
		return ausgabe;
	}

	/**
	 * Ausgabe der Filmattribute ohne Startzeit
	 * 
	 * @return Attribute ohne Startzeit
	 */
	public String ohneUhrzeit() {
		String ausgabe = this.titel +" "+ this.altersfreigabe + " " + this.laufzeit+"min";
		return ausgabe;
	}
}
