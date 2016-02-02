
public class Imprenditori extends Clienti{
	private long pIva;
	private int nFatture;
	private String ragioneSociale;
	
	Imprenditori(){
		
	}
	Imprenditori(String nome, String cognome, String cf, long pIva, String ragioneSociale, int nFatture){
		super(nome, cognome, cf);
		this.pIva = pIva;
		this.nFatture = nFatture;
		this.ragioneSociale = ragioneSociale;
	}
	public long getpIva() {
		return pIva;
	}
	public void setpIva(int pIva) {
		this.pIva = pIva;
	}
	public int getnFatture() {
		return nFatture;
	}
	public void setnFatture(int nFatture) {
		this.nFatture = nFatture;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}
	public int getParcella(){
		if (nFatture < 100){
			return parcella = 500000;
		} else{
			return parcella + (nFatture * 100);
		}
	}
}
