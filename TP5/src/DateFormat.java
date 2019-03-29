import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {

	public void format1() {

		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println("La date est: " + sdf.format(calendar.getTime()));

	}

	public void format2() {

		Calendar calendar = Calendar.getInstance();

		SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd MMM yyyy à HH:mm:ss");
		System.out.println("La date est: " + sdf.format(calendar.getTime()));

	}

	public static void main(String[] args) {
		DateFormat format = new DateFormat();
		format.format1();

		System.out.println("");
		format.format2();

	}
}
