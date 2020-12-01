package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;

/**
 * In this part we will calculate the occurence Of each symptôme of the list and then we return them in a map
 * @version 1.0
 * @author GBOUZAZI
 */
public interface ICalculOccurenceOfSymptoms {
	/**
	 *  @param symptom  occurence calculation of each symptom in the {@link List}
	 *	save every symptom next to it occurence
	 *  @return a {@link Map} of symptoms with its occurences .
	 *
	 *
	 */

	 Map<String, Integer> calcul(List<String> symptom);

}
