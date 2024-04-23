package gestiónuniversitariaestudiantesyprofesores;

import java.util.Scanner;

public class Estudiante {
    // Atributos
    private String nombre;
    private String numeroIdentificacion;
    private String genero;
    private String carrera;
    private int creditos;
    private int edad;
    private String[] cursos;
    private Scanner scanner;
   

    // Constructor con parámetros
    public Estudiante(String nombre, String numeroIdentificacion, String genero, String carrera, int creditos, int edad, String[] cursos) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.genero = genero;
        this.carrera = carrera;
        this.creditos = creditos;
        this.edad = edad;
        this.cursos = cursos;
        this.scanner = new Scanner(System.in);
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

  

    // Métodos getter y setter para los atributos

    public void actualizarEstudianteDesdeConsola(Estudiante estudiante, Scanner scanner) {
        System.out.println("Ingrese los nuevos detalles del estudiante:");
        System.out.print("Nuevo nombre: ");
        estudiante.setNombre(scanner.next());
        System.out.print("Nuevo número de identificación: ");
        estudiante.setNumeroIdentificacion(scanner.next());
        System.out.print("Nuevo género: ");
        estudiante.setGenero(scanner.next());
        System.out.print("Nueva edad: ");
        estudiante.setEdad(scanner.nextInt());
        System.out.print("Nuevas materias (separadas por comas): ");
        scanner.nextLine(); // Consumir la nueva línea pendiente
       
    }
	
}
