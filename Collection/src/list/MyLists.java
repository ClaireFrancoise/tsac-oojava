package list;
import java.util.ArrayList;
import java.util.List;

class Person{
	String nome;
	String sur;
}
public class MyLists {
	public static void main (String[] args){
		{
		//ArrayList<string> astring = new ArrayList<string>();
		ArrayList aobject = new ArrayList();
		aobject.add("Pippo");
		aobject.add(new Person());
		
		int x = 5;
		Integer ix = x; //boxing sempre valido   Integer ix = new Integer(x);
		aobject.add(x);
		
		int y = ix; //unboxing potrebbe creare problemi
		//perchè un oggetto può essere null
		
		Object o1 = aobject.get(2);
		if(o1 instanceof Person){
			Person p1 = (Person)o1;
			//
		}
		}
		//array list stringa
		{
		ArrayList<String> astring = new ArrayList<String>();
		astring.add("Pippo");
		//astring.add(new Person()); non posso assegnare una persona ad una String
		astring.add("Prova");
		
		String s = astring.get(1);
		System.out.println(s);
		//
		}
		{
		ArrayList <Person> aperson = new ArrayList<>(); //con java8 non è necessario ri specificare il tupo dato contenuto
		aperson.add(new Person());
		//..
		//covariance
		
		List<Person> apersonList = new ArrayList<>();//list estende la class arraylist
		apersonList.add(new Person());
		//contains (o indexof) cerca se la lista contiene l'elemento passato
		List<String> ls = new ArrayList<>();
		ls.add("s1");
		ls.add("s2");
		ls.add("s3");
		ls.add("s4");
		System.out.println("Contiene s3? " + ls.contains("s3"));
		System.out.println("Contiene s5? " + ls.contains("s5"));
		
		String stocheck = "s5";
		//contains(ls, stocheck );
		System.out.println("Contiene s5? " + contains(ls, stocheck ));
		}
	}
	static public boolean contains(List <String> ls, String stocheck){
		for(String s: ls){
			if(s == stocheck){
				return true;
			}
		}
		return false;
	}
}
