package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		String initialDeposit = sc.nextLine();
		
		Account conta = new Account(number, holder);
		
		
		
		if(initialDeposit.charAt(0) == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta.deposit(deposit);
			
		}

		System.out.println("");
		System.out.println("Account Data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n", conta.getNumber(), conta.getHolder(), conta.getBalance());
		
		System.out.println("");
		System.out.println("Enter a deposit value:");
		double deposit = sc.nextDouble();
		conta.deposit(deposit);
		System.out.println("Updated account Data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n", conta.getNumber(), conta.getHolder(), conta.getBalance());
		
		System.out.println("");		
		System.out.println("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		conta.withdraw(withdraw);
		System.out.println("Updated account Data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f%n", conta.getNumber(), conta.getHolder(), conta.getBalance());

		sc.close();
		

	}

}
