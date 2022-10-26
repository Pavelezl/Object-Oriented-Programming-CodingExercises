public class Main {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1,"camila");
        Cuenta cuenta2 = new Cuenta(1, "Pablo", 3000.0);

        cuenta.depositar(200.0);

        cuenta.depositar(500.0);

        cuenta.retirar(900.0);

        cuenta2.depositar(3000.0);

        cuenta.retirar(200.0);

        cuenta2.retirar(1500.0);

        cuenta.setTitular("Antonio");
        System.out.println(cuenta.getTitular());
    }
}