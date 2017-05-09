package deHsMannheimSS17Tpe;

import java.util.ArrayList;

public class R2D2 extends Robot {

	public R2D2(String name) {
		super(name);
		this.id = (int) ((Math.random() * 100000) - 1);
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void triggerPowerSwitch() {
		i++;
		if (i % 2 == 0) {
			status = false;
			return;
		}
		status = true;
	}

	@Override
	public boolean isPowerOn() {
		return status;
	}

	@Override
	public Exception getLastException() {
//		ArrayList<Exception> a = new ArrayList<Exception>();
//		a.add(e);	
		return null;
	}

	@Override
	public String speak(int[] zahlen 	) throws IllegalStateException, MachineException, RobotMacigValueException {
		String s = "";
		for (int i = 0; i < zahlen.length; i++) {
			if(zahlen[i]== 42){
				throw new RobotMacigValueException(name);
			}
				s = s + zahlen[i] + ", ";
		}
		return s;
	}

	@Override
	public int[] think(int[] zahlen) throws IllegalStateException, MachineException {
		int temp;
		for (int i = 1; i < zahlen.length; i++) {
			for (int j = 0; j < zahlen.length - i; j++) {
				if (zahlen[j] > zahlen[j + 1]) {
					temp = zahlen[j];
					zahlen[j] = zahlen[j + 1];
					zahlen[j + 1] = temp;
				}
			}
		}
		return zahlen;
	}

}
