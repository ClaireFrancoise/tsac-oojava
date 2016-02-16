package formentin.claire.casestudy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		String apiKey = new String();
		int startRow = 0;
		int endRow = 0;
		String inputFile = new String();
		String outputFile = new String();
		
		try {
			apiKey = args[0];
			startRow = Integer.parseInt(args[1]);
			endRow = Integer.parseInt(args[2]);
			inputFile = args[3];
			outputFile = args[4];
		} catch (Exception e) {
			System.out.println("Argomenti non inseriti. Uso: apiKey startRow endRow inputFile outputFile");
			return;
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader(inputFile);
		} catch (FileNotFoundException e) {
			System.out.println("File non trovato.");
			return;
		}
		
		BufferedReader br = new BufferedReader(fr);
		
		Map<Indirizzo, List<Integer>> attivita = new HashMap<>();
		
		try {
			String row = new String();
			row = br.readLine();
			while((row = br.readLine()) != null) {
				String[] items = row.split(",");
				
				try {
				
					int id = Integer.parseInt(items[0]);
					
					try {
						Indirizzo indirizzo = new Indirizzo();
						indirizzo.setTipoVia(items[3]);
						indirizzo.setDescrizioneVia(items[4]);
						indirizzo.setCivico(Integer.parseInt(items[5]));
						
						List<Integer> ids = new ArrayList<>();
						
						if(attivita.containsKey(indirizzo)) {
							ids = attivita.get(indirizzo);
						}
						
						ids.add(id);
						attivita.put(indirizzo, ids);
					} catch (Exception e) {
						System.out.println("Trovati dati non corretti per ID: " + id);
					}
				} catch (Exception e) {
					System.out.println("Trovato riga non conforme");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		Indirizzo debug = new Indirizzo();
		debug.setTipoVia("VIA ");
		debug.setDescrizioneVia("BARI");
		debug.setCivico(11);
		
		System.out.println(attivita.containsKey(debug));
		*/
		
		try {
		
			FileWriter fw = new FileWriter(outputFile);
			PrintWriter pw = new PrintWriter(fw);
			
			attivita.forEach((Indirizzo key, List<Integer> el) -> {
				pw.print(key.getTipoVia());
				pw.print(",");
				pw.print(key.getDescrizioneVia());
				pw.print(",");
				pw.print(key.getCivico());
				el.forEach((Integer civ) -> {
					pw.print(",");
					pw.print(civ);
				});
				pw.println();
			});
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
