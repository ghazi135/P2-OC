package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * This part of class will take our Map contents and it stores them in the file
 * it will test if the file exists or not to make sure that we have a file prepared to write inside it
 * @version 1.0
 * @author GBOUZAZI
 */
public interface IWriteResultInFile {

	/**
	 *
	 *
	 *
	 * @param symptom, The method has a {@link Map} of symptoms to save them  in a file named result.out
	 * @throws IOException will generate an error message where we get an error during the execution
	 *
	 */
	 void write(Map<String, Integer> symptom) throws IOException;

}
