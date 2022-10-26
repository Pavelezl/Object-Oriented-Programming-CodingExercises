public class UsuarioJuego {

    //Atributos
    private String nombre;
    private String clave;
    private Integer puntaje;
    private Integer nivel;

    //CONSTRUCTOR
    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0;
        this.nivel = 0;
    }

    //METODOS
    public void aumentarPuntaje(){
        System.out.println(nombre + " Tu puntaje era de: " + puntaje);
        puntaje += 1;
        System.out.println(nombre + " Tu nuevo puntaje es de: " + puntaje);
    }

    public void subirNivel(){
        System.out.println(nombre + " Tu nivel era de: " + nivel);
        nivel += 1;
        System.out.println(nombre + " Tu nuevo nivel es de: " + nivel);
    }

    public void bonus(Integer valorBonus){
        System.out.println(nombre + " Tu puntaje era de: " + puntaje);
        puntaje += valorBonus;
        System.out.println(nombre + " Enhorabuena Tu puntaje a recibido un valor de " + valorBonus);
        System.out.println(nombre + " Tu nuevo puntaje es de " + puntaje);

    }


}
