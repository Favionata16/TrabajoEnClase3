
package LabTc3;

public class Transporte {
    private int placa;
    private String color;
    public int capacidad;

    public Transporte(int placa, String color) {
        this.placa = placa;
        this.color = color;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

     public String toString(){


        return ("Placa:"+placa+", Color"+color+", Capacidad");
    }
    
    
    
}
