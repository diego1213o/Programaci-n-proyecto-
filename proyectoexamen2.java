import java.util.Scanner;

public class proyectoexamen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("El despertar del héroe");
        System.out.println("1. Nueva partida");
        System.out.println("2. Ranking");
        System.out.println("3. Salir");
        System.out.print("Elige una opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Comienza la aventura");
                System.out.println("Vida del heroe: 100");
                System.out.println("Pociones: 3");
                 System.out.print("Elige una opcion:");
                 System.out.println("1. Atacar");
                System.out.println("2. Beber pocion");

                break;
                

            case 2:
                System.out.println("Viendo el Ranking");
                break;

            case 3:
                System.out.println("Saliendo del juego");
                break;

            default:
                System.out.println("Opcion no valida");
                break;
        }

        sc.close();
    }
}
