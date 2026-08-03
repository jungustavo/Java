import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim;
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		int duracao;
		
		if (inicio < fim) {
			duracao = inicio - fim;
			System.out.println("O jogo durou "+ duracao + " horas");
		}else {
			duracao = 24 - inicio + fim;
			System.out.println("O jogo durou "+ duracao + " horas");
		}
		
		sc.close();

	}

}
