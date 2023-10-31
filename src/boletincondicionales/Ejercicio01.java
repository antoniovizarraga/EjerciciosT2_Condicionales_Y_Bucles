package boletincondicionales;
import java.util.Scanner;

public class Ejercicio01 {
	/*  */
	
	/* Vamos a realizar un script que nos diga que si un número introducido
	 * por el usuario entre 0 y 9999, es un número capícuo o no. Los números
	 * capícuos son aquellos que se leen igual de izquierda a derecha y vice-
	 * -versa. */
	public static void main(String[] args) {
		// Creamos los valores que usaremos y un valor que pediremos al usuario.
		int num;
		float num2;
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
		/* do {
			if(num > 9999 || num < 0) {
				System.out.println("Error. Introduce un valor entero " +
				"comprendido entre el 0 y 9999.");
				num = sc.nextInt();
			}				
		} while(num > 9999 || num < 0); */
		
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
		
		// En el caso en el que el número sólo tenga un valor.
		if(num < 10)
			System.out.println("El número es capículo.");
		
		// En el caso en el que el número tenga dos valores.
		else if(num < 100 && num > 9) {
			
			// Comprueba si ese número es capícuo.
			if(num % 11 == 0) {
				System.out.println("El número es capícuo.");
			}
				
			
			// En el caso en que el número tenga tres valores.
		} else if(num < 1000 & num > 99) {
			num2 = (int) num % 10;
			num = num / 100;
			
			if(num == num2) {
				System.out.println("El número es capícuo.");
			}
				
		} else if(num < 10000 & num > 999) {
			num2 = (int) num % 100;
			num = num / 1000;
			
			if(num == num2) {
				System.out.println("El número es capícuo.");
			}
				
		} else {
			System.out.println("El número no es capícuo.");
		}
			
			
		
		/* if(temp == ORIGINAL_VALUE) {
			System.out.println("El número es capícuo.");
		} else {
			System.out.println("El número no es capícuo.");
		} */
		
		sc.close();
	}

}
