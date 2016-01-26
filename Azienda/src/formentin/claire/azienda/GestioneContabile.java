package formentin.claire.azienda;

public class GestioneContabile {
public static void main(String[] args) {
		
		Contratto stagista = new Contratto(500 * 1000, "Stagista");
		Contratto manovale = new Contratto(1000 * 1000, "Manovale");
		Contratto impiegato = new Contratto(1200 * 1000, "Impiegato");
		Contratto dirigente = new Contratto(4000 * 1000, "Dirigente");
		
		Dipendente marco = new Dipendente("Marco", "Rossi", 20, stagista);
		Dipendente mario = new Dipendente("Mario", "Verdi", 22, manovale);
		Dipendente tizio = new Dipendente("Tizio", "Bianchi", 26, impiegato);
		Dipendente caio = new Dipendente("Caio", "Neri", 30, dirigente);
		
		Dipendente[] dipendenti = new Dipendente[] {
				marco,
				mario,
				tizio,
				caio
		};
		
		Azienda azienda = new Azienda("Letti e Materassi", dipendenti);
		
		
		System.out.println("La somma degli stipendi è: " + azienda.sommaStipendi() + " millesimi di €");
		// TODO Print degli stipendi massimi
		
	}

}
