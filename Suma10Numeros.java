
import java.util.Scanner;



/**
 *
 * @author yostin
 */
public class Suma10Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int a = 1; a <= 10; a++) {
            System.out.print("Ingrese el número " + a + ": ");
            int numero = sc.nextInt();
            suma += numero;
        }

        System.out.println("La suma de los números es: " + suma);
    }
}