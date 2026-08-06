import java.util.Scanner;


public class Main {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int higher = cleiton(x , y, z);
		
		escreva(higher);
		
		sc.close();
		
	}
	
	
	public static int cleiton (int a, int b, int c) {
		int aux;
		
		if (a > b && a > c) {
			aux = a;
		}
		else if (b > c) {
			aux = b;
		}else {
			aux = c;
		}
		
		return aux;
	}
	
	
	public static void escreva (int valor) {
		
		System.out.println(valor + " EH O MAIOR");
	}
}
