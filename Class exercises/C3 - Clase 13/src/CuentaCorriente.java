public class CuentaCorriente extends Cuenta implements ImpuestoGravable {

    private Double montoAutorizado;

    public CuentaCorriente(Cliente titular, Double saldo, Double montoAutorizado) {
        super(titular, saldo);
        this.montoAutorizado = montoAutorizado;
    }


    @Override
    public Boolean puedeRetirar(Double monto) {
        return getSaldo() + montoAutorizado >= monto;
    }

    @Override
    public Double gravarImpuesto(Double procentaje) {
        Double montoImpuesto = getSaldo() * procentaje;
        retirar(montoImpuesto);
        return montoImpuesto;
    }
}



