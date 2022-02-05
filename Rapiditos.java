
package LabTc3;

public class Rapiditos extends Transporte{
    private int seats;

    public Rapiditos(int placa, int capacidad, String color, int seats) {
        super(placa, color);
        this.seats = seats;
      
        this.capacidad = seats;
    }

    public int getSeats() {
        return seats;
    }


    public void setSeats(int seats) {
        this.seats = seats;
    }
}
