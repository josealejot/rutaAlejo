package ui;

import domain.*;
import java.util.Scanner; // Para la interacción
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("=== CONFIGURACIÓN DE LA RUTA ESCOLAR ===");

        // 1. Registro del Vehículo
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = teclado.nextLine();
        Vehiculo miBus = new Vehiculo(placa, 16, "Nissan", "Urvan");

        // 2. Registro de Tripulación
        Tripulacion conductor = new Tripulacion(1, "Alejandro", "3024645363", "Conductor", "AM/PM");

        // 3. Registro de Pasajeros y Paradas
        List<Parada> listaRuta = new ArrayList<>();
        String continuar = "s";

        while(continuar.equalsIgnoreCase("s")) {
            System.out.print("\nNombre de la estudiante a recoger: ");
            String nombre = teclado.nextLine();
            Pasajero nina = new Pasajero(100, nombre, "3000000", "Dirección X", 0.0, 0.0);

            System.out.print("Hora programada (ej: 05:20 AM): ");
            String hora = teclado.nextLine();
            listaRuta.add(new Parada(nina, hora));

            System.out.print("¿Desea agregar otra parada? (s/n): ");
            continuar = teclado.nextLine();
        }

        RutaDiaria ruta = new RutaDiaria("AM", miBus, conductor, null, listaRuta);

        // 4. Simulacro de Recorrido (Panel de Auxiliar)
        System.out.println("\n--- INICIANDO RECORRIDO ---");
        for (Parada p : ruta.getListaParadas()) {
            System.out.println("\nLlegando a la parada de: " + p.getPasajero().getNombre());
            System.out.print("¿La estudiante abordó? (s/n): ");
            String abordo = teclado.nextLine();

            if(abordo.equalsIgnoreCase("s")) {
                p.setEstado("Abordó con éxito");
                p.setHoraLlegadaReal("Hora Actual");
            } else {
                p.setEstado("No salió / Cancelado");
            }
            System.out.println("Estado actualizado: " + p.getEstado());
        }

        System.out.println("\n=== RUTA FINALIZADA CON ÉXITO ===");
        teclado.close();
    }
}