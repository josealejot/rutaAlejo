package domain;

public class Pasajero extends Persona {

    // Atributos EXCLUSIVOS del pasajero (Lo demás lo hereda de Persona)
    private String direccion;
    private double latitud;
    private double longitud;
    private boolean estaAbordo;

    public Pasajero() {
        // Constructor vacío
    }

    // Constructor completo (Incluye los datos de la Persona + los del Pasajero)
    public Pasajero(int id, String nombre, String telefono, String direccion, double latitud, double longitud) {
        super(id, nombre, telefono); // La palabra 'super' envía estos 3 datos a la clase madre (Persona)
        this.direccion = direccion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.estaAbordo = false; // Por defecto, cuando arranca el día, nadie está a bordo
    }

    // Getters y Setters de los atributos nuevos
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public double getLatitud() { return latitud; }
    public void setLatitud(double latitud) { this.latitud = latitud; }

    public double getLongitud() { return longitud; }
    public void setLongitud(double longitud) { this.longitud = longitud; }

    public boolean isEstaAbordo() { return estaAbordo; }
    public void setEstaAbordo(boolean estaAbordo) { this.estaAbordo = estaAbordo; }
}