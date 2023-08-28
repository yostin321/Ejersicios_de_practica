
import java.util.Scanner;

 

/**
 *
 * @author yostin
 */
public class Dibujar_cuadro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int tamano = sc.nextInt();

        for (int a = 1; a <= tamano; a++) {
            //creamos otro bucle para que repita * en las otras linea la cantidad que ingresemos 
            for (int j = 1; j <= tamano; j++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
    }
}