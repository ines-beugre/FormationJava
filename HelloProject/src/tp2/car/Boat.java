package tp2.car;

public class Boat extends Vehicule {

	private Propulsion propulsion;
	private String name;
	private boolean isAnchored;

	public Boat() {
		super();
		name = "Titanic";
		propulsion = propulsion.ENGINE;
	}

	public Boat(Propulsion propulsion, String name, boolean isAnchored) {
		super();
		this.propulsion = propulsion;
		this.name = name;
		this.isAnchored = isAnchored;
	}

	public void throwAnchro() {
		if (isAnchored == true) {
			super.state = "started";
		}
	}

	public void weighAnchro() {
		if (isAnchored == false) {
			super.state = "stoped";
		}
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public String Describe() {
		String str = "Bateau: " + name + ", Propulsion: " + propulsion + ", L'ancre est lévee?: " + isAnchored;
		return str;
	}

}
