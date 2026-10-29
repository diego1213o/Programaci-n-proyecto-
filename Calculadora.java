import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("pon el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("pon el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("elije una operación (+, -, *, /):");
        String operacion = scanner.next();
        double resultado;

        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error.");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                scanner.close();
                return;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}