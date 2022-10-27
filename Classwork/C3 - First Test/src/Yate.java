public class Yate extends Embarcacion implements Comparable{

    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double preciobase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, preciobase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {

        Yate otroYate = (Yate) o;
        if(this.cantidadCamarotes > otroYate.cantidadCamarotes){
            return 1;
        }if(this.cantidadCamarotes < otroYate.cantidadCamarotes) {
            return -1;
        }
        return 0;
    }
}



