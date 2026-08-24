import java.util.ArrayList;
class Curso {
    public static final int CAPACIDAD_MAXIMA = 30;
    private String nombre;
    private String categoria;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;
    public Curso(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        estudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < CAPACIDAD_MAXIMA) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("El curso está lleno");
        }
    }
    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public String getNombre() {
        return nombre;
    }
    public void mostrarInformacion() {
        System.out.println("Curso: " + nombre);
        System.out.println("Categoría: " + categoria);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.nombre);
        }
        System.out.println("Estudiantes matriculados: "
                        + estudiantes.size());
        System.out.println("Capacidad máxima: "
                        + CAPACIDAD_MAXIMA);
    }
    public boolean estaDisponible() {
        return estudiantes.size() < CAPACIDAD_MAXIMA;
    }
}