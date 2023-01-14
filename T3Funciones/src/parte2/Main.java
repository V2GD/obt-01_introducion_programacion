package parte2;

public class Main {
	
	/**
	 * M�todo principal del programa
	 * @param args arreglo con par�metros enviados por consola
	 * @return void
	 * 
	 * */
	public static void main(String[] args) {
		// 1) Creamos una instancia de la clase coche con 4 puertas
		Coche coche1 = new Coche(4);
		
		// 2) Incrementamos el número de puertas del coche en 1
		coche1.incrementNumPuertas(1);
		
		// 3) Mostramos por consola el total de puertas de nuestra instancia
		System.out.println("El coche tiene " + coche1.getNumPuertas() + " puertas.");
		
	}

}
