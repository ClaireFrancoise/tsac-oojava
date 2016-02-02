package formentin.base;

public class Dvd extends Cliente{
	int costo;
	int giorni;
	Dvd(){
		
	}
	Dvd(int giorni){
		super(giorni);
	}
	public int calcolaCosti(){
		if (giorni > 2){
			costo = 2;
		}else{
			costo = Math.round(1.5f);
		}
		preventivo = giorni * costo;
		return preventivo;
	}
}
