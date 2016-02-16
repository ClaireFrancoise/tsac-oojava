package claireFormentin.mavenProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import com.google.maps.GeocodingApi;
import com.google.maps.GeocodingApiRequest;
import com.google.maps.PendingResult;
import com.google.maps.model.GeocodingResult;
import com.google.maps.GeoApiContext;

public class App{
    public static void main( String[] args ) throws IOException{
    	String apiKey = "";
    	int start = 0 ;
	    int end = 0;
	    String fileInput = "";
	    String fileOutput = "";
    	try {
	    	apiKey = args[0];
	    	start = Integer.parseInt(args[1]);
	    	end = Integer.parseInt(args[2]);
	    	fileInput = args[3];
	    	fileOutput = args[4];
    	}catch(Exception e) {
    		System.out.println("Inserisci i parametri: Api Key, Start, End, File Input,File Output");
    		return;
    	}
    	//Read
    	FileReader fr = null;
    	try{
    		fr = new FileReader(fileInput);		
    	}catch (Exception e){
    		System.out.println("Controlla che il percorso del file o il file stesso esista");
    		chiudiFile(fr);
    	}
    	BufferedReader br = null;
		try{
			br = new BufferedReader(fr);
			
	    }catch (Exception e){
	    	System.out.println("Errore im lettura");
	    	chiudiReadBuffer(fr);
	    }
    	//leggere i file
		try {
			String row = br.readLine();
			br.readLine();
			while((row = br.readLine()) != null){
				String[] item = row.split(row, ';');
			}
		}catch(Exception e){
			System.out.println("Errore lettura riga");
			return;
		}
		
    	
    	GeoApiContext context = new GeoApiContext().setApiKey(apiKey);
    	GeocodingApiRequest req = GeocodingApi.newRequest(context).address("Via Isola di S. Pietro, 19");
		//write
    	req.setCallback(new PendingResult.Callback<GeocodingResult[]>() {
    	public void onResult(GeocodingResult[] result) {
    		// Handle successful request.
    	}

    	public void onFailure(Throwable e) {
    		// Handle error.
    	}
    	});
		FileWriter fw = null;	
		try{
			fw = new FileWriter(fileOutput);		
	    }catch (Exception e){
	    	System.out.println("Controlla che il file o il percorso sia corretto");
	    	chiudiScrittura(fw);
	    }
		PrintWriter pw = null;	
		try{
			pw = new PrintWriter(fw);	
	    }catch (Exception e){
	    	System.out.println("Errore in stampa");
	    	chiudiStampa(fw);
	    }
		
		//while ho dati da scrivere
		
		pw.println("Ciao a tutti....");
        chiudiFile(fr);
        chiudiReadBuffer(fr);
        chiudiScrittura(fw);
        chiudiStampa(fw);
        
    }
    public static void chiudiFile(FileReader fr){
    	try{
			fr.close();
		}catch(Exception e){
			System.out.println("Errore");
			return;
		}
    }
    public static void chiudiReadBuffer(FileReader fr){
    	try{
			fr.close();
		}catch(Exception e){
			System.out.println("Errore");
			return;
		}
    }
    public static void chiudiScrittura(FileWriter fw){
    	try{
			fw.close();
		}catch(Exception e){
			System.out.println("Errore");
			return;
		}
    }
    public static void chiudiStampa(FileWriter fw){
    	try{
			fw.close();
		}catch(Exception e){
			System.out.println("Errore");
			return;
		}
    }
    
}
