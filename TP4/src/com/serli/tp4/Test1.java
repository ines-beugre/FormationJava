package com.serli.tp4;

import java.io.File;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		TextFileHandler tfh = new TextFileHandler();
		File source = new File("../../Documents/text");
		File dest = new File("../../Documents/text1");
		tfh.readShowAndWriteFile(source, dest);

	}
}
