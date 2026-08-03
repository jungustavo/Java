import java.util.Locale;
import java.util.Scanner;

public class whileConceito {

	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		
		while (x != 0) { // enquanto o valor de x for diferente de zeor
			soma += x; // o valor soma terá o valor dele mesmo + o valor de x;
			x = sc.nextInt(); // atribuir novo valor a x e volta para linha 16;
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}
}
