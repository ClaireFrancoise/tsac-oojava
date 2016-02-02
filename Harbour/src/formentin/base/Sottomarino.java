package formentin.base;

public class Sottomarino extends Categoria {
	int armamenti;
	int peso;
	Sottomarino (){
		
	}
	Sottomarino(int codice, int modello, int armamenti, int peso){
		super(codice, modello);
		this.armamenti = armamenti;
		this.peso = peso;
	}
	public int getArmamenti() {
		return armamenti;
	}
	public void setArmamenti(int armamenti) {
		this.armamenti = armamenti;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int potenza(){
		p = armamenti * peso;
		return p;
	}
}
