package uebung4;

/**
 * @author Sedat Cakici
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testToStringFilm() throws IllegalTimeException {
		Saal gruenerSaal = new Saal("Gruener Saal", 200);
		Film spongebob = new Film("Spongebob - Ich bin bereit, jeder Zeit!", "121", Alterbeschrankung.Ab18Jahren, new Zeit(15, 00),gruenerSaal);
		assertEquals("15:00--Spongebob - Ich bin bereit, jeder Zeit!" +" "+ Alterbeschrankung.Ab18Jahren +" "+ "121min", spongebob.toString());
		
		Saal blauerSaal = new Saal("Blauer Saal", 250);
		Film thadeus = new Film("Thadeus - Ich bin Thadeus, Thadeus, deus deus :D", "91", Alterbeschrankung.Ab16Jahren, new Zeit("14:00"), blauerSaal);
		assertEquals("14:00--Thadeus - Ich bin Thadeus, Thadeus, deus deus :D" +" "+ Alterbeschrankung.Ab16Jahren +" "+ "91min", thadeus.toString());
		
	}
	
	@Test
	public void testToStringSaal() {
		Saal kellerloch = new Saal("Kellerloch", 30);
		assertEquals("SaalKellerloch(30Plaetze", kellerloch.toString());
	}
	
	@Test
	public void testOhneUhrzeit() throws IllegalTimeException {
		Saal studio = new Saal("Studio", 150);
		Film patrick = new Film("Patrick Star - Ein Seestern wächst über sich hinaus","90", Alterbeschrankung.Ab0Jahren, new Zeit("17:00"), studio);
		assertEquals("Patrick Star - Ein Seestern wächst über sich hinaus" +" "+ Alterbeschrankung.Ab0Jahren +" "+ "90min", patrick.ohneUhrzeit());
	}

}