package formentin.base;

public class Aereo extends Categoria {
	int armamenti;
	int unitaAlfa;
	int unitaBeta;
	int puntiAlfa;
	int puntiBeta;
	Aereo(){
		
	}
	Aereo(int codice, int modello, int armamenti, int unitaAlfa, int unitaBeta){
		super(codice, modello);
		this.armamenti = armamenti;
		this.unitaAlfa = unitaAlfa;
		this.unitaBeta = unitaBeta;
	}
	public int getArmamenti() {
		return armamenti;
	}

	public void setArmamenti(int armamenti) {
		this.armamenti = armamenti;
	}

	public int getUnita() {
		return unitaAlfa;
	}

	public void setUnita(int unitaAlfa) {
		this.unitaAlfa = unitaAlfa;
	}

	
	public int potenza(){
		if (unitaAlfa != 0){
			 puntiAlfa += unitaAlfa * 10;
		}
		if (unitaBeta != 0){
			puntiBeta += unitaBeta * 20;
		}
		p = puntiAlfa + puntiBeta;
		return p;
	}
}
