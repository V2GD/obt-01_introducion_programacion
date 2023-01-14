/**
 * Clase Persona
 *
 * @author Verónica García Gayol
 */
public class Persona {
    /**
     * Defincición de variables de la clase
     */
    private int edad;
    private String nombre;
    private String telefono;

    /**
     * Constructor de la clase Persona
     *
     * @param edad
     * @param nombre
     * @param telefono
     */
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Defincición de getter y setter
     */
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
