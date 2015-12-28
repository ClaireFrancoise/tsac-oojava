
public class Salute {
	public static void main (String[] args){
		Persona claire = new Persona();
		claire.altezza = 168;
		claire.peso = 62;
		claire.eta = 19;
		claire.attivita = "molto attivo";
		claire.sesso = "M";
		double MB = claire.calcola(claire.altezza, claire.peso, claire.eta, claire.sesso);
		System.out.println("La tua BMR è: " + claire.incrementa(MB, claire.attivita));
	}
}
