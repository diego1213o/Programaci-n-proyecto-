import java.util.Scanner;

public class claseonline2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos alumnos hay en la clase?: ");
        int alumnos = sc.nextInt();

        double suma = 0;
        double maxima = 0;
        double minima = 10;
        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < alumnos; i++) {
            double nota;

            do {
                System.out.print("Introduce la nota " + (i + 1) + ": ");
                nota = sc.nextDouble();

                if (nota < 0.0 || nota > 10.0) {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } while (nota < 0.0 || nota > 10.0);

            suma += nota;

            if (nota >= 5.0) {
                aprobados++;
            } else {
                suspensos++;
            }

            if (nota > maxima) {
                maxima = nota;
            }

            if (nota < minima) {
                minima = nota;
            }
        }

        double media = (alumnos > 0) ? suma / alumnos : 0;

        System.out.println("Nota media: " + media);
        System.out.println("Nota máxima: " + maxima);
        System.out.println("Nota mínima: " + minima);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Total suspensos: " + suspensos);

        sc.close();
    }
}
