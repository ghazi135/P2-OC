package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * La classe principal qui initie la comptabilisation des symptomes.
 */
public class AnalyticsCounter {

	public static void main(String args[]) {
		try {
			ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");

			List <String> symptom = reader.getSymptoms();

			ICalculOccurenceOfSymptoms calcul_occurence = new CalculOccurenceOfSymptoms();

			Map <String, Integer> map = calcul_occurence.calcul(symptom); // treat of the list and store it in the file
			// result.out
			IWriteResultInFile file = new WriteResultInFile();
			file.write(map);

		} catch (IOException e){
			System.err.println("il ya un problème d'execution");

		}



	}
}
