
public class GestioneContabile {
	public static void main (String[] args){
		//creo e definisco l'azienda
		Azienda claireSnc = new Azienda();
		claireSnc.ragioneSociale = "Snc";
		//creo e definisco i contratti
		Contratto contratto1 = new Contratto();
		contratto1.tipoContratto = "Indeterminato";
		Contratto contratto2 = new Contratto();
		contratto2.tipoContratto = "Determinato";
		//creo e definisco i dipendenti
		Dipendente claire = new Dipendente();
		claire.nome = "Claire";
		claire.cognome = "Formentin";
		claire.anzianita = 2;
		claire.contratto = contratto1.tipoContratto;
		Dipendente riccardo = new Dipendente();
		riccardo.nome = "Riccardo";
		riccardo.cognome = "Nobile";
		riccardo.anzianita = 0;
		riccardo.contratto = contratto2.tipoContratto;
		Dipendente simone = new Dipendente();
		simone.nome = "Simone";
		simone.cognome = "Cragnolini";
		simone.anzianita = 1;
		simone.contratto = contratto2.tipoContratto;
		Dipendente alessandro = new Dipendente();
		alessandro.nome = "Alessandro";
		alessandro.cognome = "Modaffari";
		alessandro.anzianita = 0;
		alessandro.contratto = contratto1.tipoContratto;
		System.out.println("Il dipentente " + riccardo.nome + " "
				+ riccardo.cognome + " ha " + riccardo.anzianita 
				+ " anni di anziantità con un contratto " 
				+ riccardo.contratto + " e ha uno stipendio di: "
				+ riccardo.calcoloStipendio());
		//inserisco i dipendenti definiti in un array
		claireSnc.dipendenti[0] = claire.cognome;
		claireSnc.dipendenti[1] = riccardo.cognome;
		claireSnc.dipendenti[2] = simone.cognome;
		claireSnc.dipendenti[3] = alessandro.cognome;
		String[] personale = new String[4];
		double[] stipendiPersonale = new double[4];
		stipendiPersonale[0] = claire.calcoloStipendio();
		stipendiPersonale[1] = riccardo.calcoloStipendio();
		stipendiPersonale[2] = simone.calcoloStipendio();
		stipendiPersonale[3] = alessandro.calcoloStipendio();
		System.out.println("L'azienda Claire Snc è composta dai seguenti dipendenti");
		double maggiore = 0;
		for(int i = 0; i < personale.length; i++){
			personale[i] = claireSnc.dipendenti[i];	
		}
		for(int i = 0; i < personale.length; i++){
			maggiore = calcolaStipendioPiuAlto(stipendiPersonale, personale);
			if(stipendiPersonale[i] == maggiore){
			System.out.println("Il dipendente " + personale[i] + " con lo stipendio di: "
				+ maggiore + " è il dipendente con lo stipendio più alto");
			}
		}
		double somma = 0;
		somma = sommaStipendi(stipendiPersonale);
		System.out.println("La somma degli stipendi dell'azienda è: " + somma);
	}
	static double calcolaStipendioPiuAlto (double[] stipendiPersonale, String [] personale){
		boolean flag = false;
		double maggiore = 0;
		for(int i = 0; i < stipendiPersonale.length; i++){
			if(stipendiPersonale[i] >= maggiore){
				maggiore = stipendiPersonale[i];
			} 
		}
		flag = true;
		if (flag == true)
			return maggiore;
		else
			return 0;
	}
	static double sommaStipendi (double[] stipendiPersonale){
		double somma = 0;
		for (int i = 0; i < stipendiPersonale.length; i++){
			somma = somma + stipendiPersonale[i];
		}
		return somma;
	}
}
