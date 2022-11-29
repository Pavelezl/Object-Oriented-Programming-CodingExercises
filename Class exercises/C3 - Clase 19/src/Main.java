public class Main {
    public static void main(String[] args) {
    //Exercise of company and products, where we have to calculate the space needed for each of its products. Using the Singelton and the Factory
        Almacen almacen = new Almacen();

        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_CAJA10);
        almacen.agregarProducto(ProductoFactory.CODIGO_PELOTA_FUTBOL);


        System.out.println(almacen.calcularEspacioNecesario());
    }
}