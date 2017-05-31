package deHsMannheimSS17Tpe;

public class Zeit {
	byte stunde, minute;

	public Zeit(byte stunde, byte minute) throws IllegalTimeException {
		super();
		if(stunde > 24 || minute > 60){
			throw new IllegalTimeException();
		}else{
			this.stunde = stunde;
			this.minute = minute;			
		}
	}

	@Override
	public String toString() {
		return stunde+":"+minute;
	}
	
}
