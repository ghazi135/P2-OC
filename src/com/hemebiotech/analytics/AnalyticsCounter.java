package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * The principal class AnalyticsCounter will contain the other classes using the instantiation
 */
public class AnalyticsCounter {

	/**
	 * @param args this main method will run every single separated class .
	 */
	public static void main(String args[]) {
		try {
			ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");

			List <String> symptom = reader.getSymptoms();

			ICalculOccurenceOfSymptoms calculOccurrence = new CalculOccurenceOfSymptoms();

			Map <String, Integer> map = calculOccurrence.calcul(symptom); // treat of the list and store it in the file
			// result.out
			IWriteResultInFile file = new WriteResultInFile();
			file.write(map);

		} catch (IOException e){
			System.err.println("il ya un problème d'execution");

		}



	}
}
