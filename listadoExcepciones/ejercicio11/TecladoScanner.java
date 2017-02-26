package listadoExcepciones.ejercicio11;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Clase TecladoScanner que es un envoltorio de la clase MiScanner que usa el
 * patrón de diseño Singleton
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class TecladoScanner {
	static MiScanner scanner = MiScanner.getScanner();

	/**
	 * Lee un entero válido por teclado
	 * 
	 * @return Entero válido introducido por teclado.
	 */
	public static int leerEntero() {
		int num;
		boolean comprobar = true;
		do {
			try {
				num = scanner.nextInt();
				comprobar = false;
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.err.println("\nError al introducir un número\n");
				num = 0;
			}
		} while (comprobar);

		return num;
	}

	/**
	 * Lee un entero válido introducido por teclado
	 * 
	 * @param msg
	 *            Mensaje para mostrar antes de leer por teclado
	 * @return Entero válido
	 */
	public static int leerEntero(String msg) {
		System.out.print(msg);
		return leerEntero();
	}

	/**
	 * Lee un decimal válido por teclado
	 * 
	 * @return Decimal válido introducido por teclado.
	 */
	public static double leerDecimal() {
		double num;
		boolean comprobar = true;
		do {
			try {
				num = scanner.nextDouble();
				comprobar = false;
			} catch (Exception e) {
				scanner.nextLine();
				System.err.print("\nError al introducir un decimal\n");
				num = 0;
			}
		} while (comprobar);

		return num;
	}

	/**
	 * Lee un decimal válido por teclado
	 * 
	 * @param msg
	 *            Mensaje para mostrar antes de leer por teclado
	 * @return Decimal válido introducido por teclado.
	 */
	public static double leerDecimal(String msg) {
		System.out.print(msg);
		return leerDecimal();
	}

	/**
	 * Lee un carácter válido por teclado
	 * 
	 * @return Carácter válido introducido por teclado.
	 */
	public static char leerCaracter() {

		char caracter = 0;
		boolean comprobar = true;
		do {
			try {
				caracter = scanner.nextLine().charAt(0);
				comprobar = false;
			} catch (IndexOutOfBoundsException e) {
				scanner.nextLine();
				System.err.println("\nError al introducir un carácter\n");

			}
		} while (comprobar);

		return caracter;
	}

	/**
	 * Lee un carácter válido por teclado
	 * 
	 * @param msg
	 *            Mensaje para mostrar antes de leer por teclado
	 * @return Carácter válido introducido por teclado.
	 */
	public static char leerCaracter(String msg) {
		System.out.print(msg);
		return leerCaracter();
	}

	/**
	 * Lee una cadena válida por teclado
	 * 
	 * @return Cadena válida introducida por teclado.
	 */
	public static String leerCadena() {

		String cadena;
		boolean comprobar = true;
		do {
			try {
				cadena = scanner.nextLine();
				comprobar = false;
			} catch (NoSuchElementException e) {
				scanner.nextLine();
				System.err.println("\nError al introducir una cadena\n");
				cadena = "";
			}
		} while (comprobar);

		return cadena;
	}

	/**
	 * Lee una cadena válido por teclado
	 * 
	 * @param msg
	 *            Mensaje para mostrar antes de leer por teclado
	 * @return Cadena válida introducida por teclado.
	 */
	public static String leerCadena(String msg) {
		System.out.println(msg);
		return leerCadena();
	}
}
