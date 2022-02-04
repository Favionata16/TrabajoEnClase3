package LabTc3;



public class Estudiantes extends Personas{
    

    private int idEstudiante;

    public Estudiantes(String nombre, int nacimiento,int idEstudiante) {
        super(nombre, nacimiento);
        this.idEstudiante = idEstudiante;
    }


    public int getIdEstudiantes() {
        return idEstudiante;
    }

    public void setIdEstudiantes(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    

    @Override
    public String toString() {
        return "nombre:" + nombre+", Nacimiento"+nacimiento+", ID de estudiante:"+idEstudiante;
    }


    
}
