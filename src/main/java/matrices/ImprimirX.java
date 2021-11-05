package matrices;

/*

    Escribir un programa que imprima una X construida a base de la letra X en 
    las diagonales de la matriz y utilizar el carácter guion bajo como relleno. 
    El tamaño de la x se basa en una variable n que indicará el tamaño de la letra 
    para imprimir en una matriz de n x n.

    El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

    Por ejemplo para n=5 se obtiene:

    X___X
    _X_X_
    __X__
    _X_X_
    X___X
    Por ejemplo para n=6 se obtiene:

    X____X
    _X__X_
    __XX__
    __XX__
    _X__X_
    X____X
    Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.

*/


public class ImprimirX {
    public static void main(String[] args) {

        Object[][] matriz = new Object[5][5];


        //creamos los for para recorrer la matriz
        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                int x = i+1;
                if ((i == j)||(j ==(5-x)) ){
                    matriz[i][j] = "X";
                }else if (i != j){
                    matriz[i][j] = "_";
                }
            }
        }
        //presentamos la matriz
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
