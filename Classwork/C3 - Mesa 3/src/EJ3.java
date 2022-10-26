import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad");
        Integer n = scanner.nextInt();
        Boolean x = true;
        Integer acumulador = 0;

        for (int i = 1; i <= ((n * n) / 2.8); i++) {
            if (esPrimo(i)) {
                System.out.println(i);
                acumulador++;
            }
        }
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}