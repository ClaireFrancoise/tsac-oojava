package formentin.claire.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args){
		Map <Integer, String> mappa = new HashMap<>();
		mappa.put(20, "pippo");
		mappa.put(21, "pippa");
		mappa.put(22, "Riccardo");
		System.out.println(mappa.get(20) + " " + mappa.get(21) + " " + mappa.get(22));
		Map <Persona, String> mappaPersona = new HashMap<>();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		p1.setNome("Claire");
		p1.setCognome("Formentin");
		p1.setEta(21);
		p2.setNome("Claire");
		p2.setCognome("Formentin");
		p2.setEta(21);
		p3.setNome("Riccardo");
		p3.setCognome("Nobile");
		p3.setEta(19);
		
		mappaPersona.put(p1, "claire");
		mappaPersona.put(p2, "claire2");
		mappaPersona.put(p3, "claire3");
		System.out.println(mappaPersona.get(p1) + " " + mappaPersona.get(p2) + " " + mappaPersona.get(p3));
	}
}
