
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

