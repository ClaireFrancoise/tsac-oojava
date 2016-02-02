package formentin.base;

public class Film {
	String titolo;
	String nomeRegista;
	int anno;
	AttoriPrincipali [] attoriPrincipali;

	Film(){	
		
	}
	Film(String titolo, String nomeRegista, int anno){
		this.titolo = titolo;
		this.nomeRegista = nomeRegista;
		this.anno = anno;
		this.attoriPrincipali = attore();
	}
	public AttoriPrincipali[] attore(){
		AttoriPrincipali[] attori = new AttoriPrincipali[]{
				new AttoriPrincipali("Marion" , "Catillard"),
				new AttoriPrincipali("Sylvie", "Testud")};
		
		return attori;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getNomeRegista() {
		return nomeRegista;
	}
	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
}
