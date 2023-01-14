public class Main {

	/**
	 * Método principal del programa
	 * 
	 * Repaso de las principales estructuras de control
	 * 
	 * @param args arreglo con parámetros enviados por consola
	 * @return void
	 * 
	 */
	public static void main(String[] args) {

		printLineDivisor();

		// Caso 1) Condición

		int numeroIf = 0;

		if (numeroIf > 0) {
			System.out.println("El número numeroIf: " + numeroIf + " es positivo.");
		} else if (numeroIf < 0) {
			System.out.println("El número numeroIf: " + numeroIf + " es negativo.");
		} else {
			System.out.println("El número numeroIf: " + numeroIf + " es 0. Valga la redundancia.");
		}
		
		printLineDivisor();
		
		// Caso 2) Bucle while

		int numeroWhile = 0;

		while (numeroWhile < 3) {
			// En orden del enunciado

			// 1) Incrementamos primero la varible
			numeroWhile += 1;

			// 2) Mostramos por pantalla después
			System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);

		}
		
		printLineDivisor();
		
		// Caso 3) Bucle do while
		
		int numeroDoWhile = 0;
		
		do {
			//Misma estructura que caso 2
			
			// 1) Incrementamos primero la varible
			numeroDoWhile += 1;
			
			// 2) Mostramos por pantalla después
			System.out.println("El valor de la variable numeroDoWhile es: " + numeroDoWhile);
			
		} while (numeroDoWhile < 1);
		
		printLineDivisor();

		// Caso 4) Bucle for

		for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("El valor de la variable numeroFor es: " + numeroFor);
		}
		
		printLineDivisor();


		// Caso 5) Switch

		String estacion = "Primavera";
		
		// Pasamos el string a min�sculas para comparar
		switch (estacion.toLowerCase()) {
		case "primavera":
			System.out.println("Es " + estacion);
			break;
		case "verano":
			System.out.println("Es " + estacion);
			break;
		case "invierno":
			System.out.println("Es " + estacion);
			break;
		case "oto�o":
			System.out.println("Es " + estacion);
			break;
		default:
			System.out.println("¡Vaya!. No es ninguna estación");
		}

		printLineDivisor();

	}
	
	/**
	 * Método de clase utilizado para imprimir una bloque de separación entre
	 * los resultados de los distintos casos
	 * 
	 * */
	private static void printLineDivisor(){
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		System.out.println();
	}

}
