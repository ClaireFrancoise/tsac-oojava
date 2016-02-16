package main;

public class Main {

	public static void main(String[] args) {
		
		Valori v1 = new Valori();
		Errori e1 = new Errori();
		
		Callback gestione = new Callback(v1, e1);
		
		PressureSensor s1 = new PressureSensor();
		s1.setListener(gestione);
		 
		for(int i = 0; i < 1000; i++) {
			s1.next();
		}
		
		System.out.println("Misura massima: " + v1.getMax());
		System.out.println("Media delle misure: " + v1.calcolaMedia());
		e1.stampa();

	}

}
