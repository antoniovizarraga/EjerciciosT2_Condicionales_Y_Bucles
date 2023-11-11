package boletincondicionales;
import java.util.Scanner;

public class Ejercicio07 {

	
	/* ENTRADA:
	 * 
	 * (Caso 1)
	 * 17
	 * 30
	 * 25
	 * 
	 * SALIDA ESPERADA:
	 * 
	 * (Caso 1)
	 * 18 horas, 30 minutos y 26 segundos.
	 * 
	 * SALIDA OBTENIDA:
	 * 
	 * (Caso 1)
	 * 18 horas, 30 minutos y 26 segundos.
	 * 
	 *  
	 *  */
	public static void main(String[] args) {
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la hora.");
		hours = sc.nextInt();
		
		System.out.println("Introduce los minutos.");
		minutes = sc.nextInt();
		
		System.out.println("Introduce los segundos.");
		seconds = sc.nextInt();

		seconds++;
		
		if(seconds >= 60) {
			minutes += seconds / 60;
			seconds = 0;
		}
			
		
		if(minutes >= 60) {
			hours += minutes / 60;
			minutes = 0;
		}
			
		
			
		
		System.out.println(hours + " horas, " + minutes + " minutos y " + seconds + " segundos.");
		
		sc.close();
	}

}
