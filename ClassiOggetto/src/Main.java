
public class Main {
	public static void main(String[] args){
		
		Student claire = new Student();
		//operatore dot
		claire.name = "Claire";
		claire.surname = "Formentin";
		int age = 21;
		claire.age = age;
		claire.marks = new int[] {3, 2, 4, 1};
		System.out.println("Claire marks: " + claire.marks[2]);
		
		Student marco = new Student();
		marco.name = "Marco";
		marco.surname = "Benetti";
		marco.age = 19;
		marco.marks = new int[] {2, 4, 3, 6};
		System.out.println("Marco marks: " + marco.marks[2]);
		
		int claireMarks = claire.average();
		System.out.println("Claire average: " + claireMarks);
		
		int marcoMarks = marco.average();
		System.out.println("Marco average: " + marcoMarks);
		
		//constructor
		Student giacomo = new Student("Giacomo", "Rossi");
		System.out.println("Giacomo surname: " + giacomo.surname);
		Student alessandro = new Student("Alessandro", "Modaffari");
		System.out.println("Alessandro surname: " + alessandro.surname);
		
		Statistics stat = new Statistics();
		int avgStudenti = stat.average(new Student[] {claire, marco});
		System.out.println("Average students: " + avgStudenti);
	}
}
