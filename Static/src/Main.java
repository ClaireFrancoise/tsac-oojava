
public class Main {
	public static void main(String[] args){
		
		Student claire = new Student();
		//operatore dot
		claire.name = "Claire";
		claire.surname = "Formentin";
		int age = 21;
		claire.age = age;
		claire.marks = new int[] {3, 6, 4, 6};
		System.out.println("Claire marks: " + claire.marks[2]);
		
		Student marco = new Student();
		marco.name = "Marco";
		marco.surname = "Benetti";
		marco.age = 19;
		marco.marks = new int[] {6, 4, 3, 6};
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
		Student[] students = new Student[] {claire, marco};
		int avgStudenti = stat.average(new Student[] {claire, marco});
		System.out.println("Average students: " + avgStudenti);
		
		//Statistics stat = new Statistics();
		int avgStudents2 = StatisticStatic.averageS(students);
		System.out.println("Average students: " + avgStudents2);
		
		
		//6 politico
		Statistics statPoli = new Statistics();
		statPoli.minAverage = 6;
		System.out.println("Average (POLI) students: " + statPoli.average(students));
	
		StatisticStatic.minAverage = 6;
		System.out.println("Average (POLI) students: " + statPoli.average(students));
		
		Statistics stat1 = new Statistics();
		stat1.minAverage = 6;
		Statistics stat2 = new Statistics();
		stat2.minAverage = 5;
		
		StatisticStatic.minAverage = 6;
		StatisticStatic.minAverage = 5;
		
		System.out.println("stat1 (POLI) students: " + stat1.average(students));
		System.out.println("stat2 (POLI) students: " + stat2.average(students));
		System.out.println("Static average (POLI) students: " + StatisticStatic.averageS(students));
		System.out.println("Istanze " + claire.istanza);
	}
	
}
