import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class bee1018 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);
    
    int valor = sc.nextInt();
    
    System.out.println(valor);
    System.out.println(valor/100);
    valor = valor % 100;
    System.out.println(valor/50);
    valor = valor % 50;
    System.out.println(valor/20);
    valor = valor % 20;
    System.out.println(valor/10);
    valor = valor % 10;
    System.out.println(valor/5);
    valor = valor % 5;
    System.out.println(valor/2);
    valor = valor % 2;
    System.out.println(valor/1);
    valor = valor % 1;
    
    
       sc.close();
    }
    
    
}