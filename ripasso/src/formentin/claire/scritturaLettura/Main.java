package formentin.claire.scritturaLettura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	public static void main (String[] args){
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("solitudine.txt");
			pw = new PrintWriter(fw);
			pw.println("ciao");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				pw.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
		FileReader fr = null;
		try{
			fr = new FileReader("solitudine.txt");
			BufferedReader br = new BufferedReader(fr);
			String ciao = br.readLine();
			System.out.println(ciao);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
