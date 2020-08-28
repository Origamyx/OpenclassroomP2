package Pack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reading {
	/**
	 * @return Renvois une Arraylist de tous les symptoms 
	 * depuis le fichier texte
	 * 
	 */
	String fichier;
	
	public Reading (String fichier) {
		this.fichier = fichier;
		
	}
	
	public List<String> GetSymptoms() {
		ArrayList<String> resultat = new ArrayList<>();
		
		if (fichier != null) {
			try {
				BufferedReader lire = new BufferedReader (new FileReader(fichier));
				String line = lire.readLine();
				
				while (line != null) {
					resultat.add(line);
					line = lire.readLine();
				}
				lire.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return resultat;
			
	}
	}

