package tp2.car;

public abstract class Vehicule implements CanPrintDescription {

	protected String state = "stopped";
	private static int countInstances = 0;

	public Vehicule() {
		super();
		countInstances++;
		System.out.println("Vehicule");
	}

	protected String getState() {
		return state;
	}

	protected void setState(String state) {
		this.state = state;
	}

	@Override
	public void printDescription() {
		System.out.println(Describe());
	}

	public abstract void start();

	public abstract String Describe();

	public static int getCountInstances() {
		return countInstances;
	}

}
