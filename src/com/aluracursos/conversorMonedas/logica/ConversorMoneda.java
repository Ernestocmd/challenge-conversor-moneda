package com.aluracursos.conversorMonedas.logica;

import javax.swing.text.IconView;
import java.util.Map;

public class ConversorMoneda {
    private final Map<String, Double> tasas;
    private final Menu menu = new Menu();

    public ConversorMoneda(Map<String, Double> tasas){
        this.tasas = tasas;
    }

    public void iniciar(){
       boolean continuar = true;

       while (continuar){
           int opcion = menu.mostrarMenuBienvenida();
           String origen = null;
           String destino = null;

           switch (opcion){
               case 1: origen = "USD";
                       destino = "ARS";
                       break;
               case 2: origen = "ARS";
                       destino = "USD";
                       break;
               case 3: origen = "USD";
                       destino = "BRL";
                       break;
               case 4: origen = "BRL";
                       destino = "USD";
                       break;
               case 5: origen = "USD";
                       destino = "COP";
                       break;
               case 6: origen = "COP";
                       destino = "USD";
                       break;
               case 7: System.out.println("Gracias por usar el conversor.");
                       continuar = false;
                       break;
               default: System.out.println("Opción no válida. Intente nuevamente.");
               continue;
           }

           if (!continuar){
               break;
           }

           double monto = menu.leerMonto();
           double resultado = convertir(origen, destino, monto);
           System.out.printf("%.2f %s = %.2f %s%n", monto, origen, resultado, destino);
       }
    }

    private double convertir(String origen, String destino, double monto){
        double tasaOrigen = tasas.get(origen);
        double tasaDestino = tasas.get(destino);
        return (monto / tasaOrigen) * tasaDestino;
    }
}
