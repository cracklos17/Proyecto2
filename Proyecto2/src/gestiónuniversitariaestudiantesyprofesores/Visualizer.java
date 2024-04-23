package gestiónuniversitariaestudiantesyprofesores;

public class Visualizer {
    public static void imprimirDetallesProfesores(Profesor[] profesores) {
        System.out.println("Detalles de Profesores:");
        for (Profesor profesor : profesores) {
            if (profesor != null) {
                System.out.println("Nombre: " + profesor.getNombre());
                System.out.println("Número de identificación: " + profesor.getNumeroIdentificacion());
                System.out.println("Género: " + profesor.getGenero());
                System.out.println("Materias que enseña: " + String.join(", ", profesor.getMateriasQueEnsenia()));
                System.out.println("Número de materias que enseña: " + profesor.getNumeroDeMateriasQueEnsenia());
                System.out.println("Carrera cursada: " + profesor.getCarreraCursada());
                System.out.println("Universidad egresado: " + profesor.getUniversidadEgresado());
                System.out.println("Edad: " + profesor.getEdad());
                System.out.println("--------------------------");
            }
        }
    }

    public static void imprimirDetallesEstudiantes(Estudiante[] estudiantes) {
        System.out.println("Detalles de Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null) {
                System.out.println("Nombre: " + estudiante.getNombre());
                System.out.println("Número de identificación: " + estudiante.getNumeroIdentificacion());
                System.out.println("Género: " + estudiante.getGenero());
           
                System.out.println("Edad: " + estudiante.getEdad());
                System.out.println("Materias inscritas: " + String.join(", ", estudiante.getCursos()));
                System.out.println("--------------------------");
            }
        }
    }

    public static void imprimirDetallesEstudiantesYProfesores(Estudiante[] estudiantes, Profesor[] profesores) {
        System.out.println("Detalles de Estudiantes y Profesores:");
        imprimirDetallesEstudiantes(estudiantes);
        imprimirDetallesProfesores(profesores);
    }
}
