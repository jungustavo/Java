import java.util.Scanner;
public class BeeCrowd1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int valor = sc.nextInt();
		

		int ano = valor/365;
		int aux = valor % 365;
		int meses =  aux / 30;
		int dias = aux % 30;
		
		System.out.println(ano+ " ano (s)");
		System.out.println(meses+ " mes (es)");
		System.out.println(dias+ " dia (s)");
		
		sc.close();
		
	}

}
