package formentin.base;

public class Videoteca {
	public static void main (String[] args){
		//definizioni
		Film laVieEnRose = new Film ("La vie en rose", "Oliver Dahan", 2007);
		Videocassetta film = new Videocassetta(10);
		Dvd film1 = new Dvd(5);
		Bluray film2 = new Bluray(1);
		Cliente [] rossi = new Cliente [] {film1, film2, film};
		//todo
		int incasso = 0;
		
		for(Cliente c:rossi) {
			incasso += c.calcolaCosti();
		}
		
		System.out.println("L'incasso è: " + incasso + "€");
		
	}
}
