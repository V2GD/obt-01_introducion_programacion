public class Main {

    public static void main(String[] args) {

        // 1) Creamos una instancia de un Cliente que hereda de Persona

        Cliente cliente = new Cliente(23,"Juan Carlos", "66666666",200);

        // 2) Mostramos por pantalla su información a partir del método sobre-escrito toString
        System.out.println(cliente.toString());

        // 3) Creamos una instancia de un Trabajador que hereda también de Persona

        Trabajador trabajador = new Trabajador(34,"Ana María","999999999",1200);

        // 4) Mostramos por pantalla su información a partir del método sobre-escrito toString

        System.out.println(trabajador.toString());

    }
}
