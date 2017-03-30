package erstePflicht;
/**
 * @author sedat
 *
 */
public class Konto {

	String inhaber = "";
	Weahrung weahrung;

	public Konto(String inhaber, Weahrung weahrung) {
		super();
		this.inhaber = inhaber;
		this.weahrung = weahrung;
	}

	public String getInhaber() {
		return inhaber;
	}

	public Weahrung getWeahrung() {
		return weahrung;
	}

	public void Buche() {
		// muss noch implementieret werden
	}

	public void Saldo() {
		// muss noch implementieret werden
	}

	public void Gebuehren() {
		// muss noch implementieret werden
	}

	@Override
	public String toString() {
		return "Konto [inhaber=" + inhaber + ", weahrung=" + weahrung + "]";
	}

	public static void main(String[] args) {
		// muss noch implementieret werden
	}

}
