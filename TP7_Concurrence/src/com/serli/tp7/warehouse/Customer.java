package com.serli.tp7.warehouse;

public class Customer implements Runnable {

	private int need;
	private String name;
	Warehouse warehouse;

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public int getNeed() {
		return need;
	}

	public void setNeed(int need) {
		this.need = need;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String name, Warehouse warehouse, int need) {
		super();
		if (need > warehouse.getMax()) {
			System.out.println("Le besoin du client " + name + "(" + need + ")"
					+ " est suppérieur à la capacité de l'entrepot (" + warehouse.getMax() + ").");
		} else {
			System.out.println("Client " + name + " crée.");
			this.name = name;
			this.warehouse = warehouse;
			this.need = need;
		}
	}

	public synchronized void consumme() {
		if (need <= warehouse.getStockCourant()) {
			warehouse.setStockCourant(warehouse.getStockCourant() - need);
			System.out.println(name + " a consommé " + need + " patates. Nouveau stock de " + warehouse.getName() + ": "
					+ warehouse.getStockCourant() + ".");
		} else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void run() {
		consumme();
	}

}
