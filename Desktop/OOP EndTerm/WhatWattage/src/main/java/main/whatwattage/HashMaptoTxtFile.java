
package main.whatwattage;

import java.io.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HashMaptoTxtFile extends BaseJavaFrame{

    
    //write
    protected static void hashMapToFile(Map<String, Integer> map, String filepath) {
            
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.newLine(); // Move to the next line
            }
        } catch (IOException e) {
        }
    }
    
   
    
    //read
    protected static HashMap<String, Integer> fileToHashMap(String filePath) {
        HashMap<String, Integer> map = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                
                String[] parts = line.split("=");
                
                
                String key = parts[0].trim();
                int value = Integer.parseInt(parts[1].trim());

                
                map.put(key, value);
            }
        } catch (IOException e) {
            
        }

        return map;
    }   
}
