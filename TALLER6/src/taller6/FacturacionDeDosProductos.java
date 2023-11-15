/*
Problema-1
Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online, el cual calcule el precio total de la compra para un cliente. Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

Requisitos:

La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos variantes.
Al costo total de la factura, se debe incluir los gastos por concepto de transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos o impuestos dada la excepción descrita en el punto 3.b.
El objetivo es presentar al usuario los detalles de su compra: costos, impuestos, descuentos, monto final dadas las siguientes condiciones: a. Si el subtotal de la compra (sin descuentos o gastos de envío), supera los $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000, el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los artículos antes de agregar cualquier tipo de descuesto o promoción.
A continuación, algunos ejemplos de una factura modelo:
 */
package taller6;
import java.util.Scanner;
public class FacturacionDeDosProductos {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int xbox;
        int cantidadiphone;
        int precioiPad;
        int precioiphone;
        int subpro1;
        int subpro2;
        int subtotal;
        double iva = 0.1;
        double subiva;
        double descuento;
        int envio;
        double total;
        System.out.println("Cuantas xbox quiere?");
        xbox = dato.nextInt();
        System.out.println("Cuantas iphones quiere?");
        cantidadiphone = dato.nextInt();
        System.out.println("Precio de xbox");
        precioiPad = dato.nextInt();
        System.out.println("Precio de iphones");
        precioiphone = dato.nextInt();
        System.out.println("Cuanto es el envio");
        envio = dato.nextInt();
        subpro1 = precioiPad * xbox;
        subpro2 = precioiphone * cantidadiphone;
        subtotal = subpro1 + subpro2;
        iva = subtotal * iva;
        subiva = subtotal + iva;
        if (subiva > 1000) {
            descuento = subiva * 0.2;
        } else {
            descuento = subiva * 0.05;
        }
        if (subtotal > 5000) {
            total = subiva - descuento;
            envio = 0;
            System.out.println("================");
            System.out.println("CANTIDAD DE XBOX: " + xbox);
            System.out.println("================");
            System.out.println("CANTIDAD DE IPHONE: " + cantidadiphone);
            System.out.println("================");
            System.out.println("PRECIO XBOX: " + precioiPad);
            System.out.println("================");
            System.out.println("PRECIO IPHONE: " + precioiphone);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro1);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro2);
            System.out.println("================");
            System.out.println("SUBTOTAL: " + subtotal);
            System.out.println("================");
            System.out.println("IVA: " + iva);
            System.out.println("================");
            System.out.println("SUBTOTAL + IVA: " + subiva);
            System.out.println("================");
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("================");
            System.out.println("GASTOS DE ENVIO: " + envio);
            System.out.println("================");
            System.out.println("MONTO FACTURA: " + total);
        } else {
            total = subiva - descuento + envio;
            System.out.println("================");
            System.out.println("CANTIDAD DE XBOX: " + xbox);
            System.out.println("================");
            System.out.println("CANTIDAD DE IPHONE: " + cantidadiphone);
            System.out.println("================");
            System.out.println("PRECIO XBOX: " + precioiPad);
            System.out.println("================");
            System.out.println("PRECIO IPHONE: " + precioiphone);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro1);
            System.out.println("================");
            System.out.println("SUBTOTAL IPHONE: " + subpro2);
            System.out.println("================");
            System.out.println("SUBTOTAL: " + subtotal);
            System.out.println("================");
            System.out.println("IVA: " + iva);
            System.out.println("================");
            System.out.println("SUBTOTAL + IVA: " + subiva);
            System.out.println("================");
            System.out.println("DESCUENTO: " + descuento);
            System.out.println("================");
            System.out.println("GASTOS DE ENVIO: " + envio);
            System.out.println("================");
            System.out.println("MONTO FACTURA: " + total);
        }
    }
}
