package boletincondicionales;
import java.util.Scanner;

public class Ejercicio05 {

	
	/* ENTRADA:
	 * (Caso 1)
	 * -4 
	 * 
	 * (Caso 2)
	 * 4
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * (Caso 1)
	 * Su valor absoluto será: | 4 |
	 * 
	 * (Caso 2)
	 * 
	 * Su valor absoluto será: | 4 |
	 * 
	 * 
	 * SALIDA OBTENIDA:
	 * (Caso 1)
	 * Su valor absoluto será: | 4 |
	 * 
	 * (Caso 2)
	 * 
	 * Su valor absoluto será: | 4 |
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero.");
		num = sc.nextInt();
		
		num = num < 0 ? num * -1 : num * 1;
		
		System.out.println("Su valor absoluto será: " + "| " + num + " |");
		
		sc.close();
	}

}
