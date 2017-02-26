package listadoExcepciones.ejercicio11;

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

	public static MiScanner getScanner() {
		if (miScanner == null)
			miScanner = new MiScanner();
		return miScanner;
	}

	private MiScanner() {
		scanner = new Scanner(System.in);
	}

	int nextInt() {
		return scanner.nextInt();
	}

	double nextDouble() {
		return scanner.nextDouble();
	}

	String nextLine() {
		return scanner.nextLine();
	}
}
