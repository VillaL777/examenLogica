package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("************** BIENVENIDO A MODA EXPRESS************");

        String nombreCliente;
        System.out.println("Ingrese el nombre y apellidos del cliente: ");
        nombreCliente = scanner.nextLine();

        String tipoCliente;
        System.out.println("Tipo cliente (regular/VIP): ");
        tipoCliente = scanner.nextLine();

        int cantidadArticulos;
        System.out.println("Cantidad articulos comprados");
        cantidadArticulos = scanner.nextInt();

        double precioTotalSinDescuento;
        System.out.println("Precio total sin descuento:");
        precioTotalSinDescuento = scanner.nextDouble();

        double descuento=0;





        if (tipoCliente.toLowerCase().equals("Regular")){
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = 0.05;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = 0.10;
            } else if (cantidadArticulos > 6) {
                descuento = 0.15;
            }
        } else if (tipoCliente.toUpperCase().equals("VIP")) {
            if (cantidadArticulos >= 1 && cantidadArticulos <= 3) {
                descuento = 0.10;
            } else if (cantidadArticulos >= 4 && cantidadArticulos <= 6) {
                descuento = 0.15;
            } else if (cantidadArticulos > 6) {
                descuento = 0.20;
            }
        }
        double totalConDescuento = precioTotalSinDescuento* descuento;

        System.out.println("Resumen de la compra para" + nombreCliente);
        System.out.println("Descuento aplicado:" + (descuento*100) + "%");
        System.out.println("Cantidad del descuento: $" +(precioTotalSinDescuento- (precioTotalSinDescuento*descuento)));
        System.out.println("Total a pagar: $" + totalConDescuento);
    }
}









