package boletincondicionales;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int animals;
		float totalFood, purchasedFood, correspondentFood;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce los kilos de comida comprada: ");
		purchasedFood = sc.nextFloat();
		
		System.out.print("Ahora el número de animales totales: ");
		animals = sc.nextInt();
		
		System.out.print("Y por último, los kilos de comida que comerán todos los" +
		" animales en total: ");
		totalFood = sc.nextFloat();
		
		if(purchasedFood == 0 || animals == 0) {
			System.out.println("Error. No puedes meter ceros.");
			
		} else if(purchasedFood < totalFood) {
			
				
			
			System.out.println("\n" + "No se dispone del suficiente alimento para cada animal.");
			
			correspondentFood = purchasedFood / animals;
			
			System.out.println("La cantidad que le corresponde a cada animal es: " +
			correspondentFood + " Kgs.");
		}
		
		
		sc.close();
	}

}
