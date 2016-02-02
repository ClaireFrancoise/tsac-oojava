
public class LiberiProfessionisti extends Clienti{
	private long pIva;
	private int nFatture;
	
	LiberiProfessionisti(){
		
	}
	LiberiProfessionisti(String nome, String cognome, String cf, long pIva, int nFatture){
		super(nome, cognome, cf);
		this.pIva = pIva;
		this.nFatture = nFatture;
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
	public int getParcella(){
		return parcella += 50000 + (nFatture * 500);
	}
}
