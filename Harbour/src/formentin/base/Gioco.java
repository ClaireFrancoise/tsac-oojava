package formentin.base;

public class Gioco {
	public static void main(String[] args){
		PortoNavale harbour = new PortoNavale("Harbour", 2, 100);
		Sottomarino fuciliere = new Sottomarino(0001, 34, 3, 100);
		Aereo caccia = new Aereo (0002, 23, 4, 2, 3);
		
		Categoria[] invasore = new Categoria[]{
				fuciliere,
				caccia
		};
		int incasso;
		incasso = 0;
		for(Categoria c:invasore) {
			incasso += c.potenza();
		}
		int danneggiamento = 0;
		System.out.println("La dimensione del porto dopo l'attacco è di " + danno(harbour, incasso, danneggiamento));
		int result = 0;
		result = distrutto(danneggiamento, result);
		if (result == 0){
			System.out.println("Il porto è: distrutto");
		}else if (result == 1){
			System.out.println("Il porto è: salvo");
		}
		System.out.println("caratteristiche aereo" + caccia.p);
	}
	public static int danno(PortoNavale harbour, int incasso, int danneggiamento){
		danneggiamento = harbour.dimensione - incasso;
		return danneggiamento;
	}
	public static  int distrutto(int danneggiamento, int result){
		if(danneggiamento <= 0){
			result = 0;
		}else if(danneggiamento > 0){
			result = 1;
		}
		return result;
	}
	public int nColpi(){
		int colpi = 0;
		return colpi;
	}
	
}
