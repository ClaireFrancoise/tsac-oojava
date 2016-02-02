package formentin.base;

public class Cliente {
	int giorni;
	int preventivo;
	String supporto;
	Cliente(){
		
	}
	Cliente(int giorni){
		this.giorni = giorni;
	}
	public int getGiorni() {
		return giorni;
	}

	public void setGiorni(int giorni) {
		this.giorni = giorni;
	}

	public int calcolaCosti(){
		return preventivo;
	}
	
}
