package casestudy;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		
		//read
		
		FileReader fr = new FileReader("nomefile.csv");
		BufferedReader br = new BufferedReader(fr);
		String row = br.readLine();
		//readline untill null legge una riga
		String[] item = row.split(row, ';');
		
		
		//write
		
		FileWriter fw = new FileWriter("nomefileout.csv");
		PrintWriter pw = new PrintWriter(fw);
		
		//while ho dati da scrivere
		pw.println("Ciao a tutti....");
		
		
	}
}
