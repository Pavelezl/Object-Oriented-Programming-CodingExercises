public class Cliente {
    private Integer numeroDeCliente;
    private String apellido;
    private Integer dni;
    private Integer cuit;

    public Cliente(Integer numero, String apellido, Integer dni, Integer cuit){
        numeroDeCliente = numero;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }

}
