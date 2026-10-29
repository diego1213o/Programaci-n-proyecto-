public class matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 1 + (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
