import java.util.Scanner;

public class exercicio04for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x >= 1 && x <= 1000) {

			for (int i = 0; i < x; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}

			}
			
			x = sc.nextInt();
		}

		sc.close();
	}

}
