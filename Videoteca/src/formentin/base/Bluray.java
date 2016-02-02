package formentin.base;

public class Bluray extends Cliente {
	int costo;
	int penale = Math.round(0.10f);
	int giorni;
	Bluray(){
		
	}
	Bluray(int giorni){
		super(giorni);
	}
	public int calcolaCosti(){
		if (giorni == 1){
			costo = 1;
		}else{
			costo = 1 + (costo * giorni * penale);
		}
		preventivo = giorni * costo;
		return preventivo;
	}
}
