public class Personake {
  private  String nombre;
    private int edad;
    private float altura;
    private String cortePelo;  
    private String pelicula;
    private int vida;
    private int nivel;

    public Personake(String nombre, int edad, float altura, String cortePelo, String pelicula, int vida, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.cortePelo = cortePelo;
        this.pelicula = pelicula;
        this.vida = vida;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarDatos() {    
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Corte de pelo: " + cortePelo);
        System.out.println("Película: " + pelicula);
        System.out.println("Vida: " + vida);
        System.out.println("Nivel: " + nivel);
    }
}


