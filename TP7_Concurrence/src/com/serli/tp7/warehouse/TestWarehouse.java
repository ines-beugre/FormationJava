package com.serli.tp7.warehouse;

public class TestWarehouse {

	public static void main(String[] args) {
		Warehouse w1 = new Warehouse("w1", 12, 20);

		Customer c1 = new Customer("c1", w1, 1);
		Customer c2 = new Customer("c2", w1, 5);

//		Customer c3 = new Customer("c3", w2, 5);
//		Customer c4 = new Customer("c4", w2, 25);

		Producer p1 = new Producer(w1, 13);
		Producer p2 = new Producer(w1, 12);

		Thread t1 = new Thread(c1, "T1");
		t1.start();
//
//		Thread t2 = new Thread(c2, "T2");
//		t2.start();

		Thread t3 = new Thread(p1, "T3");
		t3.start();

	}
}
