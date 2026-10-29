public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void saludar(String nombreASaludar) {
        System.out.println("Hola " + nombreASaludar + ", mi nombre es " + nombre + ".");
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void respirar() {
        System.out.println(nombre + " está respirando.");
    }

    public void correr(int distancia) {
        System.out.println(nombre + " está corriendo " + distancia + " metros.");
    }

    public void saltar() {
        System.out.println(nombre + " está saltando.");
    }
}
