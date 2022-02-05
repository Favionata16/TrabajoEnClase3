package LabTc3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Estudiantes> lista = new ArrayList();
    public static ArrayList<Transportistas> listaTrans = new ArrayList();
    public static ArrayList<Clases> listaClases = new ArrayList();
    public static ArrayList<Transporte> listaTransporte = new ArrayList();

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            opciones(menu());
        } while (true);
    }

    public static int menu() {

        System.out.println("0. Salir\n"
                + "1. Crear Clase\n"
                + "2. Crear Ruta\n"
                + "3. Crear Alumno\n"
                + "4. Agregar Clase a Alumno\n"
                + "5. Crear Transportista\n"
                + "6. Crear Transporte\n"
                + "7. Simulación\n"
                + "8. Listar Clases\n"
                + "9. Listar Rutas\n"
                + "10. Listar Alumnos\n"
                + "11. Listar Transportistas\n"
                + "12. Listar Transportes"
                + "Ingrese la opcion: ");
        return sc.nextInt();
    }

    public static void opciones(int opcion) {
        switch (opcion) {
            case 0:
                System.exit(0);
            case 1:
                crearClases();
                break;
            case 2:
                break;
            case 3:
                crearEstudiante();
                break;
            case 4:
                break;
            case 5:
                crearTransportista();
                break;
            case 6:
                
                break;
            case 7:
                int opcion2=0;
                System.out.println("0. Salir\n"
                        + "1. Subir alumno al transporte\n"
                        + "2. Bajar alumno del transporte\n"
                        + "3. Listar alumnos del transporte\n"
                        + "4. Escoger transportista\n"
                        + "5. Quitar transportista\n"
                        + "6. Añadir ruta\n"
                        + "7. Quitar ruta\n"
                        + "8. Imprimir transporte\n"
                        + "9. Comenzar");
                opcion2=sc.nextInt();
                
                switch (opcion2) {
                    case 1:
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        crearEstudiante();
                        break;
                    case 4:
                        break;
                    case 5:
                        crearTransportista();
                        break;
                }
                
                break;
            case 8:
                listarClases();
                break;
            case 9:
                break;
            case 10:
                listarAlumnos();
                break;
            case 11:
                listarTransportista();
                break;
            case 12:
                break;
            default:
                break;
        }
    }

    public static void crearEstudiante() {

        System.out.println("Nombre: ");
        String nombre = sc.next();

        System.out.println("nacimiento: ");
        int nacimiento = sc.nextInt();

        System.out.println("idEstudiante: ");
        int idEstudiante = sc.nextInt();

        lista.add(new Estudiantes(nombre, nacimiento, idEstudiante));
    }

    public static void crearTransportista() {
        System.out.println("Nombre: ");
        String nombre = sc.next();

        System.out.println("nacimiento: ");
        int nacimiento = sc.nextInt();

        System.out.println("Experiencia: ");
        int experiencia = sc.nextInt();

        System.out.println("Apodo: ");
        String apodo = sc.next();

        listaTrans.add(new Transportistas(nombre, nacimiento, experiencia, apodo));
        
    }
    
    public static void crearClases(){
        System.out.println("Nombre: ");
        String nombreClase=sc.next();
        
        System.out.println("Codigo: ");
        int codigo=sc.nextInt();
        
        listaClases.add(new Clases(nombreClase,codigo));
    }
    
    public static void crearTransporte(){
        
    }

    public static void listarAlumnos() {
        for (Estudiantes estudiantes : lista) {
            System.out.println(estudiantes.toString());
        }
    }

    public static void listarTransportista() {
        for (Transportistas transportistas : listaTrans) {
            System.out.println(transportistas.toString());
        }
    }
    
    public static void listarClases() {
        for (Clases clases : listaClases) {
            System.out.println(clases.toString());
        }
    }


}
