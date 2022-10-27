public class Main {
    public static void main(String[] args) {

        Equipo equipo = new Equipo("SacaChispas");

        equipo.agregarJugador(new Jugador(10,"Pablo Viera",false, true));
        equipo.agregarJugador(new Jugador(2,"Agustin Ferres",true, true));
        equipo.agregarJugador(new Jugador(5,"Pablo Velez",false, true));
        equipo.agregarJugador(new Jugador(4,"Nicolas Alzamora",true, false));
        equipo.agregarJugador(new Jugador(5,"Sebastian Restrepo",true, true));

        System.out.println(equipo.cantidadTitularesLesionados());

        equipo.mostrarJugadoresTitulares();

    }
}