package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteInFile {
	
	
	public void Write(Map<String,Integer> symptom) throws IOException {
		
		FileWriter writer = new FileWriter ("result.out");
		
		
		for (Map.Entry<String, Integer> val : symptom.entrySet()) { 
			writer.write(val.getKey()  + ": " + val.getValue() + "\n"); 
} 		
		writer.close();

}

}
