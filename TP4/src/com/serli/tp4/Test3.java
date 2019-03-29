package com.serli.tp4;

import java.io.File;

public class Test3 {
	public static void main(String[] args) {

		StreamHandler sh = new StreamHandler();
		String content = "formation java!!!!";
		File destination = new File("../../Documents/text1");

		sh.stringToFile(content, destination);
	}
}
