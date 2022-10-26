public class Main {
    public static void main(String[] args) {

        Impresora impresora2 = new Impresora("HP", "USB","06/08/1993");

        impresora2.agregarHojas(5);
        impresora2.imprimir("hola");
        impresora2.imprimirMuchos("chao", 10);
    }
}