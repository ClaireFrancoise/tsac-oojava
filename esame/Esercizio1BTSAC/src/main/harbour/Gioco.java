package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Gioco {
	private AeroPorto porto;
	public Gioco(AeroPorto p) {
		this.porto = p;
	}
	public boolean portoDistrutto() {
		if(porto.getDimensioneSqMetersNonDistrutta() > 0) {
			return false;
		} else {
			return true;
		}
	}
	public void attacco(Invasore[] invasori) {
		/*
		 * L'attacco somma la potenza di fuoco degli invasori e 
		 * distrugge il porto secondo questa equazione:
		 * metri_quadri_distrutti_del_porto = potenza_di_fuoco_invasori * 2.5
		 */
		int totale = 0;
		for(Invasore i:invasori) {
			totale += i.potenzaFuoco();
		}
		porto.addMetriQuadriDistrutti(totale * 2.5);
		
	}
}
