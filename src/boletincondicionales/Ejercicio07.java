package boletincondicionales;
import java.util.Scanner;

public class Ejercicio07 {

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

		if(minutes > 60 && minutes < 70) {
			
		}
		
		sc.close();
	}

}
