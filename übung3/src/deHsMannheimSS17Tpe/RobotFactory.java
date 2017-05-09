package deHsMannheimSS17Tpe;

import java.util.Scanner;

public class RobotFactory{
	
	public Robot createRobot(String typ){
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte den Roboter namen eingeben:");
		String name = s.next();
		if(typ.equals("R2D2")){
			return new R2D2(name);
		}
		else if(typ.equals("C3PO")){
			return new C3PO(name);
		}
		return null;
		
	}
}
