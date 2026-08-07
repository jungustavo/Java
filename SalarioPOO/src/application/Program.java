package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee funcionario = new Employee();

		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		System.out.println("");

		System.out.printf("Employee : %s, $ %.2f", funcionario.name, funcionario.netSalary());
		System.out.println("");

		System.out.print("Which percentage to increase salary? ");
		funcionario.increaseSalary(sc.nextDouble());

		System.out.printf("Updated data: %s, $ %.2f", funcionario.name, funcionario.netSalary());

		sc.close();

	}

}
