package boletincondicionales;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio06 {

	
	/* ENTRADA:
	 * 
	 * (Caso 1)
	 * 86
	 * 
	 * (Caso 2)
	 * 50
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * (Caso 1)
	 * 
	 * 
	 * ¡Acertaste!
	 * 
	 * (Caso 2)
	 * 
	 * Fallaste... El resultado de la suma era: 117
	 * 
	 * SALIDA OBTENIDA:
	 * 
	 * (Caso 1)
	 * 
	 * 
	 * ¡Acertaste!
	 * 
	 * (Caso 2)
	 * 
	 * Fallaste... El resultado de la suma era: 117
	 * 
	 *  */
	public static void main(String[] args) {
		int userNum = 0;
		final int RANDOM_NUM_1;
		final int RANDOM_NUM_2;
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		RANDOM_NUM_1 = rnd.nextInt(1, 99 + 1);
		RANDOM_NUM_2 = rnd.nextInt(1, 99 + 1);

		System.out.println("He generado dos números. Escribe el resultado de " +
		"la suma de estos dos números.");
		System.out.print("\n" + RANDOM_NUM_1 + " + " + RANDOM_NUM_2 + " = ");
		userNum = sc.nextInt();
		
		if(userNum == RANDOM_NUM_1 + RANDOM_NUM_2)
			System.out.println("¡Acertaste!");
		else
			System.out.println("Fallaste... El resultado de la suma era: " +
			(RANDOM_NUM_1 + RANDOM_NUM_2));
		sc.close();
	}
	
}
