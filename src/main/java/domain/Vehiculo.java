package domain;

public class Vehiculo {

    private String placa;
    private int capacidadPasajeros;
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, int capacidadPasajeros, String marca, String modelo) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public int getCapacidadPasajeros() { return capacidadPasajeros; }
    public void setCapacidadPasajeros(int capacidadPasajeros) { this.capacidadPasajeros = capacidadPasajeros; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}