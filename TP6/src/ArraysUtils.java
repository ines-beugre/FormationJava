import java.util.Arrays;
import java.util.List;

public class ArraysUtils {

	public <T> void arrayToCollection(T[] tab) {

		List<T> tabs = Arrays.asList(tab);

		System.out.println("la liste est: ");
		for (T name : tabs) {
			System.out.println(" " + name);
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		ArraysUtils arraysUtils = new ArraysUtils();
		String[] nums = { "Janvier", "Fevier", "Mars" };

		Integer[] ints = { 1, 2, 3 };

		arraysUtils.arrayToCollection(nums);
		arraysUtils.arrayToCollection(ints);

	}
}
