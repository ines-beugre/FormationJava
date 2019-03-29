package com.serli.tp4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileHandler {

	public void readShowAndWriteFile(File source, File destination) {

		BufferedReader br = null;

		// lecture du fichier
		try {
			br = new BufferedReader(new FileReader(source));
			FileWriter fileWriter = new FileWriter(destination);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				fileWriter.write(sCurrentLine + "\n");

			}
			// affiche le fichier
			System.out.println("le nom du ficher est: " + source);

			// crée le fichier s'il n'existe pas
			if (!destination.exists()) {
				destination.createNewFile();
			}

			fileWriter.close();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null) {
					br.close();
				}

			} catch (IOException ex) {

				ex.printStackTrace();

			}
		}
	}
}
