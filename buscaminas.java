import java.util.Scanner;

public class buscaminas {

    public static void main(String[] args) {

        System.out.println("Estas en el Buscaminas");
        System.out.println("Tienes 2 Vidas");
        Scanner sc = new Scanner(System.in);

        boolean[][] Bombas = new boolean[5][5];
        boolean[][] Descubiertas = new boolean[5][5];
        int cantidadBombas = 0;
        int cantidadDescubiertas = 0;

        while (cantidadBombas < 5) {
            int filaAleatoria = (int) (Math.random() * 5);
            int columnaAleatoria = (int) (Math.random() * 5);

            if (!Bombas[filaAleatoria][columnaAleatoria]) {
                Bombas[filaAleatoria][columnaAleatoria] = true;
                cantidadBombas++;
            }
        }

        boolean sigueVivo = true;
        int vidas = 2;

        while (sigueVivo) {
            System.out.print("Elige una fila (0-4): ");
            int fila = sc.nextInt();

            System.out.print("Elige una columna (0-4): ");
            int columna = sc.nextInt();

            if (fila < 0 || fila >= 5 || columna < 0 || columna >= 5) {
                System.out.println("Posicion fuera del tablero.");
                continue;
            }

            if (Descubiertas[fila][columna]) {
                System.out.println("Punto ya tomado.");
                continue;
            }

            if (Bombas[fila][columna]) {
                vidas--;
                Descubiertas[fila][columna] = true;
                System.out.println("Boom");
                System.out.println("Cabeza por favor te queda " + vidas + " vida.");

                if (vidas == 0) {
                      System.out.println("Te dije que tenias que tener cabeza, te quedas sin vida.");
                    sigueVivo = false;
                }
            } else {
                System.out.println("Seguro.");
                Descubiertas[fila][columna] = true;
                cantidadDescubiertas++;
                if (cantidadDescubiertas == 20) {
                    System.out.println("¡Has ganado!");
                    sigueVivo = false;
                }

            }

            System.out.println("\nTablero:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (Bombas[i][j] && (!sigueVivo || Descubiertas[i][j])) {
                        System.out.print("B ");
                    } else if (Descubiertas[i][j]) {
                        System.out.print("X ");
                    } else {
                        System.out.print(". ");
                    }   
                }
                System.out.println();
            
            }

            if (!sigueVivo) {
                if (cantidadDescubiertas < 20) {
                    System.out.println("Muerto pa casa.");
                }
    
            }
        }
        sc.close();
    
    }
    }
