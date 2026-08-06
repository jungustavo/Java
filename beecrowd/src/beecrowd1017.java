import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class beecrowd1017 {
 
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        
        double litro = (tempo * velocidade) /12.00;
        
        System.out.printf("%.3f%n",litro);
        
        sc.close();
        
    }
 
}