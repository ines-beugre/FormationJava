package com.serli.vehicules;

import tp2.car.Vehicule;

public class Car extends Vehicule {

	private String name;
	private int year;

	public Car() {
		super();
		this.name = "Suzuki";
		this.year = 2019;
		System.out.println("Default Car");
	}

	public Car(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void stop() {
		state = "stopped";
	}

	@Override
	public void start() {
		state = "started";

	}

	@Override
	public String Describe() {
		String str = "Voiture " + name + ", crée en " + 2019 + ", mode: " + state + ".";
		return str;
	}

}
