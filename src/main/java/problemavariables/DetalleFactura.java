package problemavariables;
import java.util.Scanner;

/*
    
    La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, 
    se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:

    Reciba el nombre de la factura o descripción, utilizar método nextLine() 
    para obtener el nombre de la factura con espacios.

    Reciba 2 precios de productos de tipo double, utilizar método nextDouble() 
    para obtener precios con decimales (,).

    Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%

    Se pide mostrar en un solo String el nombre de la factura, el monto total bruto 
    (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
    
*/


public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un nombre para la factura:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese un precio de producto:");
        double precio1 = scanner.nextDouble();
        
        System.out.println("Ingrese un segundo precio de producto:");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto 
                + ", con un impuesto de " + impuesto 
                + " y el monto despues de impuesto es de " + totalNeto;
        
        System.out.println(detalle);
    }
}