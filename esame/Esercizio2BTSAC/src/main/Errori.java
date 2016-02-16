package main;

import java.util.HashMap;
import java.util.Map;

public class Errori {

	private Map<Integer, Integer> errori = new HashMap<>();
	
	public void add(int errcode) {
		if(errori.containsKey(errcode)) {
			int numeroErrori = errori.get(errcode);
			numeroErrori++;
			errori.put(errcode, numeroErrori);
		} else {
			errori.put(errcode, 1);
		}
	}
	
	public void stampa() {
		errori.forEach((Integer key, Integer el) -> {
			System.out.println("errorCode " + key + " " + el + " volte");
		});
	}

	public Map<Integer, Integer> getErrori() {
		return errori;
	}
	public void setErrori(Map<Integer, Integer> errori) {
		this.errori = errori;
	}
	
}
