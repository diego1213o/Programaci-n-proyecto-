public class juego {
    public static void main(final String[] args) {
        final Personake personaje1 = new Personake("Juan", 25, 1.75f, "Corto", "Acción", 100, 1);
        final Personake personaje2 = new Personake("María", 30, 1.65f, "Largo", "Comedia", 80, 2);

        System.out.println("Datos del personaje 1:");
        personaje1.mostrarDatos();

        System.out.println("\nDatos del personaje 2:");
        personaje2.mostrarDatos();
    }
}
