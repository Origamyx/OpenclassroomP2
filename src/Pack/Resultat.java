package Pack;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;
/** Classe resultat qui crée et ecrit le fichier result.txt 
 * @return le fichier result.txt
 * 
 * 
 * */
public class Resultat {
	
	public void getResultat() throws IOException{

		File file = new File("Result.txt");
		file.createNewFile();
		Occurence write = new Occurence();
		write.getOccurence();
		TreeMap<String, Integer> result = write.getOccurence();	
        
        BufferedWriter bf = null;;
        
        try{
            
            //create new BufferedWriter for the output file
            bf = new BufferedWriter( new FileWriter(file) );
 
            //iterate map entries
            for(Entry<String, Integer> entry : result.entrySet()){
                
                //put key and value separated by a colon
                bf.write( "Symptom :" + entry.getKey() + ", Occurence : " + entry.getValue() );
                
                //new line
                bf.newLine();
            }
            
            bf.flush();
 
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            
            try{
                //always close the writer
                bf.close();
            }catch(Exception e){}
        }
    }

		
	}
		
