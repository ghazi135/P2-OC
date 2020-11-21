package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * S'oocupe de tout ce qui touche à l'ecriture dans un fichier.
 * @version 1.0
 * @author GBOUZAZI
 */
public interface IWriteResultInFile {

	/**
	 *
	 * Ecrit dans un fichier la {@link Map} de symptoms.
	 *
	 * @param symptom Une {@link Map} des symptoms.
	 * @throws IOException
	 */
	 void write(Map<String, Integer> symptom) throws IOException;

}
