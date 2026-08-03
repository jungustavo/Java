import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();

		double salario = horasTrabalhadas * valorHora;

		System.out.printf("NUMBER: %d%nSALARY: U$ %.2f%n", numeroFuncionario, salario);

		sc.close();

	}

}
