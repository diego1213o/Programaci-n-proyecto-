import java.util.Scanner;

public class ejercicionumeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
		}

		System.out.println("Tabla completada.");

		System.out.print("Cuantos numeros de Fibonacci quieres mostrar: ");
		int n = teclado.nextInt();
		int primero = 1;
		int segundo = 1;

		for (int posicion = 1; posicion <= n; posicion++) {
			System.out.print(primero + " ");
			int siguiente = primero + segundo;
			primero = segundo;
			segundo = siguiente;
		}

		System.out.println();
		System.out.println("Serie de Fibonacci completada.");

		System.out.println("Arbol de " + n + " lineas:");
		for (int linea = 1; linea <= n; linea++) {
			for (int asterisco = 1; asterisco <= linea; asterisco++) {
				System.out.print("*");
			}
			System.out.println();
		}

		teclado.close();
	}
}
