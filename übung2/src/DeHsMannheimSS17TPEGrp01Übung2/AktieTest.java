package DeHsMannheimSS17TPEGrp01Übung2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author sedat
 *
 */
public class AktieTest {

	@Test
	public void nameTest() {
		Aktie ak = new Aktie("SAP", 1000000000, "12.11", 1);
		String output = ak.name;
		assertEquals("SAP", output);
	}

	@Test
	public void kaufpreisTest() {
		Aktie ak = new Aktie("SAP", 1000000000, "12.11", 1);
		long output = ak.kaufpreis;
		assertEquals(1000000000, output);

		ak = new Aktie("SAP", 0, "12.11", 1);
		output = ak.kaufpreis;
		assertEquals(0, output);

		ak = new Aktie("SAP", -1, "12.11", 1);
		output = ak.kaufpreis;
		assertEquals(-1, output);
	}

	@Test
	public void kaufdatumTest() {
		Aktie ak = new Aktie("SAP", 1000000000, "12.11", 1);
		String output = ak.kaufdatum;
		assertEquals("12.11", output);
	}

	@Test
	public void setKursTest() {
		Aktie ak = new Aktie("SAP", 1000000, "10.12", 1);
		ak.setKurs(2);
		double output = ak.aktuellerPreis;
		assertEquals(2, output, 0);

		ak.setKurs(-2);
		output = ak.aktuellerPreis;
		assertEquals(-2, output, 0);
	}

}
