
public abstract class Vehicule {

	protected String state = "stopped";
	private static int countInstances = 0;

	public Vehicule() {
		super();
//		countInstances++;
//		System.out.println("Vehicule");
	}

	protected String getState() {
		return state;
	}

	protected void setState(String state) {
		this.state = state;
	}

	public abstract void start();

	// public abstract String Describe();

	public static int getCountInstances() {
		return countInstances;
	}

}
