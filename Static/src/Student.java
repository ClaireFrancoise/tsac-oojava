
public class Student {
	//fields
	String name;
	String surname;
	int age;
	int[] marks;
	static int istanza = 0;
	//constructor
	Student(/*student this.*/String n, String surname){
		name = n;
		this.surname = surname;
		studente();
	}
	
	//default constructor
	//se non defnisco nessun costruttore inizializza tutto a null
	//usando un costruttore di default
	Student(){
		this(null, null); //constructor call
	}
	static int studente(){
		istanza += 1;
		return istanza;
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
