package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
	/*
	 * ENTRADA:
	 * 
	 * (Caso 1)
	 * 5
	 * 
	 * (Caso 2)
	 * hola
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * (Caso 1)
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 * 
	 * 
	 * SALIDA OBTENIDA:
	 * 
	 * (Caso 1)
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// Creamos la variable que le pediremos al usuario.
		int numUser = 0;

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);

		// Creamos un bucle do-while que se repita hasta que los valores sean
		// modificados.
		do {
			// Creamos un bloque de código que puede ser susceptible a errores de input.
			try {
				// Le pedimos los valores al usuario.
				System.out.print("Introduce un número entero del 1 al 20: ");
				numUser = sc.nextInt();

				if (numUser <= 0 || numUser > 20)
					System.out.println("Has introducido un valor fuera del rango." + "\n"
							+ "Recuerda que debes introducir un valor entre el 1 y el 20.");

				// Si ves que hay un valor que no es válido...
			} catch (InputMismatchException e) {
				// Imprime este mensaje.
				System.err.println("Error. Has introducido un valor no válido. Vuelve a introducir el valor.");
				sc.next();
			} // Fin bloque try-catch.
		} while (numUser == 0 && (numUser <= 0 || numUser > 20)); // Fin bloque do-while.

		// Creamos el correspondiente texto.

		/* Primero creamos un bucle de filas de los números a imprimir. */
		for (int i = 0; i <= numUser; i++) {

			// Y luego imprime las columnas.
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			} // Fin segundo bloque for.

			// Al final de cada fila, imprime una línea nueva.
			System.out.println();
		} // Fin primer bloque for.

		// Cerramos el Scanner.
		sc.close();

	}

}
