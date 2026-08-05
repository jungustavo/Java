import java.util.Locale;
import java.util.Scanner;

public class exercicio06for {
	
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double result = 0.0;
		
		
		for(int i = 0; i< n; i++){
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			
			result = (x * 2 + y * 3 + z * 5)/10.0;
			
			System.out.printf("%.1f%n",result);
		}
		
		sc.close();
	}

}
