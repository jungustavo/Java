import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;

		System.out.println("DIGITE 3 VALORES");

		int x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("VOCÊ DIGITOU");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
//Quebra de linha com nextLine();
//nextInt, nextDouble, next();