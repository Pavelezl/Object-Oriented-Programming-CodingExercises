import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //scanner
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingrese numero: ");

        /*Integer numero1 = scanner.nextInt();
        Integer numero2 = scanner.nextInt();
        Integer numero3 = scanner.nextInt();*/

        //System.out.println(esPrimo(numero));

        //System.out.println(maximoEntreTresNumeros(numero1, numero2, numero3));

        System.out.println("Ingrese primer cadena de texto: ");
        String texto1 = scanner.nextLine();
        System.out.println("Ingrese segunda cadena de texto: ");
        String texto2 = scanner.nextLine();

        System.out.println(cadenasDeTextoDistintas(texto1, texto2));

    }

    //funcion que me diga si un numero es multiplo de otro
    public static Boolean esDivisible(Integer numero1,Integer numero2){

        return numero1 % numero2 == 0;

    }

    //funcion que chequea si un numero es primo
    public static Boolean esPrimo(Integer numero){
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    //funcion que da maximo entre 3 numeros
    public static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        if(unNumeroA >= unNumeroB && unNumeroA >= unNumeroC){
            return unNumeroA;
        } else if (unNumeroB > unNumeroA && unNumeroB > unNumeroC) {
            return unNumeroB;
        }else {
            return unNumeroC;
        }
    }

    //funcion que compare 2 cadenas de texto
    public static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        if (unTextoA.equals(unTextoB)){
            return true;
        }
        return false;
    }
}
