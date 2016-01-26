package cambiamonete;

public abstract class MoneyChangeAlgorithm {
			
	public static MoneyChange[] change(int value){
		Money[] money = new Money[]{new Money(500, "banconote", "banconota"),
				new Money(200, "banconote", "banconota"),
				new Money(100, "banconote", "banconota"),
				new Money(50, "banconote", "banconota"),
				new Money(20, "banconote", "banconota"),
				new Money(10, "banconote", "banconota"),
				new Money(5, "banconote", "banconota"),
				new Money(2, "monete", "moneta"),
				new Money(1, "monete", "moneta")};
		//money non è un array di int ma di money <- new class.
		MoneyChange[] ripetition = new MoneyChange[money.length];
		//array che contiene la quantità di banconote da utilizzare
		for (int i = 0; i < money.length; i++) {
			int rep = 0; //= value / money[i]; 
			if (rep > 0) {
				//value -= money[i] * rep;
				ripetition[i] = new MoneyChange(rep, "banconota", "banconote");
			}
		}
		return ripetition;
	}
}