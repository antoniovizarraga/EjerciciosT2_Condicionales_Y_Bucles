package boletinbucles;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos los valores que usaremos y un valor que pediremos al usuario.
				int num;
				int temp = 0;
				int x;
				final int ORIGINAL_VALUE;
				
				// Creamos el Scanner.
				Scanner sc = new Scanner(System.in);
				
				// Le pedimos el valor al usuario.
				System.out.print("Introduce un valor entero comprendido entre el " +
				"0 y 9999: ");
				num = sc.nextInt();
				
				/* Entramos en un bucle en el que si el usuario no mete un valor
				 * comprendido entre 0 y 9999, le pedimos que lo vuelva a pedir. */
				do {
					if(num > 9999 || num < 0) {
						System.out.println("Error. Introduce un valor entero " +
						"comprendido entre el 0 y 9999.");
						num = sc.nextInt();
					}				
				} while(num > 9999 || num < 0);
				
				// Una vez tengamos el valor correcto...
				
				/* Asignamos a x el valor introducido por el usuario
				 * para usarlo más adelante en una operación matemática. */
				x = num;
				
				// Guardamos el valor introducido por el usuario para tenerlo de referencia.
				ORIGINAL_VALUE = num;
				
				/* Hacemos un bucle en el que vaya invirtiendo el número del revés
				 * y lo vaya guardando hasta que el valor sea menor a 0. Si lo es,
				 * significa que ya ha metido el último valor y que ya no quedan
				 * más valores por meter (En efecto, he buscado el método en
				 * Stack Overflow. 😎👍 */
				while(num > 0) {
					x = num % 10;
					num = num / 10;
					temp = temp * 10 + x;
				}
				
				if(temp == ORIGINAL_VALUE) {
					System.out.println("El número es capícuo.");
				} else {
					System.out.println("El número no es capícuo.");
				}
				
				sc.close();

	}

}
