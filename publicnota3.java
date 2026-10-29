public class publicnota3 {
    public static void main(String[] args) {
        int nota = 0;

        if (nota <0 || nota >10) {
            System.out.println("La nota no es válida");
        } else if (nota < 5) {
            System.out.println("no es posible");
        } else if (nota >=5 && nota < 6) {
            System.out.println("suficdeiente");
        } else if (nota >=6 && nota < 7) {
            System.out.println("bien");
        } else if (nota >=7 && nota < 9) {
            System.out.println("notable");
        } else if (nota >=9 && nota < 10) {
            System.out.println("sobresaliente");
        }
            
        }
}

