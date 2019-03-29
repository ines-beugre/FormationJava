import java.text.DecimalFormat;

public class NumberFormat {

	public void convertNumber(double nombre) {

		DecimalFormat decimalFormat = new DecimalFormat("##.00");
		System.out.println(decimalFormat.format(nombre));

	}

	public static void main(String[] args) {

		NumberFormat numberFormat = new NumberFormat();
		numberFormat.convertNumber(123);
	}
}
