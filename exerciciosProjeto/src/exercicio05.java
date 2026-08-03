import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo1 = sc.nextInt();
		int qnt1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int qnt2= sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorTotal = valor1 * qnt1 + valor2 * qnt2;
		
		System.out.printf("VALOR A PAGAR %.2f%n",valorTotal);
		
		sc.close();
	}

}
