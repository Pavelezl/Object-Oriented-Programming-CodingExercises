public abstract class Embarcacion {

    //ATRIBUTOS
    private Capitan capitan;
    private Double preciobase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double eslora;

    //CONSTRUCTOR


    public Embarcacion(Capitan capitan, Double preciobase, Double valorAdicional, Integer anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.preciobase = preciobase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    //METODOS

    public Double calcularMontoAlquiler(){
        if(anioFabricacion >2020){
            return preciobase + valorAdicional;
        }else{
            return preciobase;
        }
    }
}
