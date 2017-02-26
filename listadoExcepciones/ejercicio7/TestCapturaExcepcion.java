package listadoExcepciones.ejercicio7;

/**
 * El siguiente código lanza una excepción. Captúrala (try/catch) y haz un
 * System.out.println() de los siguientes métodos de la excepción capturada:
 * getMessage(), getCause(), getLocalizedMessage(), toString().Realiza las
 * siguientes actividades:
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class TestCapturaExcepcion {
	public static void main(String[] args) {
		try {
			int dividendo = 7;
			int divisor = 0;
			int cociente = dividendo / divisor;
		} catch (ArithmeticException e) {
			System.out.println("e.getMessage() = " + e.getMessage());
			System.out.println("e.getCause() = " + e.getCause());
			System.out.println("e.getLocalizedMessage() = " + e.getLocalizedMessage());
			System.out.println("e.toString() = " + e.toString());
		}

		System.out.println("Aaaaaaaaadios");
	}
}
