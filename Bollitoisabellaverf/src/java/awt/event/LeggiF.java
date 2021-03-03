package java.awt.event;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeggiF {
	public LeggiF() {
	}
	public void Leggi(Elencopersone Elenco, String path) throws IOException  {
		String line="" ;
		BufferedReader rr;
		Elenco.clear();
		
		
		try {
			pier= new BufferedReader(new FileReader(path));
			while( (line=rr.readLine())!=null) {
				String[] testoletto=line.split(",");
				Persona a= new Persona(testoletto[0], testoletto[1], testoletto[2]);
				Elenco.add(a);
				
			}
		}catch(FileNotFoundException e ){
			e.printStackTrace();
		}
	} 
	public void Scrivi(String csv, String path) {
		File f= new File (path);
		FileWriter fout;
		try {
			fout= new FileWriter(f);
			try {
				fout.write(csv);
			} catch (IOException e) {
				e.printStackTrace(); 
			} catch (FileNotFoundException e1) {
				
			}
			
		}
	}

}
