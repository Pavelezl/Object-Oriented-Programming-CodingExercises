public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(123, "pe", 123, 156);
//        CajaDeAhorro cuentraPrueba = new CajaDeAhorro(1.2, cliente);
//
//        cuentraPrueba.depositar(123035416.0);
//
//        cuentraPrueba.extraer(123035415.0);
//        cuentraPrueba.getSaldo();
//
//
//        CajaDeAhorro cuentaPrueba = new CajaDeAhorro(0.5, cliente);
//
//        cuentaPrueba.depositar(1000.0);
//        cuentaPrueba.extraer(950.0);
//        cuentaPrueba.getSaldo();

//        CuentaCorriente nuevaCuenta = new CuentaCorriente(5000.0, cliente);

//        nuevaCuenta.depositar(5000.0);
//        nuevaCuenta.extraer(1000.0);
//        nuevaCuenta.getMonto();
//        nuevaCuenta.extraer(5000.0);
//        nuevaCuenta.getMonto();
//        nuevaCuenta.extraer(15000.0);
//        nuevaCuenta.getMonto();
//        nuevaCuenta.getSaldo();

        Cuenta cuenta = new CuentaComitente("1234", cliente);

        cuenta.depositar(1000.0);
        cuenta.getSaldo();
        cuenta.extraer(100.0);
        ((CuentaComitente) cuenta).extraerConClave(500.0, "1234");
        ((CuentaComitente) cuenta).extraerConClave(500.0, "4321");
        ((CuentaComitente) cuenta).extraerConClave(1500.0, "1234");
        cuenta.getSaldo();

    }
}