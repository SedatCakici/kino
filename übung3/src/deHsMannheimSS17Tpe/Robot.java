package deHsMannheimSS17Tpe;

abstract class Robot implements SimpleControl, SimpleInstructions {
	final String name;
	int id;
	boolean status = false;
	int i = 0;

	public Robot(String name) {
		this.name = name;
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
}
