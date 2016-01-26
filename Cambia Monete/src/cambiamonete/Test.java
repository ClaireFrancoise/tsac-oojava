package cambiamonete;

/*import java.io.InputStreamReader;
import java.io.BufferedReader ;
import java.io.IOException;*/

public class Test {

	public static void main(String[] args) {
		int valore = 1254890;
		MoneyChangeAlgorithm.change(valore);
		System.out.println("Per cambiare " + valore + " ti servono: ");
		
		//int[] retArr = MoneyChangeAlgorithm.change(val);		
		
		/*for (int i = 0; i < retArr.length; i++){
			String valueType = "";
			
	    	if (retArr[i] > 0){
	    		if(MoneyChangeAlgorithm.change(val) >= 5){
	    			if (retArr[i] > 1)
	    				valueType = " banconote";
	    			else
	    				valueType = " banconota";
	    		}
	    		else{
	    			if (retArr[i] > 1)
	    				valueType = " monete";
	    			else
	    				valueType = " moneta";
	    		}
		    	System.out.println(retArr[i] + valueType + " da " + money[i] + "");
	    	}*/
	    	
	    } 
	    //---------------------------------------------------------------
		
		/*
		 * da aggiungere => inserimento da utente della valuta da cambiare
		 * InputStreamReader reader = new InputStreamReader(System.in);
			BufferedReader inputVal = new BufferedReader(reader);
			String inputString = new String();
		
	    	try {
				inputString = inputVal.readLine();
	    	}
	    	catch (IOException e) {
				e.printStackTrace();
			}
		
	    	int val = Integer.parseInt(inputString);
		 * 
		 */
	}

