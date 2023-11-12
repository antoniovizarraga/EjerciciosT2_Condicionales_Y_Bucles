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
		// El valor de horas que le pediremos al usuario.
		int hours = -1;
		
		// El valor de minutos que le pediremos al usuario
		int minutes = -1;
		
		// El valor de segundos que pediremos al usuario
		int seconds = -1;
		
		// La cantidad de segundos a incrementar al tiempo.
		int incrementTime = -1;
		
		/* El valor de la suma total de las horas, minutos y segundos +
		  la cantidad de segundos que se va a añadir al tiempo. */
		int totalSeconds = -1;
		
		// Cadenas que luego usaremos en el print final para imprimir el resultado según el ejercicio.
		String ZERO_HOURS = "";
		String ZERO_MINUTES = "";
		String ZERO_SECONDS = "";

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

		// Representamos todos los segundos totales de la suma de todas las variables.
		totalSeconds = hours * 3600 + minutes * 60 + seconds + incrementTime;
		
		// Y una vez tengamos todo mezclado, dividimos la cantidad correspondiente en cada variable.
		hours = totalSeconds / 3600;
		minutes = (totalSeconds % 3600) / 60;
		seconds = totalSeconds % 60;
		
		// Comprobamos si algún número es menor que 10. En caso de ser así, asígnale el texto: "0".
		if(hours < 10)
			ZERO_HOURS = "0";
		
		if(minutes < 10)
			ZERO_MINUTES = "0";
		
		if(seconds < 10)
			ZERO_SECONDS = "0";
		
		// Imprimimos el resultado.
		System.out.println("La cantidad total de tiempo es: " + "\n" + ZERO_HOURS + hours + ":" +
		ZERO_MINUTES + minutes + ":" + ZERO_SECONDS + seconds);
		
		// Cerramos el Scanner.
		sc.close();
	}

}
