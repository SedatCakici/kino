package deHsMannheimSS17Tpe;

import static org.junit.Assert.*;

import org.junit.Test;

public class C3POTest {

	@Test
	public void Konstruktortest() {
		C3PO be = new C3PO("TP3400");
		String output = be.name;
		assertEquals("TP3400", output);
	}

	@Test
	public void getNameTest() {
		C3PO be = new C3PO("TP3400");
		String output = be.getName();
		assertEquals("TP3400", output);
	}

	@Test
	public void getIdTest() {
		C3PO be = new C3PO("TP3400");
		int output = be.getId();
		if (output > 100000 && output < 200000) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
	}

	@Test
	public void triggerPowerSwitchTest() {
		C3PO be = new C3PO("TP3400");
		boolean output = be.status;
		assertEquals(false, output);

		be.triggerPowerSwitch();
		assertEquals(false, output);

		be.triggerPowerSwitch();
		assertEquals(false, output);
	}

	@Test
	public void isPowerOnTest() {
		C3PO be = new C3PO("TP3400");
		boolean output = be.isPowerOn();
		assertEquals(false, output);
	}

	@Test
	public void getLastExceptionTest() {

	}

	@Test
	public void speakTest() {
		C3PO be = new C3PO("TP3400");
		int array[] = { 2, 98, 65, 2, 4, 0 };

		try {
			be.speak(array);
			assertTrue(true);
		} catch (IllegalStateException | MachineException e) {
			fail();
		}

		int array2[] = { 65, 45, 21, 32, 42, 32 };
		try {
			be.speak(array2);
			assertTrue(true);
		} catch (IllegalStateException | MachineException e) {
			fail();
		}

		int array3[] = {};
		try {
			be.speak(array3);
			assertTrue(true);
		} catch (IllegalStateException | MachineException e) {
			fail();
		}

	}

	@Test
	public void thinkTest() {
		C3PO be = new C3PO("TP3400");
		int array[] = { 2, 98, 65, 2, 4, 0 };

		try {
			be.think(array);
			assertTrue(true);
		} catch (IllegalStateException | MachineException e) {
			fail();
		}

		int array2[] = { 65, 45, 21, 32, 42, 32 };
		try {
			be.think(array2);
			assertTrue(true);
		} catch (IllegalStateException | MachineException e) {
			fail();
		}

		int array3[] = {};
		try {
			be.think(array3);
			assertTrue(true);
		} catch (IllegalStateException | MachineException e) {
			fail();
		}

	}
	
}
