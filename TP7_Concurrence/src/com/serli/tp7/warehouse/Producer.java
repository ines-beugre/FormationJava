package com.serli.tp7.warehouse;

public class Producer implements Runnable {

	private Warehouse warehouse;
	private int nbPatatoToDelivery;

	public Producer(Warehouse warehouse, int nbPatatoToDelivery) {
		super();
		this.warehouse = warehouse;
		this.nbPatatoToDelivery = nbPatatoToDelivery;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public void delivery() {
		warehouse.delivery(nbPatatoToDelivery);
	}

	@Override
	public void run() {
		delivery();
	}

}
