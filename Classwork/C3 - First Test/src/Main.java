public class Main {
    public static void main(String[] args) {


        Embarcacion embarcacion = new Velero( new Capitan("Pablo", "VELEZ", 123),1000.0,500.0,2024,23.0,5);

        Embarcacion embarcacion1 = new Velero( new Capitan("Agustin", "Ferret", 123),1000.0,500.0,2019,26.0,3);

        embarcacion.calcularMontoAlquiler();
        System.out.println(embarcacion.calcularMontoAlquiler());

        System.out.println(embarcacion1.calcularMontoAlquiler());
    }
}