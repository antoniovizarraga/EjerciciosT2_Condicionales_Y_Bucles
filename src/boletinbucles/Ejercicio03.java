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
		int numUser = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				System.out.print("Introduce un número entero: ");
				numUser = sc.nextInt();
			} catch(InputMismatchException e) {
				System.err.println("Error. Has introducido un valor no válido. Vuelve a introducir el valor.");
				sc.next();
			}
		} while(numUser == 0);
		
		for(int i = 0; i < numUser; i++) {
			System.out.println();
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		}
		
		sc.close();
	}

}
