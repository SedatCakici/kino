package deHsMannheimSS17Tpe;

import java.util.Scanner;

public class RobotFactory{
	
	public Robot createRobot(Enum typ){
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte den Roboter namen eingeben:");
		String name = s.next();
		if(typ.equals(RobotType.R2D2)){
			s.close();
			return new R2D2(name);
		}
		else if(typ.equals(RobotType.C3PO)){
			s.close();
			return new C3PO(name);
		}
		else if(typ.equals(RobotType.Bender)){
			s.close();
			return new Bender(name);
		}
		s.close();
		return null;
		
	}
}
