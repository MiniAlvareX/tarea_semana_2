import java.util.ArrayList;
class SistemaGestion {
    public static final String NOMBRE_SISTEMA =
            "Sistema de Gestión de Cursos Universitarios";
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;
    public SistemaGestion() {
        estudiantes = new ArrayList<>();
        profesores = new ArrayList<>();
        cursos = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }
    public void mostrarCursosDisponibles() {
        System.out.println("\nCursos disponibles:");
        for (Curso curso : cursos) {
            if (curso.estaDisponible()) {
                System.out.println("- " + curso.getNombre());
            }
        }
    }
}