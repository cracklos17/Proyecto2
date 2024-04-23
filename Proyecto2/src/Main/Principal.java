package Main;

import java.util.Scanner;
import gestiónuniversitariaestudiantesyprofesores.ControladorEstudianteyProfesor;
import gestiónuniversitariaestudiantesyprofesores.Estudiante;
import gestiónuniversitariaestudiantesyprofesores.Profesor;
import gestiónuniversitariaestudiantesyprofesores.Visualizer;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControladorEstudianteyProfesor controladorEstudianteyProfesor = new ControladorEstudianteyProfesor();

        Profesor[] profesores = new Profesor[5];
        Profesor g = new Profesor("Juan Perez", "ID001", "Masculino", new String[]{"Matemáticas", "Física"}, 2, "Ingeniería", "Universidad A", 40);
        Profesor gh = new Profesor("Maria Gonzalez", "ID002", "Femenino", new String[]{"Historia", "Literatura"}, 2, "Humanidades", "Universidad B", 45);
        Profesor ghh = new Profesor("Carlos Lopez", "ID003", "Masculino", new String[]{"Química", "Biología"}, 2, "Ciencias Naturales", "Universidad C", 50);
        Profesor ghj = new Profesor("Laura Martinez", "ID004", "Femenino", new String[]{"Arte", "Música"}, 2, "Artes", "Universidad D", 55);
        Profesor wq = new Profesor("Pedro Sanchez", "ID005", "Masculino", new String[]{"Educación Física", "Salud"}, 2, "Educación", "Universidad E", 60);

        controladorEstudianteyProfesor.agregarProfesor(g, profesores);
        controladorEstudianteyProfesor.agregarProfesor(gh, profesores);
        controladorEstudianteyProfesor.agregarProfesor(ghh, profesores);
        controladorEstudianteyProfesor.agregarProfesor(ghj, profesores);
        controladorEstudianteyProfesor.agregarProfesor(wq, profesores);

        Estudiante[] estudiantes = new Estudiante[5];
        Estudiante k = new Estudiante("Ana Rodriguez", "ID101", "Femenino", "Ingeniería Civil", 120, 20, new String[]{"Cálculo", "Física"});
        Estudiante kk = new Estudiante("Diego Gomez", "ID102", "Masculino", "Medicina", 150, 22, new String[]{"Biología", "Química"});
        Estudiante kkk = new Estudiante("Sofia Ramirez", "ID103", "Femenino", "Administración de Empresas", 100, 21, new String[]{"Contabilidad", "Economía"});
        Estudiante kkkk = new Estudiante("Luis Torres", "ID104", "Masculino", "Derecho", 130, 23, new String[]{"Legislación", "Derecho Penal"});
        Estudiante kkkkk = new Estudiante("Elena Cruz", "ID105", "Femenino", "Psicología", 110, 24, new String[]{"Psicología Clínica", "Psicoterapia"});

        controladorEstudianteyProfesor.agregarEstudiante(k, estudiantes);
        controladorEstudianteyProfesor.agregarEstudiante(kk, estudiantes);
        controladorEstudianteyProfesor.agregarEstudiante(kkk, estudiantes);
        controladorEstudianteyProfesor.agregarEstudiante(kkkk, estudiantes);
        controladorEstudianteyProfesor.agregarEstudiante(kkkkk, estudiantes);

        while (true) {
            System.out.println("\n¿Qué operación deseas realizar?");
            System.out.println("1. Mostrar detalles de profesores");
            System.out.println("2. Mostrar detalles de estudiantes");
            System.out.println("3. Mostrar detalles de profesores y estudiantes");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Actualizar estudiante");
            System.out.println("6. Eliminar estudiante");
            System.out.println("7. Buscar profesor");
            System.out.println("8. Actualizar profesor");
            System.out.println("9. Eliminar profesor");
            System.out.println("10. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Visualizer.imprimirDetallesProfesores(profesores);
                    break;
                case 2:
                    Visualizer.imprimirDetallesEstudiantes(estudiantes);
                    break;
                case 3:
                    Visualizer.imprimirDetallesEstudiantesYProfesores(estudiantes, profesores);
                    break;
                case 4:
                    System.out.println("Ingrese el número de identificación del estudiante a buscar:");
                    String idEstudianteBuscar = scanner.next();
                    Estudiante estudianteEncontrado = controladorEstudianteyProfesor.buscarEstudiante(idEstudianteBuscar, estudiantes);
                    if (estudianteEncontrado != null) {
                        System.out.println("Estudiante encontrado: " + estudianteEncontrado.getNombre());
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el número de identificación del estudiante a actualizar:");
                    String idEstudianteActualizar = scanner.next();
                    Estudiante estudianteActualizar = controladorEstudianteyProfesor.buscarEstudiante(idEstudianteActualizar, estudiantes);
                    if (estudianteActualizar != null) {
                        estudianteActualizar.actualizarEstudianteDesdeConsola(estudianteActualizar,scanner);
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el número de identificación del estudiante a eliminar:");
                    String idEstudianteEliminar = scanner.next();
                    controladorEstudianteyProfesor.eliminarEstudiante(idEstudianteEliminar, estudiantes);
                    break;
                case 7:
                    System.out.println("Ingrese el número de identificación del profesor a buscar:");
                    String idProfesorBuscar = scanner.next();
                    Profesor profesorEncontrado = controladorEstudianteyProfesor.buscarProfesor(idProfesorBuscar, profesores);
                    if (profesorEncontrado != null) {
                        System.out.println("Profesor encontrado: " + profesorEncontrado.getNombre());
                    } else {
                        System.out.println("Profesor no encontrado.");
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el número de identificación del profesor a actualizar:");
                    String idProfesorActualizar = scanner.next();
                    Profesor profesorActualizar = controladorEstudianteyProfesor.buscarProfesor(idProfesorActualizar, profesores);
                    if (profesorActualizar != null) {
                        profesorActualizar.actualizarProfesorDesdeConsola(profesorActualizar,scanner);
                    } else {
                        System.out.println("Profesor no encontrado.");
                    }
                    break;
                case 9:
                    System.out.println("Ingrese el número de identificación del profesor a eliminar:");
                    String idProfesorEliminar = scanner.next();
                    controladorEstudianteyProfesor.eliminarProfesor(idProfesorEliminar, profesores);
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }
}


	
