public class Main {
    public static void main(String[] args) {

        UsuarioJuego usuario1 = new UsuarioJuego("pablo", "123");
        UsuarioJuego usuario2 = new UsuarioJuego("Antonio", "345");

        usuario1.aumentarPuntaje();

        usuario1.subirNivel();

        usuario1.bonus(3);

        usuario2.aumentarPuntaje();

        usuario2.aumentarPuntaje();

        usuario2.subirNivel();

        usuario2.subirNivel();

        usuario2.bonus(5);

    }
}