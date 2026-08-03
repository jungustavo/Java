import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 13.141121;
		System.out.println("Olá Mundo");
		System.out.println(y);
		// %.4f - Abreviação do número longo//
		// %n - Quebra de linha//
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.println(x);
		System.out.println("RESULTADO: " + x + " metros");
		
		
	}
}
