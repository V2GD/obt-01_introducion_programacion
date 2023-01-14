package parte1;

public class Main {
	
	
	/**
	 * Método principal del programa
	 * 
	 * @param args arreglo con parámetros enviados por consola
	 * @return void
	 * 
	 */
	public static void main(String[] args) {
		
		// Mostramos por consola el resultado de la suma
		System.out.println("Resultado: " + sumaNumeros(3, 4, 5));
	}
	

	/**
	 * M�todo de la clase que se encarga de sumar tres números
	 * @author Verónica García Gayol
	 * @param num1 :: int :: primer sumando
	 * @param num2 :: int :: segundo sumando
	 * @param num3 :: int :: tercer sumando
	 * @return :: int :: resultado de la suma
	 * 
	 * */
	public static int sumaNumeros(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}

}
