import java.util.Scanner;

public class BeeCrowd1019 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		

		int hora = valor/3600;
		int resto = valor % 3600;
		int minutos = resto /60;
		int segundos = valor % 60;
				
		
		
		
		
		System.out.println(hora+":"+minutos+":"+segundos);
		
		
		sc.close();
		
		
	}

}
