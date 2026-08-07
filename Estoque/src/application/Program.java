package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

/*
 * Esse programa deverá ler os dados de um produto em estoque (nome, preço e
	quantidade no estoque). Em seguida:
		Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
		Realizar uma entrada no estoque e mostrar novamente os dados do produto
		Realizar uma saída no estoque e mostrar novamente os dados do produto
		Criar uma classe com métodos; 
		
 * 
 */

public class Program {

	public static void main (String[]args) {

		// Locale e Scanner para definir a localidade e utilizar o . ao invés da , | Scanner para permitir a entrada de dados no console;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		
		Product product = new Product(); 

		/*
		 * Tipo: 'Product' (O molde do objeto)
		 * Nome: 'product' (A variável que você vai usar)
		 * Valor: 'new Product()' (Cria e salva o objeto na memória)
		 */
		
		System.out.println("Enter product data: ");
		System.out.print("Name: " );
		product.name = sc.nextLine();

		System.out.print("Price: " );
		product.price = sc.nextDouble();
		
		System.out.print("Quantity: " );
		product.quantity = sc.nextInt();
		
		System.out.println();
	    System.out.println("Product data: "+ product.toString());
	    System.out.println();
	    
	    System.out.print("Enter the number of products to be added in stock: ");
	    product.addProducts(sc.nextInt());
	    System.out.println();
	    System.out.println("Updated data: "+ product.toString());
	    
		
	    System.out.print("Enter the number of products to be removed from stock: ");
	    product.removeProducts(sc.nextInt());
	    System.out.println();
	    System.out.println("Updated data: "+ product.toString());
	    
		sc.close(); 
		
		
	}
}
