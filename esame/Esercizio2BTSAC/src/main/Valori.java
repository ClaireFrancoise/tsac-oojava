package main;

public class Valori {
	private double max;
	private int valoriTot;
	private int misure;
	public void add(double valore) {
		if (valore > max) {
			max = valore;
		}
		misure++;
		valoriTot += valore;
	}
	public int calcolaMedia() {
		return Math.round(valoriTot / misure);
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public int getNumeroMisure() {
		return misure;
	}
	public void setNumeroMisure(int numeroMisure) {
		this.misure = numeroMisure;
	}
}
