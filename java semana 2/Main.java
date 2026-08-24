public class Main {
    public static void main(String[] args) {
        SistemaGestion sistema = new SistemaGestion();
        Estudiante estudiante1 =
                new Estudiante("John", "2025001234");
        Profesor profesor1 =
                new Profesor("Hector", "LP 3");
        Curso curso1 =
                new Curso("LP 3", "LP 3");
        sistema.agregarEstudiante(estudiante1);
        sistema.agregarProfesor(profesor1);
        sistema.agregarCurso(curso1);
        curso1.asignarProfesor(profesor1);
        estudiante1.inscribirse(curso1);
        Persona persona1 = estudiante1;
        persona1.mostrarInformacion();
        System.out.println("\nInformación de curso:");
        curso1.mostrarInformacion();
        System.out.println();
        sistema.mostrarCursosDisponibles();
        System.out.println();
        Estudiante.mostrarCantidadEstudiantes();
        Profesor.mostrarCantidadProfesores();
    }
}