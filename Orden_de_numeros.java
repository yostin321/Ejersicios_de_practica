
import java.util.Scanner;



/**
 *
 * @author yostin
 */
public class Orden_de_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("El primero: " + numeros[0]);
        System.out.println("El último: " + numeros[9]);
        System.out.println("El segundo: " + numeros[1]);
        System.out.println("El penúltimo: " + numeros[8]);
        System.out.println("El tercero: " + numeros[2]);
    }
}
