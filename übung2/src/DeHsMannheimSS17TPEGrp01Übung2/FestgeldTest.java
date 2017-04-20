package DeHsMannheimSS17TPEGrp01Übung2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author sedat
 *
 */
public class FestgeldTest {

	@Test
	public void nameTest(){
		Festgeld fg = new Festgeld("Euro", 1000, "12.10");
		String output = fg.name;
		assertEquals("Euro",output);
	}
	
	@Test
	public void kaufpreisTest(){
		Festgeld fg = new Festgeld("Euro", 1000, "12.10");
		long output = fg.kaufpreis;
		assertEquals(1000,output);
		
		fg = new Festgeld("Euro", 0, "12.10");
		output = fg.kaufpreis;
		assertEquals(0,output);

		fg = new Festgeld("Euro", -1000, "12.10");
		output = fg.kaufpreis;
		assertEquals(-1000,output);
		
	}
	
	@Test
	public void kaufdatumTest(){
		Festgeld fg = new Festgeld("Euro", 1000, "12.10");
		String output = fg.name;
		assertEquals("Euro",output);
	}
	
	@Test
	public void zinsTest() {
		Festgeld fg = new Festgeld("Euro", 100, "12.10");
		long output = fg.zins();
		assertEquals(106, output);
		
		fg = new Festgeld("Euro", 0, "12.10");
		output = fg.zins();
		assertEquals(0,output);
		
		fg = new Festgeld("Euro", -100, "12.10");
		output = fg.zins();
		assertEquals(-106,output);
	}

}
