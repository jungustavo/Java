import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D;
		
		System.out.println("Insira os 4 valores: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int diferença = (A * B - C * D);
		
		System.out.println("A diferença é "+diferença);
		
		
		sc.close();
		
	}

}
