package DeHsMannheimSS17TPEGrp01Übung2;

/**
 * 
 * @author sedat
 *
 */
public class Simulation {

	public static void main(String[] args) {
		// Zwei Portfolio-Objekte erstellen
		Portfolio p1 = new Portfolio();
		Portfolio p2 = new Portfolio();
		// Objekte erstellen
		Aktie aktie1 = new Aktie("BASF", 6102, "18.04.17", 1000);
		Aktie aktie2 = new Aktie("MAN", 8925, "18.04.17", 240);
		Aktiefonds aktiefonds1 = new Aktiefonds("DAX", 58149, "18.04.17", 300);
		Immobilien immobilie1 = new Immobilien("Villa", 10000000, "18.04.17");
		Festgeld festgeld1 = new Festgeld("S.kasse", 1000000, "18.04.17");
		Option option1 = new CallOption("C. BASF", 500, "18.04", 10000, 6000);
		Option option2 = new CallOption("C. MAN", 100, "18.04", 5000, 8800);
		Option option3 = new PutOption("P. MAN", 200, "18.04", 5000, 8500);
		Option option4 = new PutOption("P. Daim", 300, "18.04", 5000, 4700);

		Aktie aktie4 = new Aktie("BASF", 6102, "18.04.17", 1000);
		Aktie aktie5 = new Aktie("MAN", 8925, "18.04.17", 240);
		Aktie aktie6 = new Aktie("Siemens", 9710, "18.04.17", 400);
		Aktie aktie7 = new Aktie("VW", 11032, "18.04.17", 600);
		Aktiefonds aktiefonds2 = new Aktiefonds("DAX", 58149, "18.04.17", 500);
		Aktiefonds aktiefonds3 = new Aktiefonds("A.mobil", 95000, "18.04.17", 200);
		Rentenpapier rentenpapier1 = new Rentenpapier("Bundes", 5000000, "18.04.17", 1);
		Festgeld festgeld2 = new Festgeld("S.kasse", 8000000, "18.04.17");
		// ---------------------------------------------------------------------------------------------------------------------------
		System.out.println("akutelles Jahr");
		System.out.println("Erste Portfolio:");
		p1.addVmg(aktie1);
		p1.addVmg(aktie2);
		p1.addVmg(aktiefonds1);
		p1.addVmg(immobilie1);
		p1.addVmg(festgeld1);
		p1.addVmg(option1);
		p1.addVmg(option2);
		p1.addVmg(option3);
		p1.addVmg(option4);
		p1.listVGM1();
		System.out.println("die Gesamtsumme beträgt: " + p1.berecheWert() + " cent");
		System.out.println();

		System.out.println("Zweite Portfolio:");
		p2.addVmg(aktie4);
		p2.addVmg(aktie5);
		p2.addVmg(aktie6);
		p2.addVmg(aktie7);
		p2.addVmg(aktiefonds2);
		p2.addVmg(aktiefonds3);
		p2.addVmg(rentenpapier1);
		p2.addVmg(festgeld2);
		p2.listVGM1();
		System.out.println("die Gesamtsumme beträgt: " + p2.berecheWert() + " cent");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// ---------------------------------------------------------------------------------------------------------------------------
		System.out.println("\n\n1.te Jahr");
		p1.vmgs.clear();
		p2.vmgs.clear();
		aktie1.setKurs(6127);
		aktie2.setKurs(8824);
		aktie6.setKurs(9678);
		aktie7.setKurs(11550);
		System.out.println("Erste Portfolio:");
		p1.addVmg(aktie1);
		p1.addVmg(aktie2);
		p1.addVmg(aktiefonds1);
		p1.addVmg(immobilie1);
		p1.addVmg(festgeld1);
		p1.addVmg(option1);
		p1.addVmg(option2);
		p1.addVmg(option3);
		p1.addVmg(option4);
		p1.listVGM1();
		System.out.println("die Gesamtsumme beträgt: " + p1.berecheWert() + " cent");
		System.out.println("Zwischensumme " + p1.gewinnVerlustAmEnde());

		System.out.println("\nZweite Portfolio:");
		p2.addVmg(aktie4);
		p2.addVmg(aktie5);
		p2.addVmg(aktie6);
		p2.addVmg(aktie7);
		p2.addVmg(aktiefonds2);
		p2.addVmg(aktiefonds3);
		p2.addVmg(rentenpapier1);
		p2.addVmg(festgeld2);
		p2.listVGM1();
		System.out.println("die Gesamtsumme beträgt: " + p2.berecheWert() + " cent");
		System.out.println("Zwischensumme " + p2.gewinnVerlustAmEnde());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// ---------------------------------------------------------------------------------------------------------------------------
		System.out.println("\n\n2.te Jahr");
		p1.vmgs.clear();
		p2.vmgs.clear();
		aktie1.setKurs(8439);
		aktie2.setKurs(8267);
		aktie6.setKurs(9513);
		aktie7.setKurs(12050);
		System.out.println("Erste Portfolio:");
		p1.addVmg(aktie1);
		p1.addVmg(aktie2);
		p1.addVmg(aktiefonds1);
		p1.addVmg(immobilie1);
		p1.addVmg(festgeld1);
		p1.addVmg(option1);
		p1.addVmg(option2);
		p1.addVmg(option3);
		p1.addVmg(option4);
		p1.listVGM1();
		System.out.println("die Gesamtsumme beträgt: " + p1.berecheWert() + " cent");
		System.out.println("Zwischensumme " + p1.gewinnVerlustAmEnde());

		System.out.println("\nZweite Portfolio:");
		p2.addVmg(aktie4);
		p2.addVmg(aktie5);
		p2.addVmg(aktie6);
		p2.addVmg(aktie7);
		p2.addVmg(aktiefonds2);
		p2.addVmg(aktiefonds3);
		p2.addVmg(rentenpapier1);
		p2.addVmg(festgeld2);
		p2.listVGM1();
		System.out.println("die Gesamtsumme beträgt: " + p2.berecheWert() + " cent");
		System.out.println("Zwischensumme " + p2.gewinnVerlustAmEnde());
	}

}
