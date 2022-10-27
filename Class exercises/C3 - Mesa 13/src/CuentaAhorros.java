public class CuentaAhorros extends Cuenta {

    //ATRIBUTOS
    private Double tasaInteres;

    //CONSTRUCTOR

    public CuentaAhorros(Cliente titular, Double saldo, Double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    public void cobrarInteres() {
        depositar(getSaldo() * tasaInteres);
    }

}







