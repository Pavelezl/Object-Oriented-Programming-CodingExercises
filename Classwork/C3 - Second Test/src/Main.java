public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Pablo", "Vélez", 1234,"1993");

        LicenciaDeConducir licenciaDeConducir = new LicenciaMoto(persona,"12/12/2000", "12/12/2022", true, 2000);
        LicenciaDeConducir otralicencia = new LicenciaMoto(persona,"12/12/2000", "12/12/2022", false, 2100);

        System.out.println(licenciaDeConducir.puedeManejarAU());
        System.out.println(otralicencia.puedeManejarAU());

        LicenciaMoto licenciaMoto = (LicenciaMoto) licenciaDeConducir;
        LicenciaMoto otralicenciamoto = (LicenciaMoto) otralicencia;

        System.out.println(((LicenciaMoto) licenciaDeConducir).compareTo(otralicenciamoto));
    }
}