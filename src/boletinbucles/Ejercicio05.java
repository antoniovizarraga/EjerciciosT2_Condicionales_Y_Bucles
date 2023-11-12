package boletinbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	/* 
	 * ENTRADA:
	 * 
	 * (Caso 1)
	 * 72
	 * 84
	 * 
	 * (Caso 2)
	 * hola
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * (Caso 1)
	 * El mínimo común múltiplo de 72 y 84 es: 504
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 * 
	 * 
	 * SALIDA OBTENIDA:
	 * 
	 * (Caso 1)
	 * El mínimo común múltiplo de 72 y 84 es: 504
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		// Creamos las variables de los valores a pedir.
				int a = 0;
				int b = 0;
				
				/* Creamos el valor que usaremos de referencia. Esta variable contendrá el 
				 * valor máximo (Múltiplo) de las variables a y b. */
				final int MAX;
				
				// Creamos una variable del resultado (Es decir, el Máximo Común Divisor. O el: "MCD".
				int result = 0;
				
				// Creamos el Scanner.
				Scanner sc = new Scanner(System.in);

				// Creamos un bucle do-while que se repita hasta que los valores sean modificados.
				do {
					
					// Creamos un bloque de código que puede ser susceptible a errores de input.
					try {
						// Le pedimos los valores al usuario.
						System.out.print("Introduce el valor de (a): ");
						a = sc.nextInt();
						
						System.out.print("Introduce el valor de (b): ");
						b = sc.nextInt();
						
						// Si ves que hay un valor que no es válido...
					} catch(InputMismatchException e) {
						// Imprime este mensaje.
						System.err.println("Error. Has introducido un valor no válido. Vuelve a introducir el valor.");
						sc.next();
					} // Fin bloque try-catch.
					
				} while(a == 0 || b == 0); // Fin bloque do-while.
				
				
				
				// Calculamos el valor máximo de las dos variables.
				MAX = Math.max(a, b);
				
				/* Hacemos un bucle for infinito en el que comprobamos si cada número es múltiplo
				 * de las dos variables. */
				for(int i = MAX; ; i++) {
					if(i % a == 0 && i % b == 0) {
						// Si encuentras el número (Que será el MCM), asígnalo y detén el bucle.
						result = i;
						break;
					} // Fin bloque if.
				}  // Fin bucle for.
				
				// Imprime el resultado.
				System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + result);
				
				// Cerramos el Scanner.
				sc.close();

	}

}
