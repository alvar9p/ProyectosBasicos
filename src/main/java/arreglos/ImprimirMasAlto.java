package arreglos;

/*

    Escriba un programa que imprima el número más alto de un arreglo de 
    7 elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, 
    si se repite un valor considerar uno solo.

 */

public class ImprimirMasAlto {

    public static void main(String args[]) {
        int arreglo[] = new int[7];

        int x = 0;
        while (x < 7) {
            arreglo[x] = (int) Math.round(Math.random() * 100);
            x++;
        }

        for (int s = 0; s < arreglo.length; s++) {
            System.out.print(arreglo[s] + " , ");
        }

        int numeroMayor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[i] > arreglo[j + 1]) {
                    numeroMayor = arreglo[j];
                }
            }
        }

        System.out.print("El número mayor es: " + numeroMayor);

    }
}
