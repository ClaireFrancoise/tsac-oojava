package main;

public class Callback implements PressureSensorListener {
	Valori valori;
	Errori errori;
	public void onSuccess(double pressione) {
		valori.add(pressione);
	}
	
	public void onFailed(PressureSensorException exception) {
		errori.add(exception.getErrorcode());
	}

	public Callback(Valori valori, Errori errori) {
		this.valori = valori;
		this.errori = errori;
	}

	public Valori getValori() {
		return valori;
	}

	public void setValori(Valori valori) {
		this.valori = valori;
	}

	public Errori getErrori() {
		return errori;
	}

	public void setErrori(Errori errori) {
		this.errori = errori;
	}

}
