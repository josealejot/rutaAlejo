package domain;

public class Tripulacion extends Persona {

    // Atributos exclusivos del equipo de trabajo
    private String rol;   // Ejemplo: "Conductor", "Auxiliar"
    private String turno; // Ejemplo: "AM", "PM", "Ambos"

    public Tripulacion() {
        // Constructor vacío
    }

    public Tripulacion(int id, String nombre, String telefono, String rol, String turno) {
        super(id, nombre, telefono); // Heredamos los datos básicos de Persona
        this.rol = rol;
        this.turno = turno;
    }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }
}