
import java.util.Scanner;

public class proyectoexamen2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vidaHeroe = 100;
        int vidaEnemigo = 40;
        int pociones = 3;
        int nivelHeroe = 1;
        int experiencia = 0;

        System.out.println("El despertar del heroe");
        System.out.println("1. Nueva partida");
        System.out.println("2. Ranking");
        System.out.println("3. Salir");
        System.out.print("Elige una opcion: ");

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                

                System.out.println("Comienza la aventura");
                System.out.println("Vida del heroe: " + vidaHeroe);
                System.out.println("Pociones: " + pociones);
                System.out.println("Un monstruo ha aparecido");

                

                while (vidaHeroe > 0 && vidaEnemigo > 0) {

                    System.out.println("Elige que hacer:");
                    System.out.println("1. Atacar");
                    System.out.println("2. Beber pocion");

                    int opcionCombate = sc.nextInt();
                    boolean turnoHeroe = false;

                    if (opcionCombate == 1) {

                        int dañoHeroe = (int) (Math.random() * 20) + 10;

                        vidaEnemigo = vidaEnemigo - dañoHeroe;
                        turnoHeroe = true;

                        System.out.println("Has atacado e infligido " + dañoHeroe + " de daño.");
                        System.out.println("Vida del monstruo: " + Math.max(vidaEnemigo, 0));

                    } else if (opcionCombate == 2) {

                        if (pociones > 0) {

                            vidaHeroe = Math.min(vidaHeroe + 20, 100);
                            pociones--;
                            turnoHeroe = true;

                            System.out.println("Has bebido una pocion");
                            System.out.println("Tu vida ahora es: " + vidaHeroe);
                            System.out.println("Pociones restantes: " + pociones);

                        } else {

                            System.out.println("No te quedan pociones");

                        }

                    } else {

                        System.out.println("Opcion de combate no valida");

                    }

                    if (turnoHeroe && vidaEnemigo > 0) {
                        int dañoEnemigo = (int) (Math.random() * 8) + 5;
                        vidaHeroe -= dañoEnemigo;
                        System.out.println("El monstruo te ataca y te quita " + dañoEnemigo + " de vida.");
                        System.out.println("Tu vida actual: " + Math.max(vidaHeroe, 0));
                    }

                }

            

                if (vidaHeroe <= 0) {

                    System.out.println("Has perdido la partida");

                } else { System.out.println("¡Has derrotado al primer monstruo!");

                    System.out.println("Has derrotado al primer monstruo");

                    experiencia = experiencia + 50;

                    System.out.println("Experiencia conseguida: " + experiencia);

                    if (experiencia >= 100) {

                        nivelHeroe = nivelHeroe + 1;
                        experiencia = 0;

                        System.out.println("Has subido de nivel");
                        System.out.println("Tu nivel actual es: " + nivelHeroe);

                    }

                

                    int vidaMonstruo2 = 60;

                    System.out.println("¡Un segundo monstruo ha aparecido!");
                    System.out.println("Vida del segundo monstruo: " + vidaMonstruo2);

                    while (vidaHeroe > 0 && vidaMonstruo2 > 0) {

                        System.out.println("¿Que quieres hacer?");
                        System.out.println("1. Atacar");
                        System.out.println("2. Beber pocion");

                        int opcionSegundoCombate = sc.nextInt();
                        boolean turnoHeroe = false;

                        if (opcionSegundoCombate == 1) {

                            vidaMonstruo2 = vidaMonstruo2 - 15;
                            turnoHeroe = true;

                            System.out.println("Has atacado al segundo monstruo");
                            System.out.println("Vida del monstruo: " + Math.max(vidaMonstruo2, 0));

                        } else if (opcionSegundoCombate == 2) {

                            if (pociones > 0) {

                                vidaHeroe = Math.min(vidaHeroe + 20, 100);
                                pociones--;
                                turnoHeroe = true;

                                System.out.println("Has bebido una pocion");
                                System.out.println("Tu vida actual es: " + vidaHeroe);
                                System.out.println("Pociones restantes: " + pociones);

                            } else {

                                System.out.println("No te quedan pociones");

                            }

                        } else { 

                            System.out.println("Opcion no valida");

                        }

                        if (turnoHeroe && vidaMonstruo2 > 0) {
                            int dañoEnemigo = (int) (Math.random() * 8) + 8;
                            vidaHeroe -= dañoEnemigo;
                            System.out.println("El segundo monstruo te ataca y te quita " + dañoEnemigo + " de vida.");
                            System.out.println("Tu vida actual: " + Math.max(vidaHeroe, 0));
                        }

                    }

                    

                    if (vidaHeroe <= 0) {

                        System.out.println("Has perdido la partida");

                    } else {

                        System.out.println("¡Has derrotado al segundo monstruo!");
                        experiencia = experiencia + 50;

                        System.out.println("Experiencia total: " + experiencia);

                        if (experiencia >= 100) {

                            nivelHeroe = nivelHeroe + 1;
                            experiencia = 0;

                            System.out.println("¡Has subido de nivel!");
                            System.out.println("Tu nivel actual es: " + nivelHeroe);

                        }

                        System.out.println("¡ENHORABUENA! Has completado los 2 primeros combates");
                        System.out.println("Ultimo jefe quieres enfrentarte a el? (1. Si / 2. No)");
                        int opcionUltimoJefe = sc.nextInt();
                        switch (opcionUltimoJefe) {
                            case 1:
                                int vidaJefe = 100;
                                System.out.println("¡El jefe final aparece! Tiene " + vidaJefe + " puntos de vida.");

                                while (vidaHeroe > 0 && vidaJefe > 0) {
                                    System.out.println("Tu vida: " + vidaHeroe + " | Vida del jefe: " + vidaJefe);
                                    System.out.println("1. Atacar");
                                    System.out.println("2. Beber pocion");

                                    int opcionCombateJefe = sc.nextInt();
                                    boolean turnoHeroe = false;

                                    if (opcionCombateJefe == 1) {
                                        int dañoHeroe = (int) (Math.random() * 20) + 15;
                                        vidaJefe -= dañoHeroe;
                                        turnoHeroe = true;
                                        System.out.println("Atacas al jefe e infliges " + dañoHeroe + " de daño.");
                                    } else if (opcionCombateJefe == 2) {
                                        if (pociones > 0) {
                                            vidaHeroe = Math.min(vidaHeroe + 20, 100);
                                            pociones--;
                                            turnoHeroe = true;
                                            System.out.println("Has bebido una pocion. Tu vida ahora es: " + vidaHeroe);
                                            System.out.println("Pociones restantes: " + pociones);
                                        } else {
                                            System.out.println("No te quedan pociones");
                                        }
                                    } else {
                                        System.out.println("Opcion de combate no valida");
                                    }

                                    if (turnoHeroe && vidaJefe > 0) {
                                        int dañoJefe = (int) (Math.random() * 8) + 10;
                                        vidaHeroe -= dañoJefe;
                                        System.out.println("El jefe te ataca y te quita " + dañoJefe + " de vida.");
                                        System.out.println("Tu vida actual: " + Math.max(vidaHeroe, 0));
                                    }
                                }

                                if (vidaHeroe <= 0) {
                                    System.out.println("El jefe final te ha derrotado. Has perdido la partida.");
                                } else {
                                    System.out.println("¡Has derrotado al jefe final! ¡Has completado la aventura!");
                                }
                                break;
                            case 2:
                                System.out.println("Decidiste no enfrentarte al último jefe.");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }

                    }

                }

                break;

            case 2:

                System.out.println("Viendo el Ranking");

                break;

            case 3:

                System.out.println("Saliendo del juego");

                break; default:

                System.out.println("Opcion no valida");
                
                break;

        }

        sc.close();
        System.out.println("prueba de juego finalizada");
        java.awt.Toolkit.getDefaultToolkit().beep();
    }
}