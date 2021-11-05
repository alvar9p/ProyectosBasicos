package arreglos;
import java.util.Scanner;

/*

    Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. 
    Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo, 
    el segundo, el antepenúltimo, el tercero, y así sucesivamente.

*/

public class OrdenarArreglo {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner consola = new Scanner(System.in);
        System.out.println(" Ingresar 10 números enteros: ");
        int totalNumeros = numeros.length;
        for (int i = 0; i < totalNumeros; i++) {
            numeros[i] = consola.nextInt();
        }
        System.out.println("=== Imprimiendo números ===");
        for (int i = 0; i < totalNumeros/2; i++) {
            System.out.print(numeros[i] + "---");
            System.out.println(numeros[numeros.length-1-i]);
        }
    }
}
