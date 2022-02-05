
package LabTc3;

public class Taxis extends Transporte{
    private int taxiNumero;

    public Taxis(int placa, int taxiNumero, String color) {
        super(placa, color);
        this.taxiNumero = taxiNumero;
        this.capacidad = 4;
    }

    public int getTaxiNumero() {
        return taxiNumero;
    }

    public void setTaxiNumero(int taxiNumero) {
        this.taxiNumero = taxiNumero;
    }
}
