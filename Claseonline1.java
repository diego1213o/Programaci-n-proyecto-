public class Claseonline1 {
    public class matriz {

    public static void main(String[] args) {

        int[][] matriz = {
            {10, 5, 2},
            {4, 1, 3},
            {2, 8, 1}
        };

        for (int i = 0; i < 3; i++) {

            int suma = 0;

            for (int j = 0; j < 3; j++) {
                suma = suma + matriz[i][j];
            }

            System.out.println("Suma de la fila " + i + ": " + suma);
        }

        for (int j = 0; j < 3; j++) {

            int resta = matriz[0][j];

            for (int i = 1; i < 3; i++) {
                resta = resta - matriz[i][j];
            }

            System.out.println("Resta de la columna " + j + ": " + resta);
        }
    }
}
}
