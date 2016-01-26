
public class Gioco {
	public static void main (String[] args){
		//creare il giocatore con una base di vita a 100
		Giocatore claire = new Giocatore();
		claire.nome = "Claire";
		claire.vita = 100;
		int vita = claire.vita;
		String nome = claire.nome;
		//creare un gruppo di alieni
		int[] mostri = new int[3];
		Alieno a1 = new Alieno();
		a1.nome = "Salasar";
		Alieno a2 = new Alieno();
		a2.nome = "Mars";
		Alieno a3 = new Alieno();
		a3.nome = "Ciclope";
		Alieno a4 = new Alieno();
		a4.nome = "Devil";
		mostri[0] = a1.danneggiamento();
		mostri[1] = a1.danneggiamento();
		mostri[2] = a3.danneggiamento();
		//System.out.println("Alieno A1: " + a4.nome + " ha danno: " + a4.danneggiamento());
		//infliggere i danni
		int result = partita(mostri, vita, nome);
		if(result == 0){
			System.out.println("You win!");
		}else {
			System.out.println("Game over!");
		}
	}
	static int partita(int[] mostri, int vita, String nome){
		int sommaDanno = 0;
		int i = 0;
		while(mostri.length != i){
			sommaDanno += mostri[i];
			i++;	
		}
		System.out.println("Danno alieni " + sommaDanno);
		//controllare livello di vita del giocatore
		int condizioni = 0;
		condizioni = vita - sommaDanno;
		if (condizioni > 0){
			return 0;
		} else{
			return 1;
		}
	}
}