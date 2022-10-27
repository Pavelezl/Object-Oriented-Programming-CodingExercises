public class CuentaComitente extends Cuenta{

    private String claveDeValidacion;

    public CuentaComitente(String claveDeValidacion, Cliente cliente){
        super(cliente);
        this.claveDeValidacion = claveDeValidacion;
    }
    @Override
    public void extraer(Double cantDeDinero){
        if(cantDeDinero > this.getSaldo() * 0.5){
            System.out.println("no se puede retirar a menos que se ingrese la clave de validacion");
        } else {
            setSaldo(getSaldo() - cantDeDinero);
        }
    }

    public void extraerConClave(Double cantDeDinero, String clave){
        if(cantDeDinero < getSaldo() && claveDeValidacion == clave){
            setSaldo(getSaldo()-cantDeDinero);
        } else if( claveDeValidacion != clave){
            System.out.println("Clave incorrecta, vuelva a intentar");
        } else if(cantDeDinero > getSaldo()){
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(Double monto){
        setSaldo(getSaldo() + (monto * 0.99));
    }

}
