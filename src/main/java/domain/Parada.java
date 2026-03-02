package domain;

public class Parada {

    // ¡Pura Composición! Usamos tu clase Pasajero como un atributo aquí adentro
    private Pasajero pasajero;

    private String horaProgramada;
    private String horaLlegadaReal;
    private String estado; // Ej: "Pendiente", "Abordó", "No Salió", "Cancelada"

    public Parada() {
    }

    // Fíjate que al crear una parada, solo pedimos el pasajero y a qué hora toca recogerlo
    public Parada(Pasajero pasajero, String horaProgramada) {
        this.pasajero = pasajero;
        this.horaProgramada = horaProgramada;
        this.estado = "Pendiente"; // Por defecto, todas las paradas inician como pendientes
        this.horaLlegadaReal = "Aún no llega";
    }

    public Pasajero getPasajero() { return pasajero; }
    public void setPasajero(Pasajero pasajero) { this.pasajero = pasajero; }

    public String getHoraProgramada() { return horaProgramada; }
    public void setHoraProgramada(String horaProgramada) { this.horaProgramada = horaProgramada; }

    public String getHoraLlegadaReal() { return horaLlegadaReal; }
    public void setHoraLlegadaReal(String horaLlegadaReal) { this.horaLlegadaReal = horaLlegadaReal; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}