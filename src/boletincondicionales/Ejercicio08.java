package boletincondicionales;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	/* ENTRADA:
	 * 
	 * (Caso 1)
	 * 750
	 * 
	 * 7
	 * 
	 * (Caso 2)
	 * 
	 * 801
	 * 
	 * 8
	 *  
	 * (Caso 3)
	 * hola
	 * 
	 * 
	 * SALIDA ESPERADA:
	 * (Caso 1)
	 * El precio del Ticket será de: 1875€.
	 * 
	 * (Caso 2)
	 * 
	 * El precio del Ticket será de: 1401.75€.
	 * 
	 * (Caso 3)
	 * 
	 * Has introducido un valor no válido. Vuelve a intentarlo.
	 * 
	 * SALIDA OBTENIDA:
	 * (Caso 1)
	 * El precio del Ticket será de: 1875.0€.
	 * 
	 * (Caso 2)
	 * 
	 * El precio del Ticket será de: 1401.75€.
	 *  
	 * (Caso 3)
	 * 
	 * Has introducido un valor no válido. Vuelve a intentarlo.
	 * 
	 *  */
	public static void main(String[] args) {
		float distanceUser = 0f; // Número de distancia que introduce el usuario
		int daysUser = 0; // Número de días de estancia que introduce el usuario
		final float PRICE_DISTANCE = 2.5f; // El precio por kilómetro que tomaremos de referencia para el precio del ticket.
		final float REF_DISTANCE = 800f; // La distancia de referencia que tomaremos para la aplicación del descuento.
		final int REF_DAYS = 7; // El número de días que tomaremos de referencia para el descuento.
		final int DISCOUNT = 30; /* La reducción/descuento que aplicaremos si la cantidad de días de referencia
								 es mayor que 7. */
		float trainPrice = 0f; // Precio total del billete.
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		
		// Creamos un bloque de código a prueba de posibles errores de inputs.
		try {
			
			// Le pedimos los valores correspondientes al usuario.
			System.out.println("¿Cuánta distancia vas a recorrer? (En Kilómetros)");
			distanceUser = sc.nextFloat();
			
			System.out.println("¿Cuántos días de estancia vas a tener?");
			daysUser = sc.nextInt();
			
			// Calculamos el precio total del ticket.
			trainPrice = distanceUser * PRICE_DISTANCE;
			
			// Calculamos si se aplicaría el descuento al ticket. En caso de ser así, aplícalo al precio y réstalo.
			if(daysUser > REF_DAYS && distanceUser > REF_DISTANCE) {
				trainPrice -= (trainPrice * DISCOUNT) / 100;
			}
			
			// Imprime el precio final.
			System.out.println("El precio del Ticket será de: " + trainPrice + "€.");
		} catch(InputMismatchException e) {
			// Si hay un error en el input, imprime este mensaje.
			System.out.println("Has introducido un valor no válido. Vuelve a intentarlo.");
		}
		
		
		// Cierra el Scanner.
		sc.close();
	}

}
