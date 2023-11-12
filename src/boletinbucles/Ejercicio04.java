package boletinbucles;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio04 {

	/*
	 * ENTRADA:
	 * 
	 * (Caso 1)
	 * 280
	 * 500
	 * 
	 * (Caso 2)
	 * 
	 * 360
	 * 700.50
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * (Caso 1)
	 * El máximo común divisor de 280 y 500 es: 20
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 * 
	 * SALIDA OBTENIDA:
	 * 
	 * (Caso 1)
	 * El máximo común divisor de 280 y 500 es: 20
	 * 
	 * (Caso 2)
	 * Error. Has introducido un valor no válido. Vuelve a introducir el valor.
	 *  
	 *  */
	public static void main(String[] args) {
		
		// Creamos las variables de los valores a pedir.
		int a = 0;
		int b = 0;
		
		/* Creamos el valor que usaremos de referencia. Esta variable contendrá el 
		 * valor mínimo entre las variables a y b. */
		final int MIN;
		
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
		
		
		
		// Calculamos el valor mínimo de las dos variables.
		MIN = Math.min(a, b);
		
		/* Hacemos un bucle for decreciente en el que comprobamos si cada número es divisible
		 * entre las dos variables. */
		for(int i = MIN; i > 0; i--) {
			if(a % i == 0 && b % i == 0) {
				// Si encuentras el número (Que será el MCD), asígnalo y detén el bucle.
				result = i;
				break;
			} // Fin bloque if.
		}  // Fin bucle for.
		
		// Imprime el resultado.
		System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + result);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
