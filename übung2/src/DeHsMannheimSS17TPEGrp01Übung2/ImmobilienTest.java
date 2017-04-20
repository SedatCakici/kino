package DeHsMannheimSS17TPEGrp01Übung2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author sedat
 *
 */
public class ImmobilienTest {

	@Test
	public void nameTest() {
		Immobilien im = new Immobilien("BeethovenStr.15", 1000000, "12.11");
		String output = im.name;
		assertEquals("BeethovenStr.15", output);
	}

	@Test
	public void kaufpreisTest() {
		Immobilien im = new Immobilien("BeethovenStr.15", 1000000, "12.11");
		long output = im.kaufpreis;
		assertEquals(1000000, output);

		im = new Immobilien("BeethovenStr.15", 0, "12.11");
		output = im.kaufpreis;
		assertEquals(0, output);

		im = new Immobilien("BeethovenStr.15", -1000000, "12.11");
		output = im.kaufpreis;
		assertEquals(-1000000, output);
	}

	@Test
	public void kaufdatumTest() {
		Immobilien im = new Immobilien("BeethovenStr.15", 1000000, "12.11");
		String output = im.kaufdatum;
		assertEquals("12.11", output);
	}

	@Test
	public void setZeitTest() {
		Immobilien im = new Immobilien("BeethovenStr.15", 1000000, "12.11");
		im.setZeit(5);
		long output = im.zeit;
		assertEquals(5, output);

		im.setZeit(0);
		output = im.zeit;
		assertEquals(0, output);

		im.setZeit(-5);
		output = im.zeit;
		assertEquals(0, output);
	}

	@Test
	public void wertSinkungTest() {
		Immobilien im = new Immobilien("BeethovenStr.15", 1000000, "12.11");
		im.setZeit(10);
		im.wertSinkung();
		long output = im.aktuellerPreis;
		assertEquals(500000, output);

		im.setZeit(0);
		im.wertSinkung();
		output = im.aktuellerPreis;
		assertEquals(1000000, output);

		im.setZeit(-10);
		im.wertSinkung();
		output = im.aktuellerPreis;
		assertEquals(1000000, output);
	}
	

}
