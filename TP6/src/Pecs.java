import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pecs {

	public static List<String> getNames(List<? extends Car> cars) {

		List<String> carNames = new ArrayList<>();
		for (Car car : cars) {
			car.getName();
			carNames.add(car.getName());
		}
		return carNames;
	}

	public static void addNewRandomCar(List<? super Car> cars, int numberOfCarsToAdd) {

		String name = UUID.randomUUID().toString();
		int year = (int) (1900 + Math.random() * 119);

		// double d = (int) (1900 + Math.random() * 119);
		// Integer i = d.intValue();
		// Integer i1 = ((Double (1900 + Math.random() * 119)).intValue();
		int i = 0;
		for (i = 0; i < numberOfCarsToAdd; i++) {
			cars.add(new Car(name, year));
		}
		System.out.println("Liste des voitures" + cars.toString());

	}

	public static void main(String[] args) {
		List<SportsCar> cars = new ArrayList<>();

		cars.add(new SportsCar("P", 2019, 1));
		cars.add(new SportsCar("R", 2010, 2));
		cars.add(new SportsCar("E", 2019, 4));

		System.out.println(getNames(cars));

		List<Car> cars1 = new ArrayList<>();
		List<SportsCar> sportsCar = new ArrayList<>();
		List<Vehicule> vehicule = new ArrayList<>();
		addNewRandomCar(cars1, 2);
		// addNewRandomCar(sportsCar, 3);
		addNewRandomCar(vehicule, 2);

	}
}
