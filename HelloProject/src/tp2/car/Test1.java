package tp2.car;

import com.serli.vehicules.Car;
import com.serli.vehicules.SportCar;

public class Test1 {
	public static void main(String[] args) {
		CanPrintDescription[] tab;

		tab = new CanPrintDescription[10];

		tab[0] = new Car();

		tab[1] = new SportCar();

		tab[2] = new Boat();

		tab[3] = new Sandwich();

		for (int i = 0; i < tab.length; i++) {
			if (tab[i] != null) {
				tab[i].printDescription();
			}
		}

		Car car = new SportCar();
		Car car2 = new SportCar();
		Car car3 = new SportCar();
		car.printDescription();
		car.start();
		car.printDescription();
		System.out.println(Car.getCountInstances());
	}
}
