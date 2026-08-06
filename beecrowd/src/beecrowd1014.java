import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class beecrowd1014 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         * 
         * 
         */
    	
    	Locale.setDefault(Locale.US);
         
         Scanner sc = new Scanner(System.in);
         
         int x = sc.nextInt();
         double y = sc.nextDouble();
         double kml = x/y;
        
        
        System.out.printf("%.3f km/l", kml);
        
        sc.close();
 
 
 
    }
 
}