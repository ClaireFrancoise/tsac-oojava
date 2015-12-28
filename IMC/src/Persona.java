
public class Persona {
	double IMC;
	double massa;
	double altezza;
	//creare un metodo per calcolare il rischio
	//passare il risultato al main e stampare con uno switch il rischio
	double calcola(double massa, double altezza, double IMC){
		IMC = (massa)/(altezza*altezza) ;
		return IMC;
	}
}
