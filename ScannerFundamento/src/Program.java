import java.util.Scanner;

public class Program {

	public static void main(String[]args) {
		
	System.out.println("Digite algo");
	Scanner sc = new Scanner(System.in);
	
	String x; 
	x = sc.next();

	System.out.println("Você digitou " + x );
	
	sc.close();
	
	}
}
