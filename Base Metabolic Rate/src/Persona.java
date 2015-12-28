
public class Persona {
	double altezza;
	double peso;
	double eta;
	String attivita;
	String sesso;
	double totale = 0;
	double calcola(double altezza, double peso, double eta, String sesso){
		double MB = 0;
		if (sesso == "F"){
			MB =  655+(9.6*peso)+(1.8*(altezza))*(4.7 * eta);
		}else{
			MB =  655+(13.8*peso)+(1.8*(altezza))*(4.7 * eta);
		}
		return MB;
	}
	double incrementa(double MB, String attivita){
		if (attivita == "sedentario"){
			totale = MB * 0.20;
		}else if(attivita == "moderatamente attivo"){
			totale = MB * 0.30;
		}else if(attivita == "attivo"){
			totale = MB * 0.40;
		}else if(attivita == "molto attivo"){
			totale = MB * 0.50;
		}
		return totale;
	}
}