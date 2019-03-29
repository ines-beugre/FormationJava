package com.serli.tp7;
public class TestThread {

	public static void main(String[] args) {

		Monsieur c1 = new Monsieur();
		c1.start();

		Madame m1 = new Madame();
		m1.start();

	}
}
