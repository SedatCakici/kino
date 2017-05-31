package uebung4;

import java.util.HashMap;

/**
 * @author Sedat Cakici
 */
public class Kino {

	private String name;
	private String stadt;
	private Saal[] saal;
	private HashMap<Integer, Saal> saele = new HashMap<>();

	/**
	 * 
	 * @param name
	 *            = Name des Kinos
	 * @param stadt
	 *            = Stadt in der sich das Kino befindet
	 * @param film
	 *            = Filme die im Kino gespielt werden
	 * @param saal
	 *            = Saele im Kino
	 */
	public Kino(String name, String stadt, Saal[] saal) {
		this.name = name;
		this.stadt = stadt;
		this.saal = saal;
	}

	/**
	 * Erstellt einen Saal und fügt ihn dem Kino hinzu
	 * 
	 * @param saal
	 *            = übergebener Saal wird dem Kino hizugefuegt
	 */
	public void addSaal(Saal saal) {
		saele.put(saal.hashCode(), saal);
	}

	/**
	 * Erstellt eine HashMap der Saele die im Kino sind
	 * 
	 * @return Saele
	 */
	public HashMap<Integer, Saal> getSaele() {
		return this.saele;
	}

	/**
	 * gibt den Namen zurück
	 * 
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * gibt den Stadt zurück
	 * 
	 * @return Stadt
	 */
	public String getStadt() {
		return stadt;
	}

	/**
	 * alle Kinoprogramm durchkaufen 
	 */
	public void gesamtesProgramm() {
		System.out.println(name + "in" + stadt);
		for (Saal s : saal) {
			Main.getFilmeFuerSaalMitZeiten(s);
			System.out.println();
		}
	}

}
