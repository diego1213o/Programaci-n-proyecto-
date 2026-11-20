
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
             System.out.println("Tu Vida: " + vidaHeroe);
              System.out.println("Enemigo: " + enemigos[numeroEnemigo]);
             System.out.println("Vida enemigo: " + vidaEnemigos[numeroEnemigo]);
            System.out.println("1. Atacar");
            System.out.println("2. Usar pocion");
           System.out.println("3. Consultar inventario");
         System.out.println("4. Abandonar partida");
         System.out.print("Elige una opcion: ");
         int opcionCombate = sc.nextInt();
          boolean turnoValido = false;
        switch (opcionCombate) {
         case 1:
             int danoHeroe = (int)(Math.random() * 11) + 10;
              vidaEnemigos[numeroEnemigo] -= danoHeroe;
            if (vidaEnemigos[numeroEnemigo] < 0) vidaEnemigos[numeroEnemigo] = 0;
             System.out.println("Has atacado");
             System.out.println("Dano causado: " + danoHeroe);
           turnoValido = true;
            break;
             case 2:
         if (pocionesDisponibles > 0) {
         if (vidaHeroe < 100) {
         int curacion = pociones[pocionesDisponibles - 1];
         vidaHeroe += curacion;
         if (vidaHeroe > 100) vidaHeroe = 100;
        pocionesDisponibles--;
        System.out.println("Has usado una pocion");
        System.out.println("Vida actual: " + vidaHeroe);
        System.out.println("Pociones restantes: " + pocionesDisponibles);
        turnoValido = true;
        } else System.out.println("Tienes la vida completa");
        } else System.out.println("No tienes pociones");
        break;
        case 3:
        System.out.println("Tu Inventario");
        System.out.println("Pociones: " + pocionesDisponibles);
         if (pocionesDisponibles > 0) {
        for (int i = 0; i < pocionesDisponibles; i++)
       System.out.println("Pocion " + (i + 1) + ": " + pociones[i] + " de vida");
        } else System.out.println("No tienes pociones");
         break; case 4:
        System.out.println("Has abandonado la partida");
        abandonar = true;
        break;
        default:
        System.out.println("Opcion no valida");
        break;
                 }
                  if (turnoValido && vidaEnemigos[numeroEnemigo] > 0) {
                                int danoEnemigo = (int)(Math.random() * 11) + 5;
                                vidaHeroe -= danoEnemigo;
                                if (vidaHeroe < 0) vidaHeroe = 0;
                                System.out.println("El enemigo te ha atacado");
                                System.out.println("Dano recibido: " + danoEnemigo);
                                System.out.println("Vida restante: " + vidaHeroe);
                 }
                        }
                        if (vidaEnemigos[numeroEnemigo] == 0) {
                            System.out.println("Has derrotado a " + enemigos[numeroEnemigo]);
                            puntuacion += 100;
                            System.out.println("Puntuacion: " + puntuacion);
                        }
                        numeroEnemigo++;
    }

                     System.out.println("Bien cabeza has ganado");
                     if (vidaHeroe == 0) {
                        System.out.println("GG pa el lobby");
                    } else if (abandonar) {
                        System.out.println("Has abandonado");
                    } else if (numeroEnemigo == 3) {
                        puntuacion += vidaHeroe;
                        System.out.println("Has ganado");
                        System.out.println("Vida restante: " + vidaHeroe);

                        System.out.println("Quieres volver a jugar?");
                        System.out.println("1. Si");
                        System.out.println("2. No");
                        System.out.print("Elige una opcion: ");
                        otraPartida = sc.nextInt();

                        if (otraPartida == 1) {
                            abandonar = false;
                        } else if (otraPartida == 2) {
                            System.out.println("No");
                            opcion = 4;
                        }
                    }
                    System.out.println("Enemigos derrotados: " + (puntuacion / 100));
                    System.out.println("Puntuacion final: " + puntuacion);
                    break;
                case 2:
                    System.out.println("Viendo el Ranking");
                    break;
                case 3:
                    System.out.println("AYUDA");
            System.out.println("Derrota a los tres enemigos");
                    System.out.println("Atacar causa entre 10 y 20 de dano");                    
                System.out.println("Las pociones recuperan 25 de vida");
                System.out.println("Puedes consultar el inventario");
                System.out.println("Puedes abandonar la partida");
                System.out.println("El Raking es una tortura de hacer");
                break;
            case 4:
                    System.out.println("Saliendo del juego");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }
}
