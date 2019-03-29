package com.serli.tp7.warehouse;

public class Warehouse {

	private String name;
	private int stockCourant;
	private int max;

	public Warehouse(String name, int stockCourant, int max) {
		super();
		System.out.println("Entrepot " + name + " crée.");
		this.name = name;
		this.max = max;
		this.stockCourant = stockCourant;
	}

	public synchronized void delivery(int nbPatatoToDelivery) {
		// opération atomique: toutes les patates sont livrées

		int needOfWarehouse = this.max - this.stockCourant;
		int newStock = this.stockCourant + nbPatatoToDelivery;

		System.out.println(newStock);

		if (this.stockCourant < this.max || needOfWarehouse == nbPatatoToDelivery) {

			setStockCourant(newStock);

			System.out.println("livraison effectuée : " + needOfWarehouse + " patate(s). Nouveau stock de " + name
					+ " :" + newStock + ".");
		} else {
			System.out.println("La livraison n'est pas possible.");
		}

		if (newStock > this.max) {
			System.out.println("La livraison n'est pas possible===========.");
		}
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getStockCourant() {
		return stockCourant;
	}

	public void setStockCourant(int stockCourant) {
		this.stockCourant = stockCourant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
