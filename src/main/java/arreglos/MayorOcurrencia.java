package arreglos;

/*

    Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). 
    Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y 
    también imprimir la cantidad de veces que aparece en el arreglo.

    Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

    Como resultado debería imprimir lo siguiente:

    La mayor ocurrencias es: 3 
    El elemento que mas se repite es: 5
    En el ejemplo, el elemento que más se repite en el arreglo es el número 5 
    con una ocurrencia de 3 veces.

 */

public class MayorOcurrencia {

    public static void main(String args[]) {
        int arreglo[] = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7};
        int repeticionOcumulador;
        int numeroMayor = 0;
        int posicionOcurrencia = 0;

        int repeticiones[] = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            repeticionOcumulador = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    repeticionOcumulador++;
                }
            }

            repeticiones[i] = repeticionOcumulador;
        }

        for (int i = 0; i < repeticiones.length; i++) {
            for (int j = 0; j < repeticiones.length; j++) {
                if (repeticiones[i] > repeticiones[j]) {
                    numeroMayor = repeticiones[i];
                    posicionOcurrencia = i;
                }
            }
        }

        System.out.println("Número de repeticiones: " + numeroMayor);
        System.out.println("Número con mayor ocurrencia: " + arreglo[posicionOcurrencia]);

    }
}
