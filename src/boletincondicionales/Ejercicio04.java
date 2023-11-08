package boletincondicionales;
import java.util.Scanner;

public class Ejercicio04 {

	
	/* ENTRADA:
	 * (Caso 1)
	 * 33
	 * 
	 * (Caso 2)
	 * 0
	 * 
	 * (Caso 3)
	 * 15
	 * 
	 * (Caso 4)
	 * 40
	 * 
	 * 
	 * SALIDA ESPERADA:
	 * (Caso 1)
	 * Treinta y tres
	 * 
	 * (Caso 2)
	 * Error. No has introducido un valor entre 1 y 99.
	 * 
	 * (Caso 3)
	 * Quince.
	 * 
	 * (Caso 4)
	 * Cuarenta.
	 * 
	 * 
	 * SALIDA OBTENIDA:
	 * (Caso 1)
	 * Treinta y tres
	 * 
	 * (Caso 2)
	 * Error. No has introducido un valor entre 1 y 99.
	 * 
	 * (Caso 3)
	 * Quince.
	 * 
	 * (Caso 4)
	 * Cuarenta.
	 * 
	 *  
	 *  */
	
	public static void main(String[] args) {
		int num;
		int numU = 0;
		int numD = 0;
		String decenas = "";
		String unidades = "";
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduzca un número del 1 al 99: ");
		num = sc.nextInt();
		
		
		if(num > 99 || num < 1)
			System.out.println("Error. No has introducido un valor entre 1 y 99.");
		else {
			numU = num % 10;
			numD = num / 10;
			
			
			
			if(num > 9 && num <= 20) {
				switch(num) {
				case 10:
					System.out.println("Diez.");
					flag = false;
					break;
				case 11:
					System.out.println("Once.");
					flag = false;
					break;
				case 12:
					System.out.println("Doce.");
					flag = false;
					break;
				case 13:
					System.out.println("Trece.");
					flag = false;
					break;
				case 14:
					System.out.println("Catorce.");
					flag = false;
					break;
				case 15:
					System.out.println("Quince.");
					flag = false;
					break;
				case 20:
					System.out.println("Veinte.");
					flag = false;
					break;
				}
			}
			
			if(flag) {
				switch(numU) {
				case 1:
					unidades = "uno";
					break;
				case 2:
					unidades = "dos";
					break;
				case 3:
					unidades = "tres";
					break;
				case 4:
					unidades = "cuatro";
					break;
				case 5:
					unidades = "cinco";
					break;
				case 6:
					unidades = "seis";
					break;
				case 7:
					unidades = "siete";
					break;
				case 8:
					unidades = "ocho";
					break;
				case 9:
					unidades = "nueve";
					break;
				}
				
				switch(numD) {
				case 1:
					decenas = "Dieci";
					break;
				case 2:
					decenas = "Veinti";
					break;
				case 3:
					decenas = "Treinta ";
					break;
				case 4:
					decenas = "Cuarenta ";
					break;
				case 5:
					decenas = "Cincuenta ";
					break;
				case 6:
					decenas = "Sesenta ";
					break;
				case 7:
					decenas = "Setenta ";
					break;
				case 8:
					decenas = "Ochenta ";
					break;
				case 9:
					decenas = "Noventa ";
					break;
				}
			}
			
			
		}
		if(num > 30 && numU != 0)
			System.out.println(decenas + "y " + unidades);
		//else if(numD == )
		else
			System.out.println(decenas + unidades);
		
		
		sc.close();
	}

}
