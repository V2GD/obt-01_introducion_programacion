/**
* Clase Persona
 * @author Verónica García Gayol
* */
public class Persona {
    /**
     * Definición de variables de clase
    * */
    private int edad;
    private String nombre;
    private String telefono;

    /**
     * Sobre-carga de constructores
     * */
    public Persona() {
    }

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Getters y setters de la  clase
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

    /**
    * Sobre-escritura del método toString de Persona
     *
    * */
    @Override
    public String toString() {
        return "Persona {" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
