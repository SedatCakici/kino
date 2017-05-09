package deHsMannheimSS17Tpe;

public class RobotMacigValueException extends Exception {
	public RobotMacigValueException(String robotName) {
		super();
		getRobotName(robotName);
	}

	public RobotMacigValueException(String robotName,String msg) {
		super(msg);
		getRobotName(robotName);
	}
	
	public String getRobotName(String robotName){
		return robotName;
	}

}
