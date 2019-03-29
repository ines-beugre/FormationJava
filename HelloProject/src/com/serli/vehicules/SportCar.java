package com.serli.vehicules;

public class SportCar extends Car {
	private int nbCylinders;

	public SportCar() {
		super();
		this.nbCylinders = 45;
	}

	public SportCar(String name, int year, int nbCylinders) {
		super(name, year);
		this.nbCylinders = nbCylinders;
	}

	@Override
	public final void start() {
		state = "drive fast";
	}

	@Override
	public String Describe() {
		String str = super.Describe() + " Avec en plus " + nbCylinders + " cylindres.";
		return str;

	}

}
