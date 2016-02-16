package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class CarroArmato extends Invasore {
	int stazza;
	int missili;

	public int getStazza() {
		return stazza;
	}

	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getMissili() {
		return missili;
	}

	public void setMissili(int missili) {
		this.missili = missili;
	}
	// la potenza di fuoco è il
	// 30% del prodotto tra numero di missili e stazza.
	// il valore è arrotondato all'intero più vicino.
	@Override
	public int potenzaFuoco() {
		int potenza = 0;
		int totale = 0;
		potenza = (missili * stazza);
		totale = Math.round(potenza * 0.30f);
		return totale;
	}
	
}
