public class Persona {

    private String nombre;
    private Perro perro;

    public Persona(String nombre, Perro perro){
        this.nombre = nombre;
        this.perro = perro;
    }

    public void jugarConElPerro(){
        System.out.println("soy " + nombre + " y estoy jugando con mi perro " + perro.getApodo());
        perro.correr();
        perro.ladrar();
    }


}
