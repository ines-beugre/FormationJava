import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lastname {
//	private String lastname;
//	private List<String> lastnames;
//
//	public Lastname(String lastname, List<String> lastnames) {
//		super();
//		this.lastname = lastname;
//		this.lastnames = lastnames;
//	}

	public static void main(String[] args) {

		String lastname = "Pierre, Paul, Jacques, Paul, Alfred, PIERRE";

		// liste de prénom
		List<String> lastnames = new ArrayList<>(Arrays.asList(lastname.split(",")));

		for (int i = 0; i < lastnames.size(); i++) {
			lastnames.set(i, lastnames.get(i).toUpperCase());
		}

		Set<String> set = new HashSet<>();
		for (String name : lastnames) {
			set.add(name.toUpperCase().trim());
		}
		System.out.println(set);

//		String str[] = lastname.split(",");
//
//		// List<String> lastnames = new ArrayList<String>();
//
//		lastnames = Arrays.asList(str);
//
//		for (String s : lastnames) {
//			System.out.println(s);
//			s = s.toUpperCase().trim();
//
//			System.out.println(s);
//			System.out.println("");
//		}
//
//		Set set = new HashSet();
//		set.addAll(lastnames);
//		List distinctList = new ArrayList(set);
//
//		System.out.println(distinctList);
//
//		System.out.println("" + lastname.substring(13, 21));

	}
}

// majiscule
// lastnames.stream().map(String::toUpperCase).forEach(name ->
// System.out.print(name + " "));
