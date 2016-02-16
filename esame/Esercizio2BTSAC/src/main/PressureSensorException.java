package main;

/**
* NON MODIFICARE
*/
public class PressureSensorException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private int errorcode;
	
	public PressureSensorException(String message, int errorcode) {
		super(message);
		this.errorcode = errorcode;
	}

	public int getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}


}
