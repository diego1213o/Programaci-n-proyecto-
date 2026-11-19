
import java.util.Scanner;

public class proyectoexamen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            
            System.out.println("El despertar del heroe");
            System.out.println("1. Nueva partida");
            System.out.println("2. Ranking");
            System.out.println("3. Ayuda");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
         String nombreHeroe;
            do {
          System.out.print("Nombre del heroe: ");
           nombreHeroe = sc.nextLine();
          if (nombreHeroe.isEmpty()) System.out.println("El nombre no puede estar vacio");
         } while (nombreHeroe.isEmpty());

        int vidaHeroe = 100, pocionesDisponibles = 3, puntuacion = 0, numeroEnemigo = 0;
         int[] pociones = {25, 25, 25};
        String[] enemigos = {"Antonio recio", "El Chrumbel","El Ranking"};
        int[] vidaEnemigos = {40, 60, 80};
         boolean abandonar = false;
         int otraPartida;

        System.out.println("Comienza la partida");
         System.out.println("Vida: " + vidaHeroe);
         System.out.println("Pociones: " + pocionesDisponibles);

         while (numeroEnemigo < 3 && vidaHeroe > 0 && !abandonar) {
         System.out.println("Enemigo: " + enemigos[numeroEnemigo]);
         System.out.println("Vida del enemigo: " + vidaEnemigos[numeroEnemigo]);
          while (vidaHeroe > 0 && vidaEnemigos[numeroEnemigo] > 0 && !abandonar) {
           System.out.println("COMBATE");
             System.out.println("Heroe: " + nombreHeroe);
             