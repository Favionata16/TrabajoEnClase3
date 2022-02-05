package LabTc3;

public class Buses extends Transporte{
    
    private int seats;
    private int standing;
    
    public Buses(int placa, String color,int standing,int seats) {
        super(placa,color);
        this.seats=seats;
        this.standing=standing;

    }
    
    public int getStanding() {
        return standing;
    }


    public void setStanding(int standing) {
        this.standing = standing;
    }
    

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
}
