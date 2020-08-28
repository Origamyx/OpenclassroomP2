package Pack;

import java.util.TreeMap;
/**
 * Class qui compte le nombre d'occurence des symptoms
 * @return un treeMap classer et avec les occurence
 * 
 * @author benoi
 *
 */
public class Occurence {
	
	public TreeMap<String, Integer> getOccurence() {
	    TreeMap<String, Integer> result = new TreeMap<>();
		Reading lire = new Reading("texte.txt");
		lire.GetSymptoms();
		int as = lire.GetSymptoms().size();
		
	
         for (int i = 0;  i < as; i++) {
        	 
        	lire.GetSymptoms().get(i);
        	
        	if (result.containsKey(lire.GetSymptoms().get(i))  ) {
              result.put(lire.GetSymptoms().get(i), result.get(lire.GetSymptoms().get(i))+1);
             
        	}
        	
        	else {
        		result.put(lire.GetSymptoms().get(i), 1);
        	}
        	
        	 
         }
		return result;
			
	
	}
	
}
