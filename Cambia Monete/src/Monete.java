
public class Monete {
	public static void main (String[] args){
		int cCento = 0;
		int dCento = 0;
		int cento = 0;
		int cinq = 0;
		int venti = 0;
		int dieci = 0;
		int cinque = 0;
		int due = 0;
		long cifra = 12345;
		long inserimento = cifra;
		while(cifra != 0){ 
			if(cifra-500 == 0 || cifra-500>0){
				cCento = cCento + 1;
				cifra = cifra - 500;
			}else if(cifra-200 == 0 || cifra-200>0){
				dCento = dCento + 1;
				cifra = cifra - 200;
			}else if(cifra-100 == 0 || cifra-100>0){
				cento = cento + 1;
				cifra = cifra - 100;
			}else if(cifra-50 == 0 || cifra-50>0){
				cinq = cinq + 1;
				cifra = cifra - 50;
			}else if(cifra-20 == 0 || cifra-20>0){
				venti = venti + 1;
				cifra = cifra - 20;
			}else if(cifra-10 == 0 || cifra-10>0){
				dieci = dieci + 1;
				cifra = cifra - 10;
			}else if(cifra-5 == 0 || cifra-5>0){
				cinque = cinque + 1;
				cifra = cifra - 5;
			}else if(cifra-2 == 0 || cifra-2>0){
				due = due + 1;
				cifra = cifra - 2;
			}else{
				break;
			}
		}
		System.out.println("La cifra " + inserimento + " può essere sostituita da: ");
		if(cCento != 0){
			System.out.println(cCento + " banconote da 500");
		}
		if(dCento != 0){
			System.out.println(dCento + " banconote da 200");
		}
		if(cento != 0){
			System.out.println(cento + " banconote da 100");
		}
		if(cinq != 0){
			System.out.println(cinq + " banconote da 50");
		}
		if(venti != 0){
			System.out.println(venti + " banconote da 20");
		}
		if(dieci != 0){
			System.out.println(dieci + " banconote da 10");
		}
		if(cinque != 0){
			System.out.println(cinque + " banconote da 5");
		}
		if(due != 0){
			System.out.println(due + " monete da 2 euro");
		}
		if(cifra != 0){
			System.out.println(cifra + " monete da 1 euro");
		}
	}
}
