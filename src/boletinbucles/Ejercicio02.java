package boletinbucles;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio02 {

	/*
	 * ENTRADA:
	 * 
	 * 7
	 * 
	 * SALIDA ESPERADA:
	 *  
	 *   Hay 4 números primos entre 1 y 7.
	 *  
	 * SALIDA OBTENIDA:
	 *  
	 *  Hay 4 números primos entre 1 y 7.
	 *  
	 *  */
	public static void main(String[] args) {
		
		// El número que le pediremos al usuario.
		int numUser = 0;
		
		// El número de cifras primas encontradas.
		int primeNumbersCount = 0;
		
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Creamos un bucle do-while que se repita hasta que los valores sean modificados.
		do {
			// Creamos un bloque de código que puede ser susceptible a errores de input.
			try {
				// Le pedimos los valores al usuario.
				System.out.print("Introduzca un número entero: ");
				numUser = sc.nextInt();
				
				
				// Si ves que hay un valor que no es válido...
			} catch(InputMismatchException e) {
				// Imprime este mensaje.
				System.err.println("Error. Has introducido un valor no válido. Vuelve a introducir el valor.");
				sc.next();
			} // Fin bloque try-catch.
			
		} while(numUser == 0); // Fin bloque do-while.
		
		
		/* Creamos un bucle en el que comprobamos si los números son primos en cada iteración.
		 * De ser así, le sumamos 1 a la variable de primeNumbersCount. */
		for(int i = 2; i <= numUser; i++) {
			boolean isPrime = true; // El bool para saber si un número es primo o no.
			for(int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					// Si no es primo, detén el bucle.
					isPrime = false;
					break;
				} //Fin if
			} // Fin segundo bloque for
			
			
			// Si es primo, suma 1 a la variable.
			if(isPrime)
				primeNumbersCount++;
			
			
		} // Fin primer bucle for
		
		
		// Imprimimos el resultado.
		System.out.println("Hay " + primeNumbersCount + " números primos entre 1 y " + numUser + ".");
		
		// Cerramos el Scanner.
		sc.close();
	}

}
