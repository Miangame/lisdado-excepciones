package listadoExcepciones.ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * El siguiente código utiliza la clase Scanner para la lectura desde el teclado
 * <ul>
 * <li>a. Indica la excepción que se lanza al introducir una letra en vez de un
 * entero</li>
 * <li>b. Captura la excepción para que el usuario sólo pueda introducir un
 * valor válido. Muestra el mensaje de error mediante System.err.println(""); El
 * programa no finalizará hasta que e l usuario introduzca un valor válido.
 * Quizás tengas que utilizar la sentencia scanner.nextLine();</li>
 * </ul>
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class TestScanner {
	private static Scanner scanner;

	/**
	 * Probando la clase Scanner
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		boolean comprobar = true;
		do {
			try {
				System.out.println("Introduce un entero: ");
				System.out.println(scanner.nextInt());
				comprobar = false;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.err.println("\nError al introducir un número\n");
			}
		} while (comprobar);
	}
}