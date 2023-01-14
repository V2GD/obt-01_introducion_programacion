public class Main {

    public static void main(String[] args) {
        // 1) Creamos instancia de la clase Persona
        Persona persona1 = new Persona(32, "María", "666666666");

        // 2) Mostramos la información inicial previa a modificaciones utilizando getters de la clase
        imprimePersona(persona1);

        // 3) Modificamos valores iniciales de la instacia mendiante setters de la clase
        persona1.setNombre("María del Carmen");
        persona1.setEdad(33);
        persona1.setTelefono("999999999");

        // 4) Mostramos la información modificada mediante setters
        imprimePersona(persona1);
    }

    /**
     * Método de la clase que imprime la información de una persona
     * a partir de los métodos getter de su clase
     * @param persona :: Persona
     *
     */
    public static void imprimePersona(Persona persona){
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println(persona.getNombre() + " tiene " + persona.getEdad()+
                "años . Su teléfono es: " + persona.getTelefono());
        System.out.println("----------------------------------------------------------------------------------------");
    }

}
