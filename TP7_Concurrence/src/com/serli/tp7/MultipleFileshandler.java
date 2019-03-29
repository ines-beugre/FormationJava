package com.serli.tp7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleFileshandler implements Runnable {

	private String sourceFolder;
	private String destinationFolder;
	private static final int MAX_T = 3;

	public MultipleFileshandler(String sourceFolder, String destinationFolder) {
		super();
		this.sourceFolder = sourceFolder;
		this.destinationFolder = destinationFolder;
	}

	public static void moveFiles(String sourceFolder, String destination, String suffixe, int nbThread) {

		File directory = new File(sourceFolder);
		File[] directories = directory.listFiles();

		// creation du pool
		ExecutorService pool = Executors.newFixedThreadPool(nbThread);

		// parcours des fichiers du dossier
		for (File file : directories) {
			// Execute la tache
			if (!file.isDirectory()) {
				pool.execute(new MultipleFileshandler(file.getPath(),
						destination + File.separator + suffixe + file.getName()));
			}
		}

		// arrete le pool
		pool.shutdown();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// deplacer les fichier de source --> destination
		try {
			Files.move(Paths.get(sourceFolder), Paths.get(destinationFolder));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// modifier le nom du fichier déplacé
		// ajout de la date au format y m d h m s en prefixen

	}

	public static void main(String[] args) {

		String source = "../../Documents/test";
		String destination = "../../Documents/test/test1";

		moveFiles(source, destination, "hello", 2);

	}
}
