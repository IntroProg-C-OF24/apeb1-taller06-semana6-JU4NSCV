/*
Problema-3
Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete. Si el peso es menor de 5 kg y la región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". Para cualquier otro caso, el costo es de $15.
 */
package taller6;
import java.util.Scanner;
public class CostoDeEnvíoDePaquetes {
    public static void main(String[] args) {
        double paquete,peso;
        String region;
        Scanner dato = new Scanner(System.in);       
        System.out.println("Incerte el precio del paquete");
        paquete = dato.nextDouble();
        System.out.println("Incerte el peso del paquete");
        peso = dato.nextDouble();
        System.out.println("Incerte el precio del paquete");
        region = dato.nextLine();
        switch (region) {
            case "local":
                if (peso<5) {
                    paquete=paquete +5;
                    System.out.println("El precio del paquete es: "+paquete);
                }
                else if (peso<10.0){
                    paquete=paquete +10;
                    System.out.println("El precio del paquete es: "+paquete);
                }
            break;
            case "nacional":
                System.out.println("RESTA");
            break;
        }
    }
}
