public class Main {


    public static void main(String[] args) {

        Perro perro = new Perro("Firulais","Naranja");

        Perro otroPerro = new Perro("Clifford","Rojo");

        Persona persona = new Persona("Pablo",perro);

        Paseador paseador = new Paseador("Roberto",300.0);

        persona.jugarConElPerro();
        paseador.pasear(perro);
        paseador.pasear(otroPerro);


    }
}