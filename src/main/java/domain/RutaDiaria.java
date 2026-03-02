package domain;

import java.util.List;

public class RutaDiaria {

    private String jornada; // "AM" (Recogida estricta) o "PM" (Entrega sujeta a tráfico)

    // ¡Composición pura! Traemos las otras clases aquí adentro
    private Vehiculo vehiculo;
    private Tripulacion conductor;
    private Tripulacion auxiliar;
    private List<Parada> listaParadas;

    public RutaDiaria() {
    }

    public RutaDiaria(String jornada, Vehiculo vehiculo, Tripulacion conductor, Tripulacion auxiliar, List<Parada> listaParadas) {
        this.jornada = jornada;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.auxiliar = auxiliar;
        this.listaParadas = listaParadas;
    }

    public String getJornada() { return jornada; }
    public void setJornada(String jornada) { this.jornada = jornada; }

    public Vehiculo getVehiculo() { return vehiculo; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }

    public Tripulacion getConductor() { return conductor; }
    public void setConductor(Tripulacion conductor) { this.conductor = conductor; }

    public Tripulacion getAuxiliar() { return auxiliar; }
    public void setAuxiliar(Tripulacion auxiliar) { this.auxiliar = auxiliar; }

    public List<Parada> getListaParadas() { return listaParadas; }
    public void setListaParadas(List<Parada> listaParadas) { this.listaParadas = listaParadas; }
}