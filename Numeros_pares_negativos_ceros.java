
import java.util.Scanner;



/**
 *
 * @author yostin
 */
public class Numeros_pares_negativos_ceros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int negativos = 0;
        int ceros = 0;

        for (int a = 1; a <= 20; a++) {
            System.out.print("Ingrese el número " + a + ": ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
            if (numero < 0) {
                negativos++;
            }
            if (numero == 0) {
                ceros++;
            }
        }

        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}
