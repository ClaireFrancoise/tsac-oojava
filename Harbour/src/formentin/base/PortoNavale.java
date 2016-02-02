package formentin.base;

public class PortoNavale {
	String nome;
	int nImbarcazioni;
	int dimensione;		//m^2
	PortoNavale(){
		
	}
	PortoNavale(String nome, int nImbarcazioni, int dimensione){
		this.nome = nome;
		this.nImbarcazioni = nImbarcazioni;
		this.dimensione = dimensione;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnImbarcazioni() {
		return nImbarcazioni;
	}
	public void setnImbarcazioni(int nImbarcazioni) {
		this.nImbarcazioni = nImbarcazioni;
	}
	public int getDimensione() {
		return dimensione;
	}
	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}
	
}
