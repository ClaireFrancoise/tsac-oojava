
public abstract class Clienti {
	private String nome;
	private String cognome;
	private String cf;
	protected int parcella;
	Clienti(){
		
	}
	Clienti(String nome, String cognome, String cf){
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	/*public int getParcella(){
		return 0;
	}*/
	public abstract int getParcella();
}
