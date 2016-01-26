package formentin.claire.azienda;

public class Azienda {
	private String ragioneSociale;
	private Dipendente[] dipendenti;
	
	public Azienda(String ragioneSociale, Dipendente[] dipendenti) {
		this.ragioneSociale = ragioneSociale;
		this.dipendenti = dipendenti;
	}
	
	public int sommaStipendi() {
		int sommaStipendi = 0;
		for(Dipendente dipendente:dipendenti) {
			sommaStipendi += dipendente.calcoloStipendio();
		}
		return sommaStipendi;
	}
	
	/*
	public Dipendente[] dipendentiMaxStipdendi() {
		// TODO Funzione che ritorna un vettore con i dipendenti dallo stipendio più alto
	}
	*/
	

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public Dipendente[] getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Dipendente[] dipendenti) {
		this.dipendenti = dipendenti;
	}
}
