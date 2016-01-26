
public class Dipendente {
	String nome;
	String cognome;
	int anzianita;
	String contratto;
	double incremento = 0;
	public double calcoloStipendio(){
		if (anzianita > 0){
			incremento = getStipendio() + (0.05 * anzianita);
		} else {
			incremento = getStipendio();
		}
		return incremento;	
	}
	double getStipendio(){
		return Contratto.stipendio(contratto);
	}
}
