public class LicenciaMoto extends LicenciaDeConducir implements Comparable {

    private Integer cantidadMaxCilindradas;

    public LicenciaMoto(Persona persona, String fechaVigencia, String fechaCaducidad, Boolean esPrincipiante, Integer cantidadMaxCilindradas) {
        super(persona, fechaVigencia, fechaCaducidad, esPrincipiante);
        this.cantidadMaxCilindradas = cantidadMaxCilindradas;
    }

    @Override
    public int compareTo(Object o) {
        LicenciaMoto otraMoto = (LicenciaMoto) o;

        if(this.cantidadMaxCilindradas > otraMoto.cantidadMaxCilindradas){
            return 1;
        }if ((this.cantidadMaxCilindradas < otraMoto.cantidadMaxCilindradas)){
            return -1;
        }
        return 0;
    }
}
