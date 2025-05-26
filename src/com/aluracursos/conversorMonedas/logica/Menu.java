package com.aluracursos.conversorMonedas.logica;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenuBienvenida(){
        System.out.println("****************************************************************");
        System.out.println("Sea Bienvenido/a al Conversor de Monedas");
        System.out.println("1) USD => ARS (Dólar a Peso Argentino)");
        System.out.println("2) ARS => USD (Peso Argentino a Dólar)");
        System.out.println("3) USD => BRL (Dólar a Real Brasileño)");
        System.out.println("4) BRL => USD (Real Brasileño a Dólar)");
        System.out.println("5) USD => COP (Dólar a Peso colombiano)");
        System.out.println("6) COP => USD (Peso colombiano a Dólar)");
        System.out.println("7) Salir");
        System.out.println("****************************************************************");

        while (!scanner.hasNextInt()){
            System.out.println("Ingrese un número válido (1 - 7): ");
            scanner.next();
        }

        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }

    public double leerMonto(){
        System.out.println("Ingrese el monto a convertir: ");
        while (!scanner.hasNextDouble()){
            System.out.println("Debe ingresar un número válido: ");
            scanner.next();
        }
        double monto = scanner.nextDouble();
        scanner.nextLine();
        return monto;
    }


}
