package formentin.base;

public class Categoria {
	int codice;
	int modello;
	int p;		//punti danno
	
	Categoria(){
		
	}
	Categoria( int codice, int modello){
		this.codice = codice;
		this.modello = modello;
	}
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public int getModello() {
		return modello;
	}
	public void setModello(int modello) {
		this.modello = modello;
	}
	/*public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}*/
	public int potenza(){
		return p;
	}
	
}
