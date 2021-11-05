package clasemath;
import java.util.Scanner;

/*

    Pedir el radio de un círculo y calcular su área.

    utilizar la formula:
    area = PI*r² (Constante PI multiplicado por el radio al cuadrado).

*/


public class calcularArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area, radio;
        System.out.println("Introduce el radio del circulo: ");
        radio = scanner.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es = " + area);
    }
}
