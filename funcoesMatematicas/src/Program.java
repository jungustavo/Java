
public class Program {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);

		System.out.println("A raíz quadra de " + x + " é igual a: " + A);
		System.out.println("A raíz quadra de " + y + " é igual a: " + B);
		System.out.println("A raíz quadra de " + z + " é igual a: " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);

		System.out.println(x + " elevado a "+y+ " é igual a: "+ A);
		System.out.println(x + " ao quadrado é igual a: "+ B);
		System.out.println("5 ao quadrado é igual a: "+ C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O Valor absoluto de "+ y + " é igual a: "+ A);
		System.out.println("O Valor absoluto de "+ z + " é igual a: "+ B);
		
		

	}

}
