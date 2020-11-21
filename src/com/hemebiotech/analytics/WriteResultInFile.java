package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteResultInFile implements IWriteResultInFile {


	/**
	 * Ecrit dans un fichier la {@link Map} de symptoms.
	 *
	 * @param symptom Une {@link Map} des symptoms.
	 * @throws IOException
	 */
	@Override
	public void write(Map<String, Integer> symptom) throws IOException{
		try (FileWriter writer = new FileWriter("result.out")) {

			File file = new File("result.out");

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}

			for (Map.Entry<String, Integer> val : symptom.entrySet()) {
				writer.write(val.getKey() + ": " + val.getValue() + "\n");
			}

		}

	}
}
