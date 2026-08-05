import java.util.Scanner;

public class exercicio08for {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 1;
		
		for(int i = 1; i<= n; i++) {
			
			if (n != 0) {
				result *= i;	
			}
			else {
				result = 1;
			}
			
			
		}
		
		System.out.println(result);
		sc.close();
		
		
	}
	
}
