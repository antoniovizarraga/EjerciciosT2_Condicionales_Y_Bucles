package boletincondicionales;
import java.util.Scanner;

public class Ejercicio01 {
	/*  */
	
	/* Vamos a realizar un script que nos diga que si un número introducido
	 * por el usuario entre 0 y 9999, es un número capícuo o no. Los números
	 * capícuos son aquellos que se leen igual de izquierda a derecha y vice-
	 * -versa. 
	 * 
	 * VALORES DE PRUEBA:
	 * 
	 * Entrada:
	 * 
	 * 1212
	 * 
	 * Salida esperada:
	 * 
	 * El número es capícuo.
	 * 
	 * Salida obtenida:
	 * 
	 * El número es capícuo.
	 * 
	 * */
	public static void main(String[] args) {
		// Creamos los valores que usaremos y un valor que pediremos al usuario.
		int num;
		int num2;
		int num3;
		int num4;
		final int ORIGINAL_VALUE; // Esto será un valor de referencia.
		
		// Creamos el Scanner.
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos el valor al usuario.
		System.out.print("Introduce un valor entero comprendido entre el " +
		"0 y 9999: ");
		num = sc.nextInt();
		

		
		// Guardamos el valor introducido por el usuario para tenerlo de referencia.
		ORIGINAL_VALUE = num;
		
		
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
			// En el caso en que el número tenga cuatro valores.
		} else if(num < 10000 & num > 999) {
			// Guarda la primera cifra del número.
			num = (ORIGINAL_VALUE / 100) / 10;
			
			// Guarda la segunda.
			num2 = (ORIGINAL_VALUE / 100) % 10;
			
			// Guarda la tercera.
			num3 = (ORIGINAL_VALUE % 100) / 10;
			
			// Y la cuarta.
			num4 = (ORIGINAL_VALUE % 100) % 10;
			
			
			// Comprueba si es capícuo.
			if(num == num4 && num2 == num3) {
				System.out.println("El número es capícuo.");
			} else {
				System.out.println("El número no es capícuo.");
			}
				
		} 
			
		// Cerramos el Scanner.
		sc.close();
	}

}
