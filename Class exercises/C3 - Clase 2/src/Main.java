import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");

        String nombre = scanner.nextLine();

        System.out.println("Ingresa tu edad");

        Integer edad = scanner.nextInt();

        System.out.println("nombre: " + nombre);
        System.out.println("Edad: " + edad);


        //Bucles

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
        System.out.println("Ingrese numero");
        Integer numero = scanner.nextInt();
        System.out.println("Ingrese numero");
        Integer numero2 = scanner.nextInt();

        if (esDivisible(numero, numero2)){
            System.out.println(numero + " es divisible por " + numero2);
        }else{
            System.out.println(numero + " no es divisible por " + numero2);
        }
    }

    //Funciones
    // Un numero es multiplo de otro

    public static Boolean esDivisible(Integer numero1, Integer numero2) {
        return numero1 % numero2 == 0;
    }
}



