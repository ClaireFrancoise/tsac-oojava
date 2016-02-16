package main;

/**
* NON MODIFICARE
*/
public interface PressureSensorListener {

	/**
	 * Metodo chiamato in caso di lettura corretta.
	 * @param temperature
	 */
	void onSuccess(double pressure);
	
	/**
	 * Metodo chiamato in caso di errore nella lettura.
	 * @param exception
	 */
	void onFailed(PressureSensorException exception);
	
}
