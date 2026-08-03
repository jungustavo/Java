import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();

		if (x % y == 0) {
			System.out.println("SÃO MÚLTIPLOS");
		} else {
			if (y % x == 0) {
				System.out.println("SÃO MÚLTIPLOS");
			} else {
				System.out.println("NÃO SÃO MÚLTIPLOS");
			}
		}
		sc.close();
	}

}
