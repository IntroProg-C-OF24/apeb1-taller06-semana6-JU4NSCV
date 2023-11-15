/*
Problema-2
Clasificación de un triángulo Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:

Si todos los lados son iguales, mostrar "Triángulo equilátero".
Si dos lados son iguales, mostrar "Triángulo isósceles".
Si todos los lados son diferentes, mostrar "Triángulo escaleno".
Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 */
package taller6;

import java.util.Scanner;

public class Clasificacióndeuntriángulo {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner dato = new Scanner(System.in);
        System.out.println("INGRESE EL PRIMER LADO");
        lado1 = dato.nextDouble();
        System.out.println("INGRESE EL SEGUNDO LADO");
        lado2 = dato.nextDouble();
        System.out.println("INGRESE EL TERCER LADO");
        lado3 = dato.nextDouble();
        if (lado1 + lado2 == lado3) {
            System.out.println("No es un triangulo");
        } else {
            if (lado1 == lado3) {
                if (lado3 == lado2) {
                    System.out.println("Es un Triángulo equilátero");
                } else {
                    System.out.println("Es un Triángulo isósceles");
                }
            } else {
                System.out.println("Es un Triángulo escaleno");
            }
        }
    }
}
