public abstract class Cuenta {
    private Cliente cliente;
    private Double saldo;

    public Cuenta(Cliente cliente){
        this.cliente = cliente;
        saldo = 0.0;
    }

    public void depositar(Double cantDeDinero){
        saldo += cantDeDinero;
    };

    public abstract void extraer(Double cantDeDinero);

    public Double getSaldo(){
        System.out.println("Tu saldo es de $" + saldo);
        return saldo;
    }

    protected void setSaldo(Double nuevoSaldo){
        saldo = nuevoSaldo ;
    }
}
