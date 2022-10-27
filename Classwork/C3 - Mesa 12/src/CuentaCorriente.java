public class CuentaCorriente extends Cuenta{
    private Double montoParaGirar;

    public CuentaCorriente(Double montoParaGirar, Cliente cliente){
        super(cliente);
        this.montoParaGirar = montoParaGirar;
    }

    @Override
    public void extraer(Double cantDeDinero){
        if(cantDeDinero > this.getSaldo() && (cantDeDinero) <= montoParaGirar + this.getSaldo()){
            setMontoParaGirar(this.montoParaGirar - (cantDeDinero - getSaldo()));
            this.setSaldo(0.0);
        } else if (cantDeDinero < this.getSaldo()) {
            this.setSaldo(this.getSaldo() - cantDeDinero);
        } else {
            System.out.println("NO SE PUEDE RETIRAR POR SALDO INSUFICIENTE...POBRE :(");
        }
    }

    public void getMonto(){
        System.out.println(this.montoParaGirar);
    }
    public void setMontoParaGirar(Double nuevoMonto){
        montoParaGirar = nuevoMonto;
    }
}
