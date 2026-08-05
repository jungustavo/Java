import java.util.Locale;
import java.util.Scanner;

public class exercicio07for {

	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double result = 0;
		
		for(int i = 0; i<x; i++) {
			
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if(z != 0) {
				result = y/z;
				System.out.println(result);
			}
			else {
				System.out.println("divisao impossivel");
			}
			
		}
		
		sc.close();
		
		
		
		
		
	}
	
}
