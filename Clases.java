
package LabTc3;

public class Clases {
    private String nombreClase;
    private int codigo;


    public Clases() {
    }

    public Clases(String nombreClase,int codigo) {
        this.nombreClase = nombreClase;
        this.codigo = codigo;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    


    @Override
    public String toString() {
        return "Clases: "+nombreClase+", Codigo:"+codigo;
    }
    
}
