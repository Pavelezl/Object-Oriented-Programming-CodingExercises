public class Main {
    public static void main(String[] args) {

        Cuenta cuenta = new CuentaCorriente(new Cliente("pablo", 1),1000.0,500.0);

        cuenta.retirar(1200.0);

        cuenta.informarSaldo();

        Cliente cliente1 = new Cliente("Antonio", 1);
        Cliente cliente2 = new Cliente("Carolina", 300);
        Cliente cliente3 = new Cliente("Agustin", 8);

        System.out.println(cliente1.compareTo(cliente2));
        System.out.println(cliente2.compareTo(cliente3));

        System.out.println();


    }
}