package arreglos;

import javax.swing.JOptionPane;

/*

    Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.

    El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

    Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece 
    en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, 
    incluso si no están presente en el arreglo.

    Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

    1: ***
    2: 
    3: *
    4: *****
    5: *
    6: **
    Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.

 */

public class Histograma {

    public static void main(String args[]) {
        int a[] = new int[12];
        int x = 0;
        do {

            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));

            while (valor < 1 || valor > 9) {
                System.out.println("Digite un número entre el 1 y el 9");
                valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));
            }
            a[x] = valor;
            x++;
        } while (x < 12);

        int b[] = {1, 2, 3, 4, 5, 6};

        int contador;
        int ocurrencia[] = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            contador = 0;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    contador++;
                    a[j] = 0;
                }
            }

            ocurrencia[i] = contador;

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(b[i] + ":");
            for (int j = 0; j < ocurrencia[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
