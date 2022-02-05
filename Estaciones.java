
package LabTc3;


public class Estaciones {
    
    private String nombre;    
    private int x;
    private int y;

    public Estaciones(int x, int y,String nombre){

        this.x=x;
        this.y=y;
        this.nombre= nombre;


    }

    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){

        return("Nombre de Estacion: "+nombre+", posicion: " +x+" "+y);

    }
}
