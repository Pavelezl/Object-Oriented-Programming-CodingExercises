import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Pedir nombre del perro
        System.out.println("Como se llama el perro: ");
        String nombre = scanner.nextLine();
        //Pedir cuantoa kilos de comida necesita
        System.out.println("cuanto come el perro:");
        Double CantidadParaEstarLleno = scanner.nextDouble();

        //Crearla la funcion que pida la cantidad de paquete
        Integer cantidadPaquetes  = cuantosPaquetes(CantidadParaEstarLleno);
        System.out.println(nombre + " precisa " + cantidadPaquetes + " Paquetes");
    }

     //Funcion cuantos paquetes

    public static Integer cuantosPaquetes(Double CantidadParaEstarLleno){

        Scanner scanner = new Scanner(System.in);
        Double cantidadComida = 0.0;
        Integer cantidadDePaquetes = 0;
        while(CantidadParaEstarLleno >= cantidadComida){
            System.out.println("Cuanta comida tiene el paquete: ");
            Double comidaPaquete = scanner.nextDouble();
            cantidadComida += comidaPaquete; //cantidadComida = cantidadComida + comidaPaquete;
            cantidadDePaquetes++;
        }

        return cantidadDePaquetes;
    }
}