
public class Student {
	//fields
	String name;
	String surname;
	int age;
	int[] marks;
	
	//constructor
	Student(String n, String surname){
		name = n;
		this.surname = surname;
	}
	//default constructor
	//se non defnisco nessun costruttore inizializza tutto a null
	//usando un costruttore di default
	Student(){
		
	}
	//methods
	int average(){
		float sum = 0;
		for(int x: marks){
			sum += x;
		}
		float avg = sum / marks.length;
		return Math.round(avg);
	}
	
}
