package uebung4;

/**
 * @author Sedat Cakici
 *
 */
public class IllegalTimeException extends Exception {
	/**
	 * Exception wird ausgef�hrt
	 * 
	 * @param exception
	 */
	
	public IllegalTimeException(String exeption){
		System.err.println(exeption);
	}

}