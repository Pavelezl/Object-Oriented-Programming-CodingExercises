public class Velero extends Embarcacion {

    private Integer cantidadMatiles;

    public Velero(Capitan capitan, Double preciobase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadMatiles) {
        super(capitan, preciobase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMatiles = cantidadMatiles;
    }

    public Boolean esGrande(){
        return cantidadMatiles > 4;
    }

}


