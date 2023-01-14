/**
 * Clase Cliente
 * @author Verónica García Gayol
 * */
public class Cliente extends Persona {
    private int credito;

    /**
     * Constructor de la clase
     * */
    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono); // Propiedades heredadas de Persona
        this.credito = credito;
    }

    /**
     * Sobre-escritura del método toString de Cliente
     *
     * */
    @Override
    public String toString() {
        return "Cliente {" +
                "edad=" + this.getEdad() + // Acceso a getter del padre
                ", name='" + this.getNombre() + '\'' + // Acceso a getter del padre
                ", telefono='" + this.getTelefono() + '\'' + // Acceso a getter del padre
                ", credito ='" + credito + '\'' +
                '}';
    }
}
