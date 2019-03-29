package com.serli.tp4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StreamHandler {

	public void stringToFile(String content, File destination) {

		// ecrit la chaine de caractère passée en paramètre dans un fichier
		if (!destination.exists()) {
			try {
				destination.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(destination, true));
			bw.write(content + "\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
