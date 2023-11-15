/*
Problema-5
Determinar el tipo de operación matemática. Dado un número del 1 al 4 que representa una operación matemática básica (suma, resta, multiplicación, división), muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 */
package taller6;
import java.util.Scanner;
public class DeterminarElTipoDeOperaciónMatemática {
    public static void main(String[] args) {
        int op;
        Scanner dato = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DEL MES");
        op = dato.nextInt();
        switch (op) {
            case 1:
                System.out.println("SUMA");
            break;
            case 2:
                System.out.println("RESTA");
            break;
            case 3:
                System.out.println("MULTIPLICACION");
            break;
            case 4:
                System.out.println("DIVICION");
            break;
        }
    }
}
