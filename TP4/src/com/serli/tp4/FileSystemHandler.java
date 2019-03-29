package com.serli.tp4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystemHandler {

	public boolean folderExists(String folderPath) {

		File directory = new File(folderPath);
		System.out.println(directory.getAbsoluteFile());
		return (directory.exists() && Paths.get(folderPath).toFile().isDirectory());
	}

	public void showFolderTree(String folderPath, boolean showOnllyFolders) {

		System.out.println("Liste des sous-dossiers: \n");

		File directory = new File(folderPath);
		File[] children = directory.listFiles();

		for (File file : children) {
			System.out.println(file.getAbsolutePath());
		}

		System.out.println("");

		System.out.println("Liste des dossiers principaux: \n");
		File[] roots = File.listRoots();
		if (showOnllyFolders = true) {
			for (File root : roots) {
				System.out.println(root.getAbsolutePath());
			}
		}

	}

	public void moveFileToParentsFolder(String filePath) throws IOException {

		File directory = new File(filePath);
		File newName = new File("../../Documents/tp4");

		Path sourceDirectory = Paths.get("../../Documents/jartest.jar");
		Path targetDirectory = Paths.get("../../Documents/tp4/jartest.jar");

		// création du dossier
		if (!directory.exists()) {
			System.out.println("Création du dossier: " + directory.getName());
			boolean result = false;

			try {
				directory.mkdir();
				// copie du fichier
				Files.copy(sourceDirectory, targetDirectory);
				// renommer le dossier
				boolean isFileRenamed = directory.renameTo(newName);
				System.out.println("Dossier rennomé: " + newName.getName());

				result = true;
			} catch (SecurityException se) {
				// handle it
			}
			if (result) {
				System.out.println("dossier créé");
			}
		} else {
			System.out.println("le dossier existe déjà");
		}

	}

}
