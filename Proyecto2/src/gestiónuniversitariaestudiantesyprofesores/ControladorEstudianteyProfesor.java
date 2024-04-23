package gestiónuniversitariaestudiantesyprofesores;

public class ControladorEstudianteyProfesor {
    // Operaciones CRUD para Estudiante

    public void agregarEstudiante(Estudiante estudiante, Estudiante[] estudiantes) {
        // Verificar si el arreglo de estudiantes está lleno
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] == null) {
                estudiantes[i] = estudiante;
                System.out.println("Estudiante agregado exitosamente.");
                return;
            }
        }
        System.out.println("No se pudo agregar el estudiante. El arreglo de estudiantes está lleno.");
    }

    public Estudiante buscarEstudiante(String numeroIdentificacion, Estudiante[] estudiantes) {
        // Buscar al estudiante por su número de identificación
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                return estudiante;
            }
        }
        System.out.println("Estudiante no encontrado.");
        return null;
    }

    public void actualizarEstudiante(Estudiante estudianteActualizado, Estudiante[] estudiantes) {
        // Actualizar los datos de un estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getNumeroIdentificacion().equals(estudianteActualizado.getNumeroIdentificacion())) {
                estudiantes[i] = estudianteActualizado;
                System.out.println("Estudiante actualizado exitosamente.");
                return;
            }
        }
        System.out.println("No se pudo actualizar el estudiante. Estudiante no encontrado.");
    }

    public void eliminarEstudiante(String numeroIdentificacion, Estudiante[] estudiantes) {
        // Eliminar un estudiante
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null && estudiantes[i].getNumeroIdentificacion().equals(numeroIdentificacion)) {
                estudiantes[i] = null;
                System.out.println("Estudiante eliminado exitosamente.");
                return;
            }
        }
        System.out.println("No se pudo eliminar el estudiante. Estudiante no encontrado.");
    }

    // Operaciones CRUD para Profesor

    public void agregarProfesor(Profesor profesor, Profesor[] profesores) {
        // Verificar si el arreglo de profesores está lleno
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] == null) {
                profesores[i] = profesor;
                System.out.println("Profesor agregado exitosamente.");
                return;
            }
        }
        System.out.println("No se pudo agregar el profesor. El arreglo de profesores está lleno.");
    }

    
    	public Profesor buscarProfesor(String numeroIdentificacion, Profesor[] profesores) {
    	    // Buscar al profesor por su número de identificación
    	    System.out.println("Buscando profesor con identificación: " + numeroIdentificacion);
    	    for (Profesor profesor : profesores) {
    	        if (profesor != null && profesor.getNumeroIdentificacion().equals(numeroIdentificacion)) {
    	            System.out.println("Profesor encontrado: " + profesor.getNombre());
    	            return profesor;
    	        }
    	    }
    	    System.out.println("Profesor no encontrado.");
    	    return null;
    	}
    

    public void actualizarProfesor(Profesor profesorActualizado, Profesor[] profesores) {
        // Actualizar los datos de un profesor
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] != null && profesores[i].getNumeroIdentificacion().equals(profesorActualizado.getNumeroIdentificacion())) {
                profesores[i] = profesorActualizado;
                System.out.println("Profesor actualizado exitosamente.");
                return;
            }
        }
        System.out.println("No se pudo actualizar el profesor. Profesor no encontrado.");
    }

    public void eliminarProfesor(String numeroIdentificacion, Profesor[] profesores) {
        // Eliminar un profesor
        for (int i = 0; i < profesores.length; i++) {
            if (profesores[i] != null && profesores[i].getNumeroIdentificacion().equals(numeroIdentificacion)) {
                profesores[i] = null;
                System.out.println("Profesor eliminado exitosamente.");
                return;
            }
        }
        System.out.println("No se pudo eliminar el profesor. Profesor no encontrado.");
    }
}