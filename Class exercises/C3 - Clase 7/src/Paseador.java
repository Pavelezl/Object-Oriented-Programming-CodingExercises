import java.util.Date;

public class Paseador {

    private String nombre;
    private Double sueldo;

    public Paseador(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;

    }

    public void pasear(Perro perro){
        System.out.println("soy " + nombre + " y estoy paseando a tu perro " + perro.getApodo());
        perro.ladrar();
        perro.ladrar();
        perro.ladrar();
        System.out.println("este paseo te costo " + sueldo + "$");
    }




}
