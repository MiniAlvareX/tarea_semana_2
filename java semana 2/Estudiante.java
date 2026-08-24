class Estudiante extends Persona implements Inscribible {
    private String codigo;
    private static int cantidadEstudiantes = 0;

    public Estudiante(String nombre, String codigo) {
        super(nombre);
        this.codigo = codigo;
        cantidadEstudiantes++;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("El estudiante " + nombre +
                        " tiene el código " + codigo);
    }
    @Override
    public void inscribirse(Curso curso) {
        curso.agregarEstudiante(this);
        System.out.println(nombre + " se inscribió en " + curso.getNombre());
    }
    public static void mostrarCantidadEstudiantes() {
        System.out.println("Cantidad de estudiantes: "
                        + cantidadEstudiantes);
    }
}