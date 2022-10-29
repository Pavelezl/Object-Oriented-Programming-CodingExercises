public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();

        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_PELOTA_FUTBOL);


        System.out.println(almacen.calcularEspacioNecesario());
    }
}