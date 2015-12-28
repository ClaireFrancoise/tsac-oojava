
public class StatisticStatic {
	static int minAverage;
	//static method
	//metodi della class (class method)
	static int averageS(Student[] students){
		float tot = 0;
		for(Student s: students){
			tot += s.average(); //association
		}
		int avg = Math.round(tot / students.length);
		avg = Math.max(minAverage, avg); // non conta il this perchè non c'è il paramentro
		return avg;
	}	
}
