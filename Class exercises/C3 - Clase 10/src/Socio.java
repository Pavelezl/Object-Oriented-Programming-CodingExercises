public class Socio {

    //ATRIBUTOS
    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;

    public Socio(String numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    //METODOS

    public Double calcularCostoMensual(){
        System.out.println("Esta es la cuota de " + nombre);
        return cuotaMensual * 1.5;
    }

    public Double getCuotaMensual() {
        return cuotaMensual;
    }
}
