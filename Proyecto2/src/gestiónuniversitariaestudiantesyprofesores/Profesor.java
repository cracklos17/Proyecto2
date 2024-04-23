package gestiónuniversitariaestudiantesyprofesores;

import java.util.Scanner;

public class Profesor {
    // Atributos
    private String nombre;
    private String numeroIdentificacion;
    private String genero;
    private String[] materiasQueEnsenia;
    private int numeroDeMateriasQueEnsenia;
    private String carreraCursada;
    private String universidadEgresado;
    private int edad;
    private Scanner scanner;
  
    // Constructor con parámetros
    public Profesor(String nombre, String numeroIdentificacion, String genero, String[] materiasQueEnsenia, int numeroDeMateriasQueEnsenia, String carreraCursada, String universidadEgresado, int edad) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.genero = genero;
        this.materiasQueEnsenia = materiasQueEnsenia;
        this.numeroDeMateriasQueEnsenia = numeroDeMateriasQueEnsenia;
        this.carreraCursada = carreraCursada;
        this.universidadEgresado = universidadEgresado;
        this.edad = edad;
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

    public String[] getMateriasQueEnsenia() {
        return materiasQueEnsenia;
    }

    public void setMateriasQueEnsenia(String[] materiasQueEnsenia) {
        this.materiasQueEnsenia = materiasQueEnsenia;
    }

    public int getNumeroDeMateriasQueEnsenia() {
        return numeroDeMateriasQueEnsenia;
    }

    public void setNumeroDeMateriasQueEnsenia(int numeroDeMateriasQueEnsenia) {
        this.numeroDeMateriasQueEnsenia = numeroDeMateriasQueEnsenia;
    }

    public String getCarreraCursada() {
        return carreraCursada;
    }

    public void setCarreraCursada(String carreraCursada) {
        this.carreraCursada = carreraCursada;
    }

    public String getUniversidadEgresado() {
        return universidadEgresado;
    }

    public void setUniversidadEgresado(String universidadEgresado) {
        this.universidadEgresado = universidadEgresado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    public void actualizarProfesorDesdeConsola(Profesor profesor, Scanner scanner) {
        System.out.println("Ingrese los nuevos detalles del profesor:");
        System.out.print("Nuevo nombre: ");
        profesor.setNombre(scanner.next());
        System.out.print("Nuevo número de identificación: ");
        profesor.setNumeroIdentificacion(scanner.next());
        System.out.print("Nuevo género: ");
        profesor.setGenero(scanner.next());
        System.out.print("Nuevas materias que enseña (separadas por comas): ");
        scanner.nextLine(); // Consumir la nueva línea pendiente
        String materiasQueEnseniaStr = scanner.nextLine();
        profesor.setMateriasQueEnsenia(materiasQueEnseniaStr.split(","));
        System.out.print("Nuevo número de materias que enseña: ");
        profesor.setNumeroDeMateriasQueEnsenia(scanner.nextInt());
        System.out.print("Nueva carrera cursada: ");
        profesor.setCarreraCursada(scanner.next());
        System.out.print("Nueva universidad egresado: ");
        profesor.setUniversidadEgresado(scanner.next());
        System.out.print("Nueva edad: ");
        profesor.setEdad(scanner.nextInt());
    }

}