import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Class Car avec l'option de sériablisation
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Car {
	@XmlAttribute
	private String name;

	@XmlAttribute
	private int year;

	public Car(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}

	public Car() {
		super();
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

	/**
	 * Permet d'obtenir une description de la voiture
	 * 
	 * @return la description
	 */
	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}

	/**
	 * Permet de sérialiser l'objet Car en fichier xml
	 * 
	 */
	public void serial(Car car, String filepath) {
		try {
			JAXBContext jc = JAXBContext.newInstance(Car.class);
			Marshaller m = jc.createMarshaller();
			m.marshal(car, new File(filepath));
			System.out.println("Fichier " + filepath + " crée.");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Permet de sérialiser le fichier xml en Objet Car
	 * 
	 */
	public void deserial(Car car, File filepath) {
		try {
			JAXBContext jc = JAXBContext.newInstance(Car.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			Car car1 = (Car) unmarshaller.unmarshal(filepath);
			System.out.println("deserialisation: " + car1.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Car car = new Car("Peugot", 2019);
		car.serial(car, "../../Documents/tp7.xml");

		File file = new File("../../Documents/tp7.xml");
		car.deserial(car, file);

//		try {
//			JAXBContext jc = JAXBContext.newInstance(Car.class);
//			Unmarshaller unmarshaller = jc.createUnmarshaller();
//			Car car2 = (Car) unmarshaller.unmarshal(new File("../../Documents/tp7.xml"));
//			System.out.println(car2.toString());
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
