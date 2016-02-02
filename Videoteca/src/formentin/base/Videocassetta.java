package formentin.base;

public class Videocassetta extends Cliente {
	int costo;
	Videocassetta(){
			
	}
	Videocassetta(int giorni){
		super(giorni);
	}
	public int calcolaCosti(){
		if (giorni > 1){
			costo = 2;
		}else{
			costo = 1;
		}
		preventivo = giorni * costo;
		return preventivo;
	}
}
