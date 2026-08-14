package application;

import java.util.Locale;
import java.util.Scanner;

public class conceitosVetores1 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // declaro a variavel com o valor
		
		double[] vect = new double[n]; // instacia o vetor atribuindo o tamanho do valor na variável
		
		
		for(int i=0;i<n;i++) {
			vect[i] = sc.nextDouble(); // atribui valor nas posições do vetores usando i para percorrer cada posição
		}
		
		double sum = 0.0; // valor para realizar a soma com atribuição != null;
		
		for(int i = 0; i<n;i++) {
			sum += vect[i]; // soma os valores do vetor usando i para percorrer as posições
		}
		
		double avg = sum / n; // pega o valor da soma e divide por n sendo esse o tamanho da array; 
		
		System.out.println("AVERAGED HEIGHT: "+avg);
		
		
		/*
		 * 
		 * Excelente solução para percorrer tamanhos de valores estáticos; 
		 * 
		 */
				
		sc.close();
	}
	
	
}
