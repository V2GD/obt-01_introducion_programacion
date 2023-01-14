package parte2;

public class Coche {

	/**
	 * Variable de clase que almacena el número de puertas
	 * 
	 */
	private int numPuertas;

	/**
	 * Constructor de la clase Coche
	 * 
	 * @param numPuertas :: int :: número de puertas del coche
	 * 
	 */
	public Coche(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	/**
	 * Método get para obtener el número de puertas del coche
	 * 
	 */
	public int getNumPuertas() {
		return numPuertas;
	}

	/**
	 * Método set para actualizar el número de puertas del coche
	 * 
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	/**
	 * Método de la clase para incremetar el número de puertas indicadas como
	 * parámetro
	 * 
	 * @author Verónica García Gayol
	 * @param numPuertas :: int :: número de puertas
	 * @return void
	 * 
	 */
	public void incrementNumPuertas(int numPuertas) {
		this.numPuertas += numPuertas;
	}

}
