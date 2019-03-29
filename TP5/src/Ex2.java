import java.util.Calendar;
import java.util.Date;

public class Ex2 {

	public void findDate() {

		// Date date = new Date();

		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		int day = calendar.get(Calendar.DATE);
		int month = calendar.get(Calendar.MONTH) + 1;
		int year = calendar.get(Calendar.YEAR);

		System.out.println("le jour est: " + day);
		System.out.println("le mois est: " + month);
		System.out.println("l'année est: " + year);
	}

	public void modifyDate() {
		Calendar calendar = Calendar.getInstance();

		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.DATE, 31);
		System.out.println("Date après modification: " + calendar.getTime());

//		System.out.println("le jour est: " + 31);
//		System.out.println("le mois est: " + month);
//		System.out.println("l'année est: " + year);
//
//		System.out.println("sdf " + sdf.format(calendar.getTime()));
//		System.out.println("La date est le: " + 31 + " " + "décembre" + " " + year);
	}

	public static void main(String[] args) {

		Ex2 ex = new Ex2();
		ex.findDate();

		System.out.println("");
		ex.modifyDate();
	}
}
