
public class Alieno {
	//creare algoritmo per assegnare punti danno
	//tipo alieno 1
	String nome;
	int danno;
	public int danneggiamento(){
		if (nome == "Salasar"){
			danno = 10;
		}else if(nome == "Mars"){
			danno = 30;
		}else if(nome == "Ciclope"){
			danno = 50;
		}else if (nome == "Devil"){
			danno = 80;
		}else {
			danno = 0;
		}
		return danno;
	}
}
