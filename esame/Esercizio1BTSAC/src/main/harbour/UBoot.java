package main.harbour;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class UBoot extends Invasore{
	private int armaK;
	private int armaH;
	
	
	@Override
	public int potenzaFuoco() {
		int totale = 0;
		totale = (20 * armaK) + (30 * armaH);
		return totale ;	
	}
	int getArmaK() {
		return armaK;
	}
	public void setArmaK(int armaK) {
		this.armaK = armaK;
	}
	public int getArmaH() {
		return armaH;
	}
	public void setArmaH(int armaH) {
		this.armaH = armaH;
	}
	
}