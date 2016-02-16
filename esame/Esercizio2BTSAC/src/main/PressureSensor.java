package main;

import java.util.Random;

/**
* NON MODIFICARE
*/
public class PressureSensor {
	
	private Random rand = new Random(240);
	private Random randErrorCode = new Random(8);
	
	private PressureSensorListener listener;
	
	/**
	 * Imposta callback
	 * @param listener callback richiamata dal metodo next()
	 */
	public void setListener(PressureSensorListener listener) {
		this.listener = listener; 
	}
	
	/**
	 * Ad ogni chiamata viene invocata la callback impostata
	 * su setListener.
	 * In caso di lettura corretta viene fornito il valore
	 * nella callback onSuccess.
	 * In caso di errore viene fornita sulla callback onFailed
	 * l'exception, con relativo codice di errore.
	 */
	public void next() {
		if (listener == null)
			return;
		double val = rand.nextDouble() * 20.0 - 1.0;  
		if (val > 0) {
			listener.onSuccess(val);
		} else {
			listener.onFailed(new PressureSensorException("Pressure Error", randErrorCode.nextInt(10)*-1));
		}
			
	}

}
