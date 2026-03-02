import domain.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // 1. PANEL DEL ADMIN (Crea la base de datos del día)
        // ==========================================

        // El Admin registra vehiculo con 16 puestos
        Vehiculo miBus = new Vehiculo("SNQ574", 16, "Nissan", "Urvan");

        // El Admin registra a la tripulación
        Tripulacion conductor = new Tripulacion(1, "Alejandro", "3024645363", "Conductor", "AM/PM");
        Tripulacion auxiliarAm = new Tripulacion(2, "Maria Elena", "3104603175", "Auxiliar", "AM");

        // El Admin registra a las estudiantes y sus coordenadas
        Pasajero nina1 = new Pasajero(101, "Bibiana", "Padre1", "Direccion 1", 6.24, -75.58);
        Pasajero nina2 = new Pasajero(102, "Camila", "Padre2", "Direccion 2", 6.25, -75.59);

        // El Admin arma las paradas con los horarios estrictos de la mañana
        Parada paradaBibiana = new Parada(nina1, "05:18 AM");
        Parada paradaCamila = new Parada(nina2, "05:25 AM");

        // Mete las paradas en una lista
        List<Parada> listaRuta1 = new ArrayList<>();
        listaRuta1.add(paradaBibiana);
        listaRuta1.add(paradaCamila);

        // El Admin oficializa la Ruta Diaria
        RutaDiaria rutaColomboFrances = new RutaDiaria("AM", miBus, conductor, auxiliarAm, listaRuta1);


        // ==========================================
        // 2. PANEL DE LA AUXILIAR lo que hace maria elena
        // ==========================================
        System.out.println("=== INICIANDO RUTA COLOMBO FRANCÉS (" + rutaColomboFrances.getJornada() + ") ===");
        System.out.println("Vehículo: " + rutaColomboFrances.getVehiculo().getPlaca() + " | Puestos disponibles: " + rutaColomboFrances.getVehiculo().getCapacidadPasajeros());
        System.out.println("Auxiliar a cargo: " + rutaColomboFrances.getAuxiliar().getNombre() + "\n");

        System.out.println("Llegando a la parada de las " + rutaColomboFrances.getListaParadas().get(0).getHoraProgramada() + "...");
        System.out.println("Estudiante: " + rutaColomboFrances.getListaParadas().get(0).getPasajero().getNombre());

        // simulacro, entoncers María Elena hunde el botón verde en su tablet para Bibiana
        rutaColomboFrances.getListaParadas().get(0).setEstado("Abordó con éxito");
        rutaColomboFrances.getListaParadas().get(0).setHoraLlegadaReal("05:19 AM");

        // ==========================================
        // 3. PANEL DEL ACUDIENTE Lo que ve el papá en su celular
        // ==========================================
        System.out.println("\n--- Notificación en la app del Acudiente ---");
        System.out.println("Estado de Bibiana: " + rutaColomboFrances.getListaParadas().get(0).getEstado());
        System.out.println("Hora de abordaje: " + rutaColomboFrances.getListaParadas().get(0).getHoraLlegadaReal());
    }
}