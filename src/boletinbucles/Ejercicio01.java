package boletinbucles;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio01 {

	/*
	 * ENTRADA:
	 * 
	 * 
	 * 
	 * 
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * 
	 * 
	 * 
	 * 
	 * SALIDA OBTENIDA:
	 *  
	 *  
	 *  
	 *  */
	public static void main(String[] args) {
		int hours = -1; // El valor de horas que le pediremos al usuario.
		int minutes = -1; // El valor de minutos que le pediremos al usuario
		int seconds = -1; // El valor de segundos que pediremos al usuario
		int incrementTime = -1; // El valor por el cual se va a incrementar el tiempo.

		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Creamos un bucle do-while que se repita hasta que los valores sean modificados.
		do {
			// Creamos un bloque de código que puede ser susceptible a errores de input.
			try {
				// Le pedimos los valores al usuario.
				System.out.println("Introduce las horas: ");
				hours = sc.nextInt();
				
				System.out.println("Introduce los minutos: ");
				minutes = sc.nextInt();
				
				System.out.println("Introduce los segundos: ");
				seconds = sc.nextInt();
				
				System.out.println("Escribe la cantidad de segundos a incrementar: ");
				incrementTime = sc.nextInt();
				
				// Si ves que hay un valor que no es válido...
			} catch(InputMismatchException e) {
					// Imprime este mensaje.
					System.err.println("Error. El valor introducido no fue válido. Vuelve a introducir el valor.");
					sc.next();
			 	} // Fin bloque try-catch.
			
		} while(hours < 0 || minutes < 0 || seconds < 0 || incrementTime < 0); // Fin bloque do-while.
		
		
		
		
		sc.close();
	}

}
