package com.serli.tp4;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {

		FileSystemHandler fileSystem = new FileSystemHandler();

		// teste si le document existe
		String dir = "../../Documents";
		System.out.println("Le document existe: " + fileSystem.folderExists(dir));

		System.out.println("");
		// affiche l'ensemble des descendants
		File[] roots = File.listRoots();
		fileSystem.showFolderTree(dir, true);

		System.out.println("");
		String dir1 = "../../Documents/tp4";

		fileSystem.moveFileToParentsFolder(dir1);
	}
}
