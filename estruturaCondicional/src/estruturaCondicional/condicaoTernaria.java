package estruturaCondicional;

import java.util.Locale;

public class condicaoTernaria {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);

		double preco = 34.5;
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05; // Sintaxe: (condição) ? valor verdadeiro : valor falso
		
		System.out.println(desconto);
		
		

	}

}
