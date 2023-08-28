
import java.util.Scanner;



/**
 *
 * @author yostin
 */
public class Tabla_multiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número : ");
        int numero = sc.nextInt();

        for (int a = 1; a <= 10; a++) {
            System.out.println(numero + " x " + a + " = " + (numero * a));
        }
    }
}
