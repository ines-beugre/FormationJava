package tp2.car;

public class Sandwich implements CanPrintDescription {

	private String name;

	public Sandwich() {
		super();
		name = "Americain Thon";
	}

	@Override
	public void printDescription() {
		System.out.println("Sandwich: " + name);

	}

}
