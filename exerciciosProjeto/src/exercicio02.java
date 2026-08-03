import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			

		System.out.println("Insira a área: ");
		double area = sc.nextDouble();
		double pi = 3.14159;
		double resultado = pi * Math.pow(area, 2.0); // ou pi * area * area
		
		System.out.printf("A = %.4f%n", resultado);

		
		sc.close();
		
	}

}
