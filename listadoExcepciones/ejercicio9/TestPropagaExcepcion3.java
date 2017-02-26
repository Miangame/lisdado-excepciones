package listadoExcepciones.ejercicio9;

/**
 * Ejecuta el siguiente código y responde:
 * <ul>
 * <li>a. A continuación aparecen dos pilas de ejecución de métodos, es decir,
 * dos instantáneas de la ejecución. In dica en qué instante se encuentra cada
 * pila :</li>
 * <ul>
 * <li>i. El metodo3 se está ejecutando,</li>
 * <li>ii. El método 3 ha finalizado y devuelve el control al metodo2</li>
 * </ul>
 * <li>b. Realiza una captura del error . Indica qué tipo de excepción es:
 * verificada o no verificada .</li>
 * <li>c. Indica dónde se lanza la excepción</li>
 * <li>d. Indica dónde se captura la excepción</li>
 * <li>e. Modifica el código para que la excepción sea capturada en metodo3
 * mostrando el mensaje “División por cero” . Utiliza el menú “ Código fuente
 * ... ” de Eclipse. Entrégalo en TestPropagaExcepcion 2.</li>
 * <li>f. Modifica el código para que la excepción sea capturada de la misma
 * forma en metodo2. Entrégalo en TestPropag aExcepcion 3.</li>
 * <li>g. Modifica el código para que la excepción sea capturada de la misma
 * forma en el main. Entrégalo en TestPropagaExcepcion 4</li>
 * </ul>
 * 
 * @author Miguel Ángel Gavilán Merino
 *
 */
public class TestPropagaExcepcion3 {
	public static void main(String[] args) {
		metodo1();
	}

	private static void metodo1() {
		try {
			metodo2();
		} catch (ArithmeticException e) {
			System.out.println("Division por cero");
		}

	}

	private static void metodo2() {
		metodo3();
	}

	private static void metodo3() {
		int a = 7 / 0;
	}
}
