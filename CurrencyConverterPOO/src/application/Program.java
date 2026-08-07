package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

//Fazer um programa para ler a cotação do dolar, e depois o valor em dolares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dolares, considerando o IOF de 6% sobre o valor em dolar. 
// Criar a classe CurrencyConverter para realizar os calculos utilizando métodos estáticos; 

public class Program {
	
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		
		System.out.print("How many dollar will be bought? ");
		double dollarquantity = sc.nextDouble();
		
		System.out.print("Amout paid in reais = " + CurrencyConverter.converter(dollarPrice, dollarquantity));
		
		
		sc.close();
	}

}
