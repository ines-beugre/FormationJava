
public class Pair {

	public void modelise(Object u, Object v) {

		if (u.getClass().getName() == v.getClass().getName()) {
			System.out.println("type 1: " + "(" + u + "," + v + ")");
		} else {
			System.out.println("Aucune paire n'a été trouvée ");

		}
	}

	public static void main(String[] args) {

		String u = "u";
		int v = 1;

		Pair pair = new Pair();
		pair.modelise(u, v);
	}

}
