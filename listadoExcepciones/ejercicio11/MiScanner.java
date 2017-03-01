package listadoExcepciones.ejercicio11;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Clase MiScanner que es un envoltorio de la clase java.util.Scanner. Usa el
 * patrón de diseño singleton, que provee una única instancia global mediante un
 * método de clase
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class MiScanner {
	private Scanner scanner;
	private static MiScanner miScanner;

	private MiScanner() {
		scanner = new Scanner(System.in);
	}

	public static MiScanner getScanner() {
		if (miScanner == null)
			miScanner = new MiScanner();
		return miScanner;
	}

	/**
	 * Lee un entero válido por teclado
	 * 
	 * @return Entero válido introducido por teclado.
	 */
	public int leerEntero() {
		do {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				scanner.nextLine();
				System.err.println("\nError al introducir un número\n");
			}
		} while (true);

	}

	/**
	 * Lee un entero válido introducido por teclado
	 * 
	 * @param msg
	 *            Mensaje para mostrar antes de leer por teclado
	 * @return Entero válido
	 */
	public int leerEntero(String msg) {
		System.out.print(msg);
		return leerEntero();
	}

	/**
	 * Lee un decimal válido por teclado
	 * 
	 * @return Decimal válido introducido por teclado.
	 */
	public double leerDecimal() {
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
	public double leerDecimal(String msg) {
		System.out.print(msg);
		return leerDecimal();
	}

	/**
	 * Lee un carácter válido por teclado
	 * 
	 * @return Carácter válido introducido por teclado.
	 */
	public char leerCaracter() {

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
	public char leerCaracter(String msg) {
		System.out.print(msg);
		return leerCaracter();
	}

	/**
	 * Lee una cadena válida por teclado
	 * 
	 * @return Cadena válida introducida por teclado.
	 */
	public String leerCadena() {

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
	public String leerCadena(String msg) {
		System.out.println(msg);
		return leerCadena();
	}
}
