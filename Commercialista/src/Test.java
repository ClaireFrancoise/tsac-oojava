
public class Test {
	public static void main(String args[]){
		Dipendenti angelo = new Dipendenti("Angelo", "Rossi", "000");
		Imprenditori marco = new Imprenditori("Marco", "Verdi", "000", 000, "Ferramenta di Marco", 99);
		LiberiProfessionisti paolo = new LiberiProfessionisti("Paolo", "Bianchi", "000", 000, 15);

		Clienti[] clienti = new Clienti[] {
				angelo,
				marco,
				paolo
		};
		
		int incasso = 0;
		
		for(Clienti c:clienti) {
			incasso += c.getParcella();
		}
		
		System.out.println("L'incasso è: " + incasso + " millesimi di €");
		
	}
}
