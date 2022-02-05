
package LabTc3;

public class Transportistas extends Personas{
    
    
    private int experiencia;
    private String apodo;

    public Transportistas(String nombre, int nacimiento, int experiencia, String apodo) {
        super(nombre, nacimiento);
        this.experiencia = experiencia;
        this.apodo=apodo;
        
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "nombre:" + nombre+", Nacimiento"+nacimiento+", Experiencia:"+experiencia+", Apodo en el barrio:"+apodo;
    }
    
}
