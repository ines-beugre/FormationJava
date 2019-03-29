import java.util.Arrays;

public class Nombres {

	public void interprete(String listNumber) {

		String[] nombres = listNumber.split(" ");
		System.out.println("Nombre à additionner: " + Arrays.toString(nombres));
		long result = 0;
		for (String nombre : nombres) {
			result += (Float.parseFloat(nombre));
		}
		System.out.println("Le résultat est: " + result);
	}

	public static void main(String[] args) {

		Nombres nombre = new Nombres();
		nombre.interprete("123.2 2345");

	}
}
