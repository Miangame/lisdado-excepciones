package listadoExcepciones.ejercicio11;

import utiles.Menu;

/**
 * Crea la clase TecladoScanner para la lectura de datos desde el teclado. Para
 * ello, crea la clase TestScannerConMenu que compruebe todas las lecturas. La
 * clase TecladoScanner d ispondrá de:
 * <ul>
 * <li>a. Una propiedad scanner para la lectura desde teclado (flujo
 * System.in)</li>
 * <li>b. Método leerEntero() que devuelva un entero válido introducido por el
 * usuario.</li>
 * <li>c. Método leerDecimal() que devuelva un decimal válido introducido por el
 * usuario .</li>
 * <li>d. Método leerCaracter() que devuelva un carácter válido introducido por
 * el usuario.</li>
 * <li>e. Método leerCadena() que devuelva una cadena introducida por el
 * usuario.</li>
 * <li>f. Todos los métodos estarán sobrecargados con un argumento de tipo
 * String para mostrar lo como mensaje previo a la lectura .</li>
 * <li>g. ¿Puede utilizarse el patrón de diseño Singleton? Si es así,
 * úsalo.</li>
 * </ul>
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class TestScannerConMenu {
	public static void main(String[] args) {
		String[] opciones = { "Leer entero", "Leer decimal", "Leer caracter", "Leer cadena", "Salir" };
		Menu menu = new Menu("---Test menú---", opciones);

		int opcion;

		do {
			opcion = menu.gestionar();
			switch (opcion) {
			case 1:
				MiScanner scanner = MiScanner.getScanner();
				System.out.println(scanner.leerEntero("Introduzca un entero: "));
				break;

			case 2:
				MiScanner scanner2 = MiScanner.getScanner();
				System.out.println(scanner2.leerDecimal("Introduzca un decimal: "));
				break;

			case 3:
				MiScanner scanner3 = MiScanner.getScanner();
				System.out.println(scanner3.leerCaracter("Introduzca un caracter: "));
				break;

			case 4:
				MiScanner scanner4 = MiScanner.getScanner();
				System.out.println(scanner4.leerCadena("Introduzca una cadena: "));
				break;

			default:
				System.out.println("\nSaliendo...");
			}
		} while (opcion != 5);
	}
}
