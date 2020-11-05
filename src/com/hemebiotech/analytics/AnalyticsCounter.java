package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter  {
	

	public static void main(String args[]) throws Exception {
		

		
		 Map<String, Integer> map= new TreeMap<String, Integer>(); 

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");

		ArrayList<String> symptom = reader.getSymptoms() ;
		
		
		
		Occurence calcul = new Occurence();
		
		calcul.Calcul(symptom,map); //treat of the list and store it in the file result.out
		
		WriteInFile file = new WriteInFile();
		file.Write(map);
		
	}
}
