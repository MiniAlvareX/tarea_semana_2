class Profesor extends Persona {
    private String especialidad;
    private static int cantidadProfesores = 0;
    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
        cantidadProfesores++;
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("El profesor " + nombre +
                        " es especialista en " + especialidad);
    }
    public static void mostrarCantidadProfesores() {
        System.out.println("Cantidad de profesores: "
                        + cantidadProfesores);
    }
}