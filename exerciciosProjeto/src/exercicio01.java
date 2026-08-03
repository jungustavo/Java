import java.util.Scanner;

public class exercicio01 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int x = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int y = sc.nextInt();
		
		int resultado = x + y;
		
		System.out.printf("A SOMA É: %d",resultado );
		
		sc.close();
		
		
	}

}
