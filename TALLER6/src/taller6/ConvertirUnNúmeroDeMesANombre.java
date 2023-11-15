/*
Problema-4
Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa un mes del año, muestra el nombre del mes correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 */
package taller6;

import java.util.Scanner;

public class ConvertirUnNúmeroDeMesANombre {

    public static void main(String[] args) {
        int mes;
        Scanner dato = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DEL MES");
        mes = dato.nextInt();
        switch (mes) {
            case 1:
                System.out.println("ENERO");
            break;
            case 2:
                System.out.println("FEBREO");
            break;
            case 3:
                System.out.println("MARZO");
            break;
            case 4:
                System.out.println("ABRIL");
            break;
            case 5:
                System.out.println("MAYO");
            break;
            case 6:
                System.out.println("JUNIO");
            break;
            case 7:
                System.out.println("JULIO");
            break;
            case 8:
                System.out.println("AGOSTO");
            break;
            case 9:
                System.out.println("SEPTIEMBRE");
            break;
            case 10:
                System.out.println("OCTUBRE");
            break;
            case 11:
                System.out.println("NOVIEMBRE");
            break;
            case 12:
                System.out.println("DICIEMBRE");
            break;
        }
    }
}
