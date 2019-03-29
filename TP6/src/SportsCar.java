

public class SportsCar extends Car {

	private int nbCylinders;

	public SportsCar() {
		this.nbCylinders = 45;
	}

	public SportsCar(String name, int year, int nbCylinders) {
		super(name, year);
		this.nbCylinders = nbCylinders;
	}

	public int getNbCylinders() {
		return nbCylinders;
	}

	public void setNbCylinders(int nbCylinders) {
		this.nbCylinders = nbCylinders;
	}

	@Override
	public final void start() {
	}

	@Override
	public String describe() {
		String str = super.describe() + " Avec en plus " + nbCylinders + " cylindres.";
		return str;

	}

}
