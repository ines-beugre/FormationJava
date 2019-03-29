package com.serli.tp9;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BufferR {
	public static void main(String[] args) {

		String fileName = "../../Documents/nombre.txt";
		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

			list = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}

		list.forEach(System.out::println);

	}
}
