import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		double valorTotal;

		if (codigo == 1) {
			valorTotal = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		
		else if (codigo == 2) {
				valorTotal = quantidade * 4.50;
				System.out.printf("Total: R$ %.2f%n", valorTotal);
		} 
		
		
		else if (codigo == 3) {
					valorTotal = quantidade * 5.00;
					System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		
		else if (codigo == 4) {
						valorTotal = quantidade * 2.00;
						System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		
		else if (codigo == 5) {
							valorTotal = quantidade * 1.50;
							System.out.printf("Total: R$ %.2f%n", valorTotal);
		}
		else {
			System.out.println("Código não encontrado");
		}
		sc.close();
	}
}

