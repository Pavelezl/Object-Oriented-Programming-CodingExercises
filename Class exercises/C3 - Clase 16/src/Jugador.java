public class Jugador implements Comparable<Jugador>{

    private Integer numeroCamiseta;
    private String nombre;
    private Boolean estaLesionado;
    private Boolean esTitular;

    public Jugador(Integer numeroCamiseta, String nombre, Boolean estaLesionado, Boolean esTitular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.estaLesionado = estaLesionado;
        this.esTitular = esTitular;
    }

    @Override
    public int compareTo(Jugador otroJugador) {
        return this.numeroCamiseta.compareTo(otroJugador.numeroCamiseta);
    }

    public Boolean getEstaLesionado() {
        return estaLesionado;
    }

    public Boolean getEsTitular() {
        return esTitular;
    }

    @Override
    public String toString() {
        return "nr: " + numeroCamiseta + " nombre: " + nombre;
    }
}
