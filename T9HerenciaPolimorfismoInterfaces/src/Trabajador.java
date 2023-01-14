/**
 * Clase Trabajador
 * @author Verónica García Gayol
 * */
public class Trabajador extends Persona {
    private int salario;

    /**
     * Constructor de la clase
     * */
    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono); // Propiedades heredadas de Persona
        this.salario = salario;
    }

    /**
     * Sobre-escritura del método toString de Trabajador
     *
     * */
    @Override
    public String toString() {
        return "Trabajador {" +
                "edad=" + this.getEdad() + // Acceso a getter del padre
                ", name='" + this.getNombre() + '\'' + // Acceso a getter del padre
                ", telefono='" + this.getTelefono() + '\'' + // Acceso a getter del padre
                ", salario ='" + salario + '\'' +
                '}';
    }
}
