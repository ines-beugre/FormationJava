package com.serli.tp7;

import java.util.concurrent.Semaphore;

public class Warehouse {
	private String name;
	private int stockCourant;
	private int capaciteMax;

	static Semaphore semaphore = new Semaphore(1);

	public Warehouse(String name, int stockCourant, int capaciteMax) {
		super();
		this.name = name;
		this.stockCourant = stockCourant;
		this.capaciteMax = capaciteMax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStockCourant() {
		return stockCourant;
	}

	public void setStockCourant(int stockCourant) {
		this.stockCourant = stockCourant;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

}
