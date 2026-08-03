import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double x = ler.nextDouble();
		double y = ler.nextDouble();
				
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if (x <0 && y > 0) {
			System.out.println("Q2");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Origem");
		}
			

		ler.close();

	}

}
