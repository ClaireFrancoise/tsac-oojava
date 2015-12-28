
public class Salute {
	public static void main (String[] args){
		//inserire i parametri altezza e peso
		Persona claire = new Persona();
		claire.IMC = 0;
		claire.massa = 64;
		claire.altezza = 1.65;
		//System.out.println("Altezza: " + claire.altezza + " peso: " + claire.massa + " Imc: " + claire.IMC);
		System.out.println("Il risultato è: ");
		double result = claire.calcola(claire.massa, claire.altezza, claire.IMC);
		System.out.println("Il tuo IMC è: " + result);
		if (result < 18.5){
			System.out.println("Sottopeso");
		}else if(result < 25){
			System.out.println("Normale");
		}else if(result < 30){
			System.out.println("Sovrappeso");
		}else{
			System.out.println("Obeso");
		}
	}
}
