package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		
		Pessoas[] vect = new Pessoas[n];
		
		for(int i = 0; i<n;i++) {
			System.out.printf("Dados da %da pessoa: \n",i+1);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoas(nome,idade,altura);
			
		}
		
		System.out.println();
		
		//Media altura
		double soma = 0.0;
		for(int i = 0; i<vect.length; i++) {
			soma += vect[i].getAltura();
		}
		double media = soma/vect.length;
		
		System.out.printf("Altura média: %.2f%n", media);
		
		//menor que 16
		int count = 0;
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade()<16) {
				count += 1;
			}
		}
		
		double menor = ((double)count/vect.length)*100;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", menor);
		
				
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade()<16) {
				System.out.println(vect[i].getName());
			}
		}
		
		
		
		
		sc.close();
		
	}

}
