package deHsMannheimSS17Tpe;

public class Main {

	public static void main(String[] args) throws IllegalStateException, MachineException {
		RobotFactory rf = new RobotFactory();
		Robot r = rf.createRobot("R2D2");
		System.out.println(r.isPowerOn());
		r.triggerPowerSwitch();
		System.out.println(r.isPowerOn());
		System.out.println(r.getId());
		System.out.println(r.getName());
		
		int a[] = {2,46,89,42,11};
		System.out.println(r.speak(a));
	}

}
