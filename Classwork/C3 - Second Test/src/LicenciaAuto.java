public class LicenciaAuto extends LicenciaDeConducir{

    private Boolean puedeManejarCamioneta;

    public LicenciaAuto(Persona persona, String fechaVigencia, String fechaCaducidad, Boolean esPrincipiante, Boolean puedeManejarCamioneta) {
        super(persona, fechaVigencia, fechaCaducidad, esPrincipiante);
        this.puedeManejarCamioneta = puedeManejarCamioneta;
    }

}
