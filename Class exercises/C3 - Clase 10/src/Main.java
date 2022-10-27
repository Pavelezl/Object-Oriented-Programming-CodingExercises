public class Main {
    public static void main(String[] args) {

        Socio socio = new Socio("1", "pablo", 2000.0, "Futbol");

        System.out.println(socio.calcularCostoMensual());

        SocioPileta socioPileta = new SocioPileta("2", "Agustin", 2000.0, "futbol", 500.0);

        System.out.println(socioPileta.calcularCostoMensual());
    }
}