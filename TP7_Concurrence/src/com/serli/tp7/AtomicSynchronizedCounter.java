package com.serli.tp7;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSynchronizedCounter extends Thread {
	private String name;
	private static AtomicInteger compte = new AtomicInteger(0);
	private static final int MAX = 20;

	public AtomicSynchronizedCounter(String name) {
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
		return compte.incrementAndGet();
	}

	@Override
	public void run() {
		while (compte.intValue() < MAX) {
			System.out.println(name + " " + getCompte());
		}
	}

	public static void main(String[] args) {
		AtomicSynchronizedCounter sc1 = new AtomicSynchronizedCounter("A");
		AtomicSynchronizedCounter sc2 = new AtomicSynchronizedCounter("B");

		sc1.start();
		sc2.start();
	}

}
