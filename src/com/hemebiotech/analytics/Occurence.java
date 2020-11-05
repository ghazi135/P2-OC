package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class Occurence implements ICalcul  {
	
	
	
	@Override
	public void Calcul(ArrayList<String> symptom,  Map<String, Integer> map) throws IOException {
		
		
	
		  
	        for (String i : symptom) { 
	            Integer j = map.get(i); 
	            map.put(i, (j == null) ? 1 : j + 1); 
	        } 
	  
	        // displaying the occurrence of elements in the arraylist 
	        for (Map.Entry<String, Integer> val : map.entrySet()) { 
	            System.out.println(val.getKey()  + ": " + val.getValue()); 
	        } 
	    } 
	

					


	
}
