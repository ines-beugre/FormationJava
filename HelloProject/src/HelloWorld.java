import java.util.Arrays;

public class HelloWorld {

	public static void LoopFor() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void LoopWhile() {
		int i = 0;
		while (i < 100) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public static void LoopDo() {
		int i = 0;
		do {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		} while (i < 100);
	}

	public static void Convertir(long l) {
		float f = l;
		System.out.println(f);
	}

	public static void Tableau() {
		int[] tab;
		tab = new int[25];

		tab[0] = 100;

		System.out.println(Arrays.toString(tab));
	}

	public static void main(String[] args) {
		final String prenom = args.length > 0 ? args[0] : "world";
		// System.out.println("Hello " + prenom);

		LoopFor();
		// LoopWhile();

		// Convertir(10);
		// Tableau();
	}

}
