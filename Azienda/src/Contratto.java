
public class Contratto {
	static double stipendioBase;
	String tipoContratto;
	static double stipendio (String tipo){
		if (tipo == "Indeterminato"){
			stipendioBase = 1500;
		}else if(tipo == "Determinato"){
			stipendioBase = 800;
		}else{
			stipendioBase = 0;
		}
		return stipendioBase;
	}
}
