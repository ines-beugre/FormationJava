package structureDeDonnées;

public class Car {
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
	}

	public void start() {

	}

	public String describe() {
		String str = "Voiture " + name + ", crée en " + year + ".";
		return str;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (year != other.year) {
			return false;
		}
		return true;
	}

	/*
	 * @Override public int hashCode() { return 1; }
	 * 
	 * @Override public boolean equals(Object object) { return true; }
	 ***/
}
