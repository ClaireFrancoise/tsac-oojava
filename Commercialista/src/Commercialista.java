
public class Commercialista {
	private Clienti[] clienti;
	
	public Clienti[] getClienti() {
		return clienti;
	}

	public void setClienti(Clienti[] clienti) {
		this.clienti = clienti;
	}

	public int totaleIcasso(){
		int incasso = 0;
		
		for(Clienti c:clienti) {
			incasso += c.getParcella();
		}
		return incasso;
	}
}

