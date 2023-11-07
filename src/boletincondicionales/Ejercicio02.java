package boletincondicionales;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int dni = 0;
		final int ORIGINAL_DNI;
		char dni_letter = 'Ñ';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu DNI: ");
		dni = sc.nextInt();
		
		ORIGINAL_DNI = dni;
		
		if(dni < 9999999 || dni > 99999999) {
			System.out.println("Error. Valor erróneo.");
		} else {
			dni = dni % 23;
			
			switch(dni) {
			
			case 0:
				dni_letter = 'T';
				break;
			case 1:
				dni_letter = 'R';
				break;
			case 2:
				dni_letter = 'W';
				break;
			case 3:
				dni_letter = 'A';
				break;
			case 4:
				dni_letter = 'G';
				break;
			case 5:
				dni_letter = 'M';
				break;
			case 6:
				dni_letter = 'Y';
				break;
			case 7:
				dni_letter = 'F';
				break;
			case 8:
				dni_letter = 'P';
				break;
			case 9:
				dni_letter = 'D';
				break;
			case 10:
				dni_letter = 'X';
				break;
			case 11:
				dni_letter = 'B';
				break;
			case 12:
				dni_letter = 'N';
				break;
			case 13:
				dni_letter = 'J';
				break;
			case 14:
				dni_letter = 'Z';
				break;
			case 15:
				dni_letter = 'S';
				break;
			case 16:
				dni_letter = 'Q';
				break;
			case 17:
				dni_letter = 'V';
				break;
			case 18:
				dni_letter = 'H';
				break;
			case 19:
				dni_letter = 'L';
				break;
			case 20:
				dni_letter = 'C';
				break;
			case 21:
				dni_letter = 'K';
				break;
			case 22:
				dni_letter = 'E';
				break;
			}
		}
		
		System.out.println("Tu DNI completo es: " + ORIGINAL_DNI + dni_letter);
		
		sc.close();
	}

}
