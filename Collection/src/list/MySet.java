package list;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main (String[] args){
		Set<String> sets = new HashSet<>();
		sets.add("pippo");
		sets.add("pluto");
		System.out.println(sets.contains("pippo"));
		
	}
}
