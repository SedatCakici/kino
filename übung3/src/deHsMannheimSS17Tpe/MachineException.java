package deHsMannheimSS17Tpe;

public class MachineException extends Exception {
	public MachineException() {
		super();
	}

	public MachineException(String msg) {
		super(msg);
	}
	
	public String getRobotName(){
		StackTraceElement stack[] = super.getStackTrace();
		return stack[0].getClassName();
	}
}
