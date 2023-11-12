package boletinbucles;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio03 {
	/* 
	 * ENTRADA:
	 * (Caso 1)
	 * 4
	 * 
	 * (Caso 2)
	 * 2.5
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * (Caso 1)
	 * *
	 * **
	 * ***
	 * ****
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 * 
	 * SALIDA OBTENIDA:
	 * 
	 * (Caso 1)
	 * *
	 * **
	 * ***
	 * ****
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 * */
	public static void main(String[] args) {
		// Creamos la variable que le pediremos al usuario.
		int numUser = 0;
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Creamos un bucle do-while que se repita hasta que los valores sean modificados.
		do {
			// Creamos un bloque de código que puede ser susceptible a errores de input.
			try {
				// Le pedimos los valores al usuario.
				System.out.print("Introduce un número entero: ");
				numUser = sc.nextInt();
				
				// Si ves que hay un valor que no es válido...
			} catch(InputMismatchException e) {
				// Imprime este mensaje.
				System.err.println("Error. Has introducido un valor no válido. Vuelve a introducir el valor.");
				sc.next();
			} // Fin bloque try-catch.
		} while(numUser == 0); // Fin bloque do-while.
		
		// Creamos el correspondiente texto.
		
		/* Primero creamos un bucle de filas de los asteriscos. */
		for(int i = 0; i < numUser; i++) {
			
			// Y luego imprime las columnas.
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			} //Fin segundo bloque for.
			
			// Al final de cada fila, imprime una línea nueva.
			System.out.println();
		} // Fin primer bloque for.
		
		
		// Cerramos el Scanner.
		sc.close();
	}

}
