
public class PairUtils {

	public static <T, U> boolean sameContent(Pair1<T, U> pair1, Pair1<T, U> pair2) {
		return (pair1.equals(pair2));
	}

	public static void main(String[] args) {
		String u = "u";
		int v = 1;

		String w = "u";
		int x = 1;

		int y = 2;

		Pair1<String, Integer> pairUtils = new Pair1<String, Integer>(u, y);
		Pair1<String, Integer> pairUtils2 = new Pair1<String, Integer>(w, x);

		// Pair1<String, String> pairUtils2 = new Pair1<String, Integer>(w, x);

		System.out.println(sameContent(pairUtils, pairUtils2));

	}
}
