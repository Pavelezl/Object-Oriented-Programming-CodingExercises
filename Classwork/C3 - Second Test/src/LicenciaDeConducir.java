public abstract class LicenciaDeConducir {

    private Persona persona;
    private String fechaVigencia;
    private String fechaCaducidad;
    private Boolean esPrincipiante;

    public LicenciaDeConducir(Persona persona, String fechaVigencia, String fechaCaducidad, Boolean esPrincipiante) {
        this.persona = persona;
        this.fechaVigencia = fechaVigencia;
        this.fechaCaducidad = fechaCaducidad;
        this.esPrincipiante = esPrincipiante;
    }

    public Boolean puedeManejarAU(){
        return !esPrincipiante;
    }
}
