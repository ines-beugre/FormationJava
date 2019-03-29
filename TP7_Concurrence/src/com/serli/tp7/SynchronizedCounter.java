package com.serli.tp7;

public class SynchronizedCounter extends Thread {
	private String name;
	private static int compte;
	private static final int MAX = 20;

	public SynchronizedCounter(String name) {
		super();
		this.name = name;
	}

	public static synchronized int getCompte() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return compte++;
	}

	@Override
	public void run() {
		while (compte < MAX) {
			System.out.println(name + " " + getCompte());
		}
	}

	public static void main(String[] args) {
		SynchronizedCounter sc1 = new SynchronizedCounter("A");
		SynchronizedCounter sc2 = new SynchronizedCounter("B");

		sc1.start();
		sc2.start();
	}

}
