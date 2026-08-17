import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generted method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Quantos números você vai digitar?");
		n = sc.nextInt();

		double[] vetor = new double[n];

		// atribuir valores a cada posição de vetor usando i;
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		// imprimir valores de cada posição do vetor;

		System.out.print("Valores: ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.2f ", vetor[i]);

		}

		System.out.println("");

		// SOMA
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		System.out.println("SOMA: " + soma);

		// Media
		double media = soma / vetor.length;
		System.out.println("MEDIA: " + media);

		sc.close();
	}

}
